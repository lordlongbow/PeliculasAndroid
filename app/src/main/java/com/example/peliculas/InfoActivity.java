package com.example.peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView tvInfoTitulo;
    private ImageView ivInfoPortada;
    private TextView tvInfoDescripcion;
    private TextView tvInfoDirector;
    private TextView tvInfoActores;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        InfoActivityViewModel viewModel = new ViewModelProvider(this).get(InfoActivityViewModel.class);

        tvInfoTitulo = findViewById(R.id.tvInfoTitulo);
        ivInfoPortada = findViewById(R.id.ivInfoPortada);
        tvInfoDescripcion = findViewById(R.id.tvInfoDescripcion);
        tvInfoDirector = findViewById(R.id.tvInfoDirector);
        tvInfoActores = findViewById(R.id.tvInfoActores);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("pelicula");
        Pelicula pelicula = (Pelicula) bundle.getSerializable("pelicula");


        viewModel.setPelicula(pelicula);

        viewModel.getPelicula().observe(this, new Observer<Pelicula>() {
            @Override
            public void onChanged(Pelicula pelicula) {
                tvInfoTitulo.setText(pelicula.getTitulo());
                ivInfoPortada.setImageResource(pelicula.getPortada());
                tvInfoDescripcion.setText(pelicula.getDescripcion());
                tvInfoDirector.setText(pelicula.getDirector());
                tvInfoActores.setText(pelicula.getActores());
            }
        });
    }
}
