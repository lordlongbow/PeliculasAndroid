package com.example.peliculas;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private int portada;
    private String descripcion;
    private String director;
    private String actores;

    public Pelicula(String titulo, int portada, String descripcion, String director, String actores) {
        this.titulo = titulo;
        this.portada = portada;
        this.descripcion = descripcion;
        this.director = director;
        this.actores = actores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }
}
