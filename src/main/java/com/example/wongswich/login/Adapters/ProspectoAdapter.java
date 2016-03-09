package com.example.wongswich.login.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wongswich.login.Prospecto;
import com.example.wongswich.login.R;

import java.util.List;

/**
 * Created by wongswich on 04/02/16.
 */
public class ProspectoAdapter extends RecyclerView.Adapter<ProspectoAdapter.ProspectoViewHolder> {
    private List<Prospecto> items;

    public static class ProspectoViewHolder extends  RecyclerView.ViewHolder{
        public ImageView imagen;
        public TextView nombre;
        public TextView correo;

        public ProspectoViewHolder(View v){
            super(v);
            imagen=(ImageView) v.findViewById(R.id.image);
            nombre=(TextView) v.findViewById(R.id.nombre_prospecto);
            correo=(TextView) v.findViewById(R.id.correo_prospecto);
        }
    } //Fin ProspectoViewHolder
        public ProspectoAdapter(List<Prospecto> items){
            this.items=items;
        }
        @Override
        public int getItemCount(){return items.size();}

        @Override
        public ProspectoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
            View v= LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.lista_prospectos,viewGroup, false);
            return new ProspectoViewHolder(v);
        }
        @Override
        public void onBindViewHolder(ProspectoViewHolder viewHolder, int i){
            viewHolder.imagen.setImageResource(items.get(i).getImagen());
        }


} //Fin clase ProspectoAdapter
