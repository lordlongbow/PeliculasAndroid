package com.example.peliculas;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class InfoActivityViewModel extends AndroidViewModel {

    public InfoActivityViewModel(@NonNull Application application) {
        super(application);
    }
    private MutableLiveData<Pelicula> pelicula = new MutableLiveData<>();

    public void setPelicula(Pelicula p) {
        pelicula.setValue(p);
    }

    public LiveData<Pelicula> getPelicula() {
        return pelicula;
    }
}
