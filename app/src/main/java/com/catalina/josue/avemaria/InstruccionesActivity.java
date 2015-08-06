package com.catalina.josue.avemaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by josue on 05/07/2015.
 */
public class InstruccionesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instrucciones);

        ListView lista = (ListView) findViewById(R.id.listaInstrucciones);
        ArrayList<Instruccion> ly_instrucciones = new ArrayList<>();
        Instruccion ins = new Instruccion();

        ins.setTextoLargo("Señal de la Cruz");
        ins.setTextoCorto("Haga la señal de la cruz (Frente, Abdomen, hombro izquierdo, hombro derecho) y recite el credo");
        ly_instrucciones.add(ins);

        ins = new Instruccion();
        ins.setTextoLargo("Padre Nuestro");
        ins.setTextoCorto("Recite el padre Nuestro");
        ly_instrucciones.add(ins);

        ins = new Instruccion();
        ins.setTextoLargo("Tres Ave Marias");
        ins.setTextoCorto("Recite tres Ave Marias");
        ly_instrucciones.add(ins);

        ins = new Instruccion();
        ins.setTextoLargo("Gloria al Padre");
        ins.setTextoCorto("Recite: Gloria al Padre, y al Hijo y al Espiritu Santo, como era en un principio, ahora y siempre por los siglos de los siglos. Amen");
        ly_instrucciones.add(ins);

        ins = new Instruccion();
        ins.setTextoLargo("Misterios");
        ins.setTextoCorto("Anuncie el primer misterio y recite el Padre Nuestro, Diez Ave Marias mientras medita en el misterio, y el Gloria al padre");
        ly_instrucciones.add(ins);

        ins = new Instruccion();
        ins.setTextoLargo("Oracion de la Virgen en Fatima");
        ins.setTextoCorto("Recite la oracion siguiente como la pidió la Virgen Maria en Fatima");
        ly_instrucciones.add(ins);

        ins = new Instruccion();
        ins.setTextoLargo("La Salve");
        ins.setTextoCorto("Recite La Salve despues de terminar 5 decenas");
        ly_instrucciones.add(ins);


        ins = new Instruccion();
        ins.setTextoLargo("Despedida");
        ins.setTextoCorto("Recite La oración de despedida");
        ly_instrucciones.add(ins);


        IntroListaAdapter adaptador = new IntroListaAdapter(this,ly_instrucciones);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 4){
                    Intent intento = new Intent(InstruccionesActivity.this, MisteriosActivity.class);
                    InstruccionesActivity.this.startActivity(intento);

                }else {
                    Intent intento = new Intent(InstruccionesActivity.this, OracionesActivity.class);
                    intento.putExtra("codigo",position);
                    InstruccionesActivity.this.startActivity(intento);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
