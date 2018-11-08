package com.dev.mohawk.fragments;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.dev.mohawk.fragments.fragments.PeliculaFragment;

public class PeliculaDetallada extends AppCompatActivity {

	public static final String INFO_ID = "_info";
	public static final String IMAGE_ID = "_cover";
	public static final String CAST_ID = "_cast";
	@RequiresApi( api = Build.VERSION_CODES.LOLLIPOP )
	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_pelicula_detallada );


		PeliculaFragment f = ( PeliculaFragment ) getSupportFragmentManager().findFragmentById( R.id.peli_detallada );
		f.crearVista( getIntent() );

//


	}
}
