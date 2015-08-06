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
                txtOracion.setText("Creo en Dios, Padre Todopoderoso,\n" +
                        "Creador del cielo y de la tierra.\n" +
                        "Creo en Jesucristo, su único Hijo,\n" +
                        "Nuestro Señor,\n" +
                        "Que fue concebido por obra y gracia \n" +
                        "del Espíritu Santo, \n" +
                        "nació de Santa María Virgen, \n" +
                        "padeció bajo el poder de Poncio Pilato, \n" +
                        "fue crucificado, muerto y sepultado, \n" +
                        "descendió a los infiernos, \n" +
                        "al tercer día resucitó de entre los muertos, subió a los cielos\n" +
                        "y está sentado a la derecha de Dios, \n" +
                        "Padre todopoderoso. \n" +
                        "Desde allí ha de venir\n" +
                        "a juzgar a vivos y muertos.\n" +
                        "Creo en el Espíritu Santo,\n" +
                        "la santa Iglesia católica, \n" +
                        "la comunión de los santos,\n" +
                        "el perdón de los pecados, \n" +
                        "la resurrección de la carne\n" +
                        "y la vida eterna.\n" +
                        "Amén.");
                break;

        }


    }
}
