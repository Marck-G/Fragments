package com.dev.mohawk.fragments.items;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pelicula {
    private String titulo;
    private String resumen;
    private Drawable cover;
    private Date fecha;
    private String idioma;
    private String[] actores;
    private int img_id;
    private Context c;

    public Pelicula( Context context ) {
        c = context;
    }

    public String getTitulo() {
        return titulo;
    }

    public Pelicula setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getResumen() {
        return resumen;
    }

    public Pelicula setResumen(String resumen) {
        this.resumen = resumen;
        return this;
    }

    public Drawable getCover() {
        return cover;
    }

    public int getImg_id() {
        return img_id;
    }

    @RequiresApi( api = Build.VERSION_CODES.LOLLIPOP )
    public Pelicula setCover( int img_id ) {
        this.img_id = img_id;
        this.cover = c.getDrawable( img_id );
        return this;
    }

    public String getFecha() {
        SimpleDateFormat d = new SimpleDateFormat( "dd/mm/yy" );
        return d.format( this.fecha );
    }

    public Pelicula setFecha(Date fecha) {
        this.fecha = fecha;
        return this;
    }

    public String getIdioma() {
        return idioma;
    }

    public Pelicula setIdioma(String idioma) {
        this.idioma = idioma;
        return this;
    }

    public String[] getActores() {
        return actores;
    }

    public Pelicula setActores( String[] actores) {
        this.actores = actores;
        return this;
    }

    public String[] getInfo(){
        return  new String[]{ getTitulo(), getResumen() , getFecha(), getIdioma() };
    }
}
