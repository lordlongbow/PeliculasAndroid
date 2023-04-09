package com.example.peliculas;
/*
import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelStore;
import android.arch.lifecycle.ViewModelStoreOwner;*/

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private ArrayList<Pelicula> listafilms = new ArrayList<>();

    public List<Pelicula> getListaFilms(){
        listafilms.add(new Pelicula("Avengers Endgame", R.drawable.avengers,"Tercer entrega de la saga de The Avengers de marvel", "Joe y Anthony Russo", "RD jr, Chriss Evans, Jeremy Renner"));
        listafilms.add(new Pelicula("Batman", R.drawable.batman,"Historia de origen de Batman luchando contra el crimen", "Christopher Nolan", "Christian Bale, Michael Caine, Liam Nesson"));
        listafilms.add(new Pelicula("El Señor de los Anillos", R.drawable.senior,"Pelicula bassada en los libros de J.R.R. Tolkien ", "Peter Jackson", "Elijah Hood, Viggo Mortensen, Cate Blanchett"));
        listafilms.add(new Pelicula("MadMax", R.drawable.madmax,"Pelicula apocaliptica futurista", "George Miller", "Tom hardy, Charlize Theron, nicholas Hoult"));
        listafilms.add(new Pelicula("Sinsajo", R.drawable.sinsajo,"Tercer entrega de la saga de los juegos del hambre", "Fracis Lawrece", "Jenifer Lawrence, Josh Hutcherson, Philip Hoffman"));
        return listafilms;
    }
}
