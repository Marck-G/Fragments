package com.dev.mohawk.fragments.items;

import android.graphics.drawable.Drawable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pelicula {
    private String titulo;
    private String resumen;
    private Drawable cover;
    private Date fecha;
    private String idioma;
    private String[] actores;

    public Pelicula() {
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

    public Pelicula setCover(Drawable cover) {
        this.cover = cover;
        return this;
    }

    public String getFecha() {
        SimpleDateFormat d = new SimpleDateFormat( "dd MMMM yyyy" );
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
}
