package com.catalina.josue.avemaria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by josue on 05/07/2015.
 */
public class IntroListaAdapter extends ArrayAdapter {
    private  Context context = null;
    private  ArrayList<Instruccion> valores = null;

    public IntroListaAdapter(Context context, int resource) {
        super(context, resource);
    }

    public IntroListaAdapter(Context context, ArrayList valores){
        super(context, R.layout.filalayout,  valores);
        this.context = context;
        this.valores = valores;
    }

    @Override
    public View getView(int posicion, View convertView,  ViewGroup grupo){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.filalayout, null);

        Instruccion ins = valores.get(posicion);

        TextView txtLargo = (TextView) rowView.findViewById(R.id.textView);
        txtLargo.setText(ins.getTextoLargo());
        TextView txtCorto = (TextView) rowView.findViewById(R.id.textView2);
        txtCorto.setText(ins.getTextoCorto());


        return rowView;
    }


}
