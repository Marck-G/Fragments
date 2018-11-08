package com.dev.mohawk.fragments.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.mohawk.fragments.R;
import com.dev.mohawk.fragments.items.Pelicula;

public final class PeliculaAdapter extends ArrayAdapter {

    private Pelicula[] datos;

    public PeliculaAdapter(@NonNull Context context, Pelicula[] resource) {
        super(context, R.layout.pelicula_item, resource);
        datos = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int i = position;
        LayoutInflater f= LayoutInflater.from( getContext() );
        View v = f.inflate( R.layout.pelicula_item, null );

        TextView title = v.findViewById( R.id.item_title );
        TextView desc = v.findViewById( R.id.item_description );
        ImageView img = v.findViewById( R.id.item_img );

        title.setText( datos[i].getTitulo() );
        desc.setText( datos[i].getResumen().substring( 0, 20 ) + "..." );
        img.setImageDrawable( datos[i].getCover() );

        return v;
    }
}
