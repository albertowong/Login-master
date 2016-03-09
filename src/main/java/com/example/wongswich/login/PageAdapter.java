package com.example.wongswich.login;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by wongswich on 03/02/16.
 */
public class PageAdapter extends FragmentStatePagerAdapter {
    int numTab;

    public PageAdapter(FragmentManager fm,int numTab){
        super(fm);
        this.numTab=numTab;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                FragmentProspecto fmProspectos=new FragmentProspecto();
                return fmProspectos;
            case 1:
                FragmentOportunidades fmOportunidades=new FragmentOportunidades();
                return fmOportunidades;
            case 2:
                FragmentClientes fmClientes=new FragmentClientes();
                return fmClientes;
            default:
                return null;
        }
    }
    @Override
    public  int getCount(){
        return numTab;
    }
}
