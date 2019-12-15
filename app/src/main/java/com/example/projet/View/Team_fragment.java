package com.example.projet.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.projet.Controller.MainController2;
import com.example.projet.Controller.MyAdapter2;
import com.example.projet.Model.F1;
import com.example.projet.R;

import java.util.List;

public class Team_fragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private MainController2 controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_view, container, false);
        controller = new MainController2(this);
        controller.onStart();

        return view;
    }

    public void showList(final List<F1> input){
        recyclerView = getView().findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter2(input);
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnItemTouchListener(new Click(getActivity().getApplicationContext(), recyclerView, new Click.ClickListener() {
            public void onClick(View view, int position) {
                F1 f1 = input.get(position);
                Intent intent = new Intent(getActivity().getApplicationContext(), Main2Activity.class);
                intent.putExtra("team", f1.getTeamName());
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
}
