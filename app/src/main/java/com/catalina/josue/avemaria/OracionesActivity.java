package com.catalina.josue.avemaria;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by josue on 08/07/2015.
 */
public class OracionesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oraciones);
        int oracion = 0;

        if (savedInstanceState == null){
            Bundle parametros = getIntent().getExtras();
            if (parametros==null){
                oracion = -1;
            }
            else{
                oracion = parametros.getInt("codigo");
            }
        }else{
            oracion = (Integer) savedInstanceState.getSerializable("codigo");
        }

        TextView txtTitulo = (TextView) findViewById(R.id.txtNombreOracion);
        TextView txtOracion = (TextView) findViewById(R.id.txtOracion);

        switch(oracion){
            case 1:
                txtTitulo.setText("Padre Nuestro");
                txtOracion.setText("Padre nuestro,\n" +
                        "que estás en el cielo,\n" +
                        "santificado sea tu Nombre;\n" +
                        "venga a nosotros tu reino;\n" +
                        "hágase tu voluntad \n" +
                        "en la tierra como en el cielo.\n" +
                        "\n" +
                        "Danos hoy nuestro pan de cada día;\n" +
                        "perdona nuestras ofensas,\n" +
                        "como también nosotros perdonamos \n" +
                        "a los que nos ofenden;\n" +
                        "no nos dejes caer en la tentación,\n" +
                        "y líbranos del mal. Amén.");
                break;
            case 2:
                txtTitulo.setText("Ave Maria");
                txtOracion.setText("Dios te salve María\n" +
                        "llena eres de gracia\n" +
                        "el Señor es contigo;\n" +
                        "bendita tú eres \n" +
                        "entre todas las mujeres,\n" +
                        "y bendito es el fruto \n" +
                        "de tu vientre, Jesús. \n" +
                        "Santa María, Madre de Dios,\n" +
                        "ruega por nosotros, pecadores,\n" +
                        "ahora y en la ahora\n" +
                        "de nuestra muerte. Amén");
                break;
            case 3:
                txtTitulo.setText("Gloria al Padre");
                txtOracion.setText("Gloria al Padre, y al Hijo, y al Espíritu\n" +
                        "Santo. Como era en el principio, ahora\n" +
                        "y siempre, por los siglos de los siglos. \n" +
                        "Amén.");
                break;
            case 5:
                txtTitulo.setText("Oracion de Virgen Maria en Fatima");
                txtOracion.setText("Oh mi buen Jesus, perdona nuestros pecados, libranos del fuego del infierno, y lleva todas las almas al cielo, especialmente las mas necesitadas de tu misericordia");
                break;
            case 6:
                txtTitulo.setText("La Salve");
                txtOracion.setText("Dios te salve, Reina y Madre de misericordia, \n" +
                        "vida, dulzura y esperanza nuestra. \n" +
                        "Dios te salve. \n" +
                        "A Tí clamamos los desterrados hijos de Eva, \n" +
                        "a Tí suspiramos, gimiendo y llorando en este valle de lágrimas. \n" +
                        "Ea, pues, Señora Abogada Nuestra, \n" +
                        "vuelve a nosotros tus ojos misericordiosos, \n" +
                        "y después de este destierro, muéstranos a Jesús,\n" +
                        "fruto bendito de tu vientre.\n" +
                        "Oh, clemente, oh piadosa, oh dulce Virgen María. \n" +
                        "Ruega por nosotros, Santa Madre de Dios, \n" +
                        "para que seamos dignos de alcanzar\n" +
                        "las promesas de Nuestro Señor Jesucristo. Amén.");
                break;
            case 7:
                txtTitulo.setText("Oracion de despedida");
                txtOracion.setText("Dulce Madre no te alejes, tu vista de nosotros no apartes, ven con nosotros a todas partes y solos nunca nos dejes, y ya que nos quieres tanto como verdadera Madre, haz que nos bendiga \n" +
                        "él Padre, él Hijo y él Espiritu Santo. Amen");
                break;
            case 0:
                txtTitulo.setText("Credo");
                txtOracion.setText("\"Creo en un solo Dios, Padre todopoderoso, \n" +
                        "Creador del cielo y de la tierra, \n" +
                        "de todo lo visible y lo invisible.\n" +
                        "Creo en un solo Señor, Jesucristo, \n" +
                        "Hijo único de Dios, nacido del Padre antes de todos los siglos: \n" +
                        "Dios de Dios, Luz de Luz, Dios verdadero de Dios verdadero, \n" +
                        "engendrado, no creado, de la misma naturaleza del Padre, \n" +
                        "por quien todo fue hecho; \n" +
                        "que por nosotros lo hombres, \n" +
                        "y por nuestra salvación bajó del cielo, \n" +
                        "y por obra del Espíritu Santo se encarnó de María, la Virgen, \n" +
                        "y se hizo hombre; \n" +
                        "y por nuestra causa fue crucificado \n" +
                        "en tiempos de Poncio Pilato; \n" +
                        "padeció y fue sepultado, \n" +
                        "y resucitó al tercer día, según las Escrituras, \n" +
                        "y subió al cielo, \n" +
                        "y está sentado a la derecha del Padre; \n" +
                        "y de nuevo vendrá con gloria \n" +
                        "para juzgar a vivos y muertos, \n" +
                        "y su reino no tendrá fin. \n" +
                        "Creo en el Espíritu Santo, \n" +
                        "Señor y dador de vida, \n" +
                        "que procede del Padre y del Hijo, \n" +
                        "que con el Padre y el Hijo \n" +
                        "recibe una misma adoración y gloria, \n" +
                        "y que habló por los profetas. \n" +
                        "Creo en la Iglesia, que es una, santa, católica y apostólica.\n" +
                        "Confieso que hay un solo bautismo \n" +
                        "para el perdón de los pecados. \n" +
                        "Espero la resurrección de los muertos \n" +
                        "y la vida del mundo futuro. \n" +
                        "Amén.");
                break;

        }


    }
}
