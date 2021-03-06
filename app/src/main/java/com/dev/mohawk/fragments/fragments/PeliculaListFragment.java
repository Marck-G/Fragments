package com.dev.mohawk.fragments.fragments;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dev.mohawk.fragments.R;
import com.dev.mohawk.fragments.adapters.PeliculaAdapter;
import com.dev.mohawk.fragments.items.Pelicula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class PeliculaListFragment extends Fragment {

    private ItemSelectedListener listener;

    private ListView l;

    @Nullable
    @Override
    public View onCreateView( @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        return inflater.inflate( R.layout.list_fragment, container, false );

    }

    @RequiresApi( api = Build.VERSION_CODES.LOLLIPOP )
    @Override
    public void onActivityCreated( @Nullable Bundle savedInstanceState ) {
        super.onActivityCreated( savedInstanceState );

        l = getView().findViewById( R.id.list );

	    Pelicula[] datos;
	    datos = new Pelicula[]{
	    		new Pelicula( getContext() )
					    .setTitulo( "Avengers: Infinity War" )
					    .setCover( R.mipmap.ic_infinity )
					    .setResumen( "The Avengers and their allies must be willing to " +
					    "sacrifice all in an attempt to defeat the powerful Thanos before his blitz of " +
					    "devastation and ruin puts an end to the universe." )
					    .setActores( new String[]{ "Robert Downey Jr", "Chris Hemsworth" }  )
					    .setFecha( new Date( 2018, 2, 20 ) )
			            .setIdioma( "Español" )
	    };
	    PeliculaAdapter ad = new PeliculaAdapter( getContext(), datos );

	    l.setAdapter( ad );
	    l.setOnItemClickListener( new AdapterView.OnItemClickListener() {
		    @Override
		    public void onItemClick( AdapterView<?> parent, View view, int position, long id ) {
			   if( listener != null )
				   listener.itemSelected( ( Pelicula ) l.getAdapter().getItem( position ) );
		    }
	    } );

    }

    public interface ItemSelectedListener{
        public void itemSelected( Pelicula pelicula );
    }

    public PeliculaListFragment setItemSelectdListener( ItemSelectedListener listener ){
        this.listener = listener;
        return this;
    }

}
