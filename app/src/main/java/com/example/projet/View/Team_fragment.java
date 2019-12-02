package com.example.projet.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projet.R;


public class Team_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.team_fragment, container, false);
        //view.findViewById(R.id.)
        //layoutManager = new LinearLayoutManager(getContext());

        return view;
    }
}
