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

import com.example.projet.Controller.MainController;
import com.example.projet.Controller.MyAdapter;
import com.example.projet.Model.F1;
import com.example.projet.R;

import java.util.List;

public class Calendar_fragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private MainController controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_view, container, false);
        controller = new MainController(this);
        controller.onStart();

        return view;
    }

    public void showList(final List<F1> input){
        recyclerView = getView().findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(input);
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnItemTouchListener(new Click(getActivity().getApplicationContext(), recyclerView, new Click.ClickListener() {
            public void onClick(View view, int position) {
                F1 f1 = input.get(position);
                Intent intent = new Intent(getActivity().getApplicationContext(), Main2Activity.class);
                intent.putExtra("round", f1.getRound());
                intent.putExtra("raceName", f1.getRaceName());
                intent.putExtra("circuitName", f1.getCircuitName());
                intent.putExtra("locality", f1.getLocality());
                intent.putExtra("country", f1.getCountry());
                intent.putExtra("circuiturl", f1.getCircuiturl());
                //intent.putExtra("circuitMap", f1.getCircuitMap());
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

}
