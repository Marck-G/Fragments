package com.dev.mohawk.fragments.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.ListView;

import com.dev.mohawk.fragments.items.Pelicula;

public class PeliculaListFragment extends Fragment {

    private ItemSelectedListener listener;

    private ListView l;

    @Override
    public void onActivityCreated( @Nullable Bundle savedInstanceState ) {
        super.onActivityCreated( savedInstanceState );
    }

    public interface ItemSelectedListener{
        public void itemSelected( Pelicula pelicula );
    }

}
