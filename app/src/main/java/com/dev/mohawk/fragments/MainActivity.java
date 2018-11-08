package com.dev.mohawk.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dev.mohawk.fragments.fragments.PeliculaFragment;
import com.dev.mohawk.fragments.fragments.PeliculaListFragment;
import com.dev.mohawk.fragments.items.Pelicula;

public class MainActivity extends AppCompatActivity  implements PeliculaListFragment.ItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PeliculaListFragment f = ( PeliculaListFragment ) getSupportFragmentManager().findFragmentById( R.id.main );
        f.setItemSelectdListener( this );

    }


    @Override
    public void itemSelected( Pelicula pelicula ) {
            boolean isFragment = getSupportFragmentManager().findFragmentById( R.id.peli_detallada ) != null;
            if ( isFragment ){
                ( ( PeliculaFragment ) getSupportFragmentManager().findFragmentById( R.id.peli_detallada ) ).crearVista( pelicula );
            }
            else{
                Intent i = new Intent( this, PeliculaDetallada.class );
                i.putExtra( PeliculaDetallada.CAST_ID, pelicula.getActores() );
                i.putExtra( PeliculaDetallada.IMAGE_ID, pelicula.getImg_id() );
                i.putExtra( PeliculaDetallada.INFO_ID, pelicula.getInfo() );
                startActivity( i );
            }
    }
}
