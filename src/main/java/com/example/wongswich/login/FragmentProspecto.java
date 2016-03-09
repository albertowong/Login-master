package com.example.wongswich.login;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wongswich.login.Adapters.ProspectoAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wongswich on 03/02/16.
 */
public class FragmentProspecto extends Fragment {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        View view = inflater.inflate(R.layout.fragment_prospectos, container, false);

        List<Prospecto> items=new ArrayList<>();
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));
//        items.add(new Prospecto(R.drawable.yo, "Alberto Wong", "alberto.wong@salesup.com.mx"));



        recycler =(RecyclerView) view.findViewById(R.id.recyclerview);
        recycler.setHasFixedSize(true);
        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(container.getContext());
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new ProspectoAdapter(items);
        recycler.setAdapter(adapter);


        return view;


    }
}
