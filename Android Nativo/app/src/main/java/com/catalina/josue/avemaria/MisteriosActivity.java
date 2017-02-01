package com.catalina.josue.avemaria;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by josue on 05/07/2015.
 */
public class MisteriosActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.misterios);

        Calendar calendar = Calendar.getInstance();
        int numeroDia = calendar.get(Calendar.DAY_OF_WEEK);
        ListView lista = (ListView) findViewById(R.id.listaMisterios);
        TextView txtTitulo = (TextView) findViewById(R.id.textView3);
        TextView txtDia = (TextView) findViewById(R.id.diaMisterio);

        if (numeroDia == 1 || numeroDia == 4){
            // dia domingo o miercoles
            txtDia.setText("Miercoles - Domingo");

            txtTitulo.setText("Misterios Gloriosos");
            ArrayList<Misterio> ly_misterios = new ArrayList<>();

            Misterio mis = new Misterio();
            mis.setTitulo("Primer Misterio Glorioso");
            mis.setNombre("LA RESURRECCION");
            mis.setCita("Pero él les dijo: No teneis que asustaros: " +
                    "vosotros venis a buscar a Jesus de Nazaret, " +
                    "que fue crucificado, ya resucitó no esta aqui mirad " +
                    "el lugar donde lo pusieron (San Marcos 16,6)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA FE");

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Segundo Misterio Glorioso");
            mis.setNombre("LA ASCENSIÓN");
            mis.setCita("Asi, el Señor Jesus, despues de haberles hablado varias veces, " +
                    "fue elevado al cielo por su propia virtud, y está alli sentado a la diestra de Dios. (San Marcos 16, 19)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA ESPERANZA");

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Tercer Misterio Glorioso");
            mis.setNombre("LA VENIDA DEL ESPIRITU SANTO");
            mis.setCita("Entonces fueron llenados todos del Espiritu Santo y comenzaron a hablar en nuevas lenguas " +
                    "las palabras que el Espiritu Santo ponia en su boca. (Hechos de los Apostoles 2,4)");
            mis.setFruto("EL FRUTO DEL MISTERIO: EL AMOR A DIOS");

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Cuarto Misterio Glorioso");
            mis.setNombre("LA ASUNCION DE LA BIENAVENTURADA VIRGEN MARIA");
            mis.setCita("Y en esto apareció un gran prodigio en el cielo una mujer vestida de sol," +
                    " y la luna debajo de sus pies, y en su cabeza una corona de doce estrellas. (Apocalipsis 12, 1)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA GRACIA DE UNA MUERTE FELIZ");

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Quinto Misterio Glorioso");
            mis.setNombre("LA CORONACION DE NUESTRA SEÑORA");
            mis.setCita("Tu eres la gloria de Jerusalen, tu la alegria de Israel, " +
                    "tu la honra de nuestra nacion. " +
                    "Porque te has portado con varonil esfuerzo, y has tenido un corazon constante. (Judith 15, 9-11");
            mis.setFruto("EL FRUTO DEL MISTERIO: CONFIANZA EN LA INTERCESION DE MARIA");

            ly_misterios.add(mis);

            MisterioListaAdapter misteriosAdapter = new MisterioListaAdapter(this,ly_misterios);
            lista.setAdapter(misteriosAdapter);


        }
        if (numeroDia == 2 || numeroDia == 7 ){
            // dia lunes o sabado

            txtDia.setText("Lunes - Sabado");
            txtTitulo.setText("Misterios Gozosos");
            ArrayList<Misterio> ly_misterios = new ArrayList<>();

            Misterio mis = new Misterio();
            mis.setTitulo("Primer Misterio Gozoso");
            mis.setNombre("LA ANUNCIACION");
            mis.setCita("Y habiendo entrado el ángel a donde ella estaba, " +
                    "le dijo: Dios te salve llena eres de gracia, " +
                    "el Señor es contigo: bendita tú eres entre las mujeres. (San Lucas 1,28)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA HUMILDAD");
            mis.setImagen(getResources().getIdentifier("gozo1", "drawable", getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Segundo Misterio Gozoso");
            mis.setNombre("LA VISITACION");
            mis.setCita("Lo mismo fue oir la salutacion de Maria, " +
                    "que la criatura dar saltos de placer en su vientre; " +
                    "y exclamando en alta voz dijo a Maria; Bendita tu eres entre todas las mujeres " +
                    "y bendito es el fruto de tu vientre. (San Lucas 1, 41-42) ");
            mis.setFruto("EL FRUTO DEL MISTERIO: EL AMOR AL PROJIMO");
            mis.setImagen(getResources().getIdentifier("gozo2","drawable",getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Tercer Misterio Gozoso");
            mis.setNombre("EL NACIMIENTO DE JESÚS");
            mis.setCita("Y dio a luz a su hijo primogenito, " +
                    "y envolviolo en pañales y lo recostó en un pesebre por que no hubo lugar para ellos en la posada. " +
                    "(San Lucas 2,7)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA POBREZA");
            mis.setImagen(getResources().getIdentifier("gozo3","drawable",getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Cuarto Misterio Gozoso");
            mis.setNombre("LA PRESENTACION");
            mis.setCita("Cumplido, asi mismo, el tiempo de la purrificacion de la madre, " +
                    "segun la ley de Moises llevaron al Niño a Jerusalen para presentarlo al Señor, " +
                    "como esta escrito en la ley del Señor. Todo primogenito varon sera consagrado al Señor. (San Lucas 2, 22-23)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA OBEDIENCIA");
            mis.setImagen(getResources().getIdentifier("gozo4","drawable",getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Quinto Misterio Gozoso");
            mis.setNombre("EL NIÑO PERDIDO Y HALLADO EN EL TEMPLO");
            mis.setCita("Y al cabo de tres dias de haberle perdido le hallaron en el templo, " +
                    "sentado en medio de los doctores a quienes escuchaban y preguntaban. (San Lucas 2,46)");
            mis.setFruto("EL FRUTO DEL MISTERIO: EL GOZO DE HALLAR A JESUS");
            mis.setImagen(getResources().getIdentifier("gozo5","drawable",getPackageName()));

            ly_misterios.add(mis);

            MisterioListaAdapter misteriosAdapter = new MisterioListaAdapter(this,ly_misterios);
            lista.setAdapter(misteriosAdapter);
        }
        if (numeroDia == 3 || numeroDia == 6){
            // dia martes o viernes

            txtDia.setText("Martes - Viernes");

            txtTitulo.setText("Misterios Dolorosos");
            ArrayList<Misterio> ly_misterios = new ArrayList<>();

            Misterio mis = new Misterio();
            mis.setTitulo("Primer Misterio Doloroso");
            mis.setNombre("LA ORACION EN EL HUERTO");
            mis.setCita("Y viniendole un sudor como de gotas de sangre que chorreaba hasta el suelo." +
                    " Y levantandose de la oracion, y viniendo a sus discipulos los halló dormidos por causa de la tristeza." +
                    " (San Lucas 22, 44-47)");
            mis.setFruto("EL FRUTO DEL MISTERIO: EL DOLOR POR EL PECADO");
            mis.setImagen(getResources().getIdentifier("dolor1", "drawable", getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Segundo Misterio Doloroso");
            mis.setNombre("LA FLAGELACION");
            mis.setCita("Tomo entonces Pilato a Jesús, y mandó a azotarlo (San Juan 19, 1)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA PERSEVERANCIA");
            mis.setImagen(getResources().getIdentifier("dolor2", "drawable", getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Tercer Misterio Doloroso");
            mis.setNombre("LA CORONACION DE ESPINAS");
            mis.setCita("Y desnudandole le cubrieron con un manto de grana; entretejiendo una corona de espinas, se la pusieron sobre la cabeza y una caña por cetro en su mano derecha. Y con la rodilla doblada en la tierra, le encarnecian, diciendo: Dios te salve Rey de los judios. (San Mateo 27, 28-29)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA FORTALEZA");
            mis.setImagen(getResources().getIdentifier("dolor3", "drawable", getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Cuarto Misterio Doloroso");
            mis.setNombre("JESUS CON LA CRUZ A CUESTAS");
            mis.setCita("Y llevando El Mismo a cuestas su cruz fue caminando hacia el sitio llamado el Calvario, en Hebreo Golgota. (San Juan 19, 17)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA PACIENCIA");
            mis.setImagen(getResources().getIdentifier("dolor4", "drawable", getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Quinto Misterio Doloroso");
            mis.setNombre("LA CRUCIFIXION");
            mis.setCita("Entonces Jesus, clamando con una voz muy grande dijo: Padre mio, en tus manos encomiendo mi espiritu, y diciendo esto expiro. (San Mateo 27,46)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA PUREZA");
            mis.setImagen(getResources().getIdentifier("dolor5","drawable",getPackageName()));

            ly_misterios.add(mis);


            MisterioListaAdapter misteriosAdapter = new MisterioListaAdapter(this,ly_misterios);
            lista.setAdapter(misteriosAdapter);

        }
        if (numeroDia == 5){
            // dia jueves

            txtDia.setText("Jueves");
            txtTitulo.setText("Misterios Luminosos");
            ArrayList<Misterio> ly_misterios = new ArrayList<>();

            Misterio mis = new Misterio();
            mis.setTitulo("Primer Misterio Luminoso");
            mis.setNombre("JESUS ES BAUTIZADO EN EL JORDAN");
            mis.setCita("Y se oyo una voz en el cielo que decia: este es mi hijo amado en quien tengo mis complacencias. (Mt, 3, 7)");
            mis.setFruto("EL FRUTO DEL MISTERIO: HACER LA VOLUNTAD DE DIOS");
            mis.setImagen(getResources().getIdentifier("lum1", "drawable", getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Segundo Misterio Luminoso");
            mis.setNombre("LA AUTO REVELACION EN LAS BODAS DE CANA");
            mis.setCita("Dijo entonces la madre a los servidores: haced lo que Él os diga. (Jn, 2,5)");
            mis.setFruto("EL FRUTO DEL MISTERIO: SEGUIR A JESUS");
            mis.setImagen(getResources().getIdentifier("lum2", "drawable", getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Tercer Misterio Luminoso");
            mis.setNombre("JESUS ANUNCIA EL REINO DE DIOS INVITANDO A LA CONVERSION");
            mis.setCita("Viendo Jesus la fe de ellos dijo al Paralitico: hijo tus pecados te son perdonados. (M. 2,5)");
            mis.setFruto("EL FRUTO DEL MISTERIO: LA EVANGELIZACION");
            mis.setImagen(getResources().getIdentifier("lum3", "drawable", getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Cuarto Misterio Luminoso");
            mis.setNombre("LA TRANSFIGURACION");
            mis.setCita("Y salio de la nube una voz que dijo: este es mi hijo elegido. Escuchadle. (Lc. 9,35)");
            mis.setFruto("EL FRUTO DEL MISTERIO: IMITAR A JESUS");
            mis.setImagen(getResources().getIdentifier("lum4", "drawable", getPackageName()));

            ly_misterios.add(mis);

            mis = new Misterio();
            mis.setTitulo("Quinto Misterio Luminoso");
            mis.setNombre("LA INSTITUCION DE LA EUCARISTIA");
            mis.setCita("Así mismo el cáliz, despues de haber cenado, diciendo: Esta es mi nueva alianza en mi sangre, que es derramada por vosotros. (Lc. 22,20)");
            mis.setFruto("EL FRUTO DEL MISTERIO: EL AMOR A LA EUCARISTIA");
            mis.setImagen(getResources().getIdentifier("lum5","drawable",getPackageName()));

            ly_misterios.add(mis);

            MisterioListaAdapter misteriosAdapter = new MisterioListaAdapter(this,ly_misterios);
            lista.setAdapter(misteriosAdapter);

        }
    }

}
