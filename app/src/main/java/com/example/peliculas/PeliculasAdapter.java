package com.example.peliculas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class PeliculasAdapter extends RecyclerView.Adapter{

    private List<Pelicula> listaPelis;
    private Context context;
    private LayoutInflater inflater;

    public PeliculasAdapter(List<Pelicula> listaPelis, Context context, LayoutInflater inflater) {
        this.listaPelis = listaPelis;
        this.context = context;
        this.inflater = inflater;
    }

    public class PeliculaViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitulo;
        public ImageView ivPortada;
        public TextView tvDescripcion;
        public Button btnInfo;

        public PeliculaViewHolder(View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            ivPortada = itemView.findViewById(R.id.ivPortada);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            btnInfo = itemView.findViewById(R.id.btnCardBoton);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carta_pelicula, parent, false);
        return new PeliculaViewHolder(view);
    }

    @Override
    //Aca infla cada item aso 1 recuero y seteo la lista de films aso 2 traigo los datos y los seteo a los elemntos aso 3 logica del boton aqui entran intent y bundle
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Pelicula pelicula = listaPelis.get(position);
        PeliculaViewHolder PeliculaViewHolder = (PeliculaViewHolder) holder;
        PeliculaViewHolder.tvTitulo.setText(pelicula.getTitulo());
        PeliculaViewHolder.ivPortada.setImageResource(pelicula.getPortada());
        PeliculaViewHolder.tvDescripcion.setText(pelicula.getDescripcion());

        PeliculaViewHolder.btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, InfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("pelicula", pelicula);
                intent.putExtras(bundle);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listaPelis.size();
    }
}
