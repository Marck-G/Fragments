package com.dev.mohawk.fragments.fragments;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.mohawk.fragments.PeliculaDetallada;
import com.dev.mohawk.fragments.R;
import com.dev.mohawk.fragments.items.Pelicula;

public class PeliculaFragment extends Fragment {

	@Nullable
	@Override
	public View onCreateView( @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {
		return inflater.inflate( R.layout.pelicula_detail, container, false );
	}

	@RequiresApi( api = Build.VERSION_CODES.LOLLIPOP )
	public void crearVista( Intent i ){
//		Cogemos la informacion del intent
		int imgID = i.getExtras().getInt( PeliculaDetallada.IMAGE_ID );
		Drawable img = getContext().getDrawable( imgID );
		String[] actore = i.getExtras().getStringArray(  PeliculaDetallada.CAST_ID );
		String[] info = i.getExtras().getStringArray(  PeliculaDetallada.INFO_ID );

//      cogemos la vistas
		TextView titulo = getView().findViewById( R.id.film_title );
		TextView resumen = getView().findViewById( R.id.film_sumary );
		TextView idioma = getView().findViewById( R.id.film_lang );
		TextView date = getView().findViewById( R.id.film_date );
		TextView cast = getView().findViewById( R.id.film_cast );
		ImageView cover = getView().findViewById( R.id.film_cover );

//		Colocamos los datos
		titulo.setText( info[0] );
		resumen.setText( info[1] );
		date.setText( info[2] );
		idioma.setText( info[3] );
		String actText = "";
		for( String act : actore ){
			actText += act + "\n";
		}
		cast.setText( actText );
		cover.setImageDrawable( img );
	}

	public void crearVista( Pelicula p ){
//		cogemos la vistas
		TextView titulo = getView().findViewById( R.id.film_title );
		TextView resumen = getView().findViewById( R.id.film_sumary );
		TextView idioma = getView().findViewById( R.id.film_lang );
		TextView date = getView().findViewById( R.id.film_date );
		TextView cast = getView().findViewById( R.id.film_cast );
		ImageView cover = getView().findViewById( R.id.film_cover );

//		Colocamos los datos
		titulo.setText( p.getTitulo() );
		resumen.setText( p.getResumen() );
		date.setText( p.getFecha() );
		idioma.setText( p.getFecha() );
		String actText = "";
		for( String act : p.getActores() ){
			actText += act.toString() + "\n";
		}
		cast.setText( actText );
		cover.setImageDrawable( p.getCover() );
	}

}
