package com.example.peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.peliculas.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private MainActivityViewModel vm;
    private RecyclerView rv;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = this;
        vm = new MainActivityViewModel();
        vm.getListaFilms();
        rv = binding.rvRecyclingView;
        GridLayoutManager grilla = new GridLayoutManager(context, 1,GridLayoutManager.VERTICAL, false);
        rv.setLayoutManager(grilla);
        PeliculasAdapter adapter = new PeliculasAdapter(vm.getListaFilms(), context, getLayoutInflater());
        rv.setAdapter(adapter);
    }
}