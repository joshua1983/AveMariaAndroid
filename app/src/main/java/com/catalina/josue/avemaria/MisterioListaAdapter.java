package com.catalina.josue.avemaria;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by josue on 07/07/2015.
 */
public class MisterioListaAdapter extends ArrayAdapter {
    private  Context context = null;
    private  ArrayList<Misterio> misterios = null;

    public MisterioListaAdapter(Context context, int resource) {
        super(context, resource);
    }

    public MisterioListaAdapter(Context context, ArrayList valores){
        super(context, R.layout.filalayout,  valores);
        this.context = context;
        this.misterios = valores;
    }

    @Override
    public View getView(int posicion, View convertView,  ViewGroup grupo){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.misteriolayout, null);

        Misterio ins = misterios.get(posicion);

        TextView txtTitulo = (TextView) rowView.findViewById(R.id.tituloMisterio);
        txtTitulo.setText(ins.getTitulo());
        final TextView txtNombre = (TextView) rowView.findViewById(R.id.nombreMisterio);
        txtNombre.setText(ins.getNombre());
        TextView txtCita = (TextView) rowView.findViewById(R.id.citaMisterio);
        txtCita.setText(ins.getCita());
        TextView txtFruto = (TextView) rowView.findViewById(R.id.frutoMisterio);
        txtFruto.setText(ins.getFruto());
        ImageView viewImg = (ImageView) rowView.findViewById(R.id.imageView2);
        viewImg.setImageResource(ins.getImagen());

        final TextView txtNumero = (TextView)rowView.findViewById(R.id.contadorRosarios);

        if (txtNumero != null){

            Button btn_mas = (Button) rowView.findViewById(R.id.rosMas);
            btn_mas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int cantRosarios = Integer.parseInt( txtNumero.getText().toString() );
                    if (cantRosarios < 10 && cantRosarios > -1){
                        cantRosarios++;
                        txtNumero.setText(String.valueOf(cantRosarios));
                    }
                }
            });
            Button btn_menos = (Button) rowView.findViewById(R.id.rosMen);
            btn_menos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int cantRosarios = Integer.parseInt( txtNumero.getText().toString() );
                    if ( cantRosarios > 0){
                        cantRosarios--;
                        txtNumero.setText(String.valueOf(cantRosarios));
                    }
                }
            });

        }



        return rowView;
    }
}
