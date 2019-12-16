package com.example.projet.Controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projet.Model.F1;
import com.example.projet.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.CelluleJava> {
    private List<F1> listValues;
    public Context context;

    public class CelluleJava extends RecyclerView.ViewHolder {
        public TextView txtHeader2;
        public ImageView image2;
        public View layout;

        public CelluleJava(View v) {
            super(v);
            layout = v;
            txtHeader2 = (TextView) v.findViewById(R.id.team_fragment);
            image2 = v.findViewById(R.id.team_image);
            context = itemView.getContext();
        }
    }

    public void add(int position, F1 item) {
        listValues.add(position, item);
        notifyItemInserted(position);
    }

    /*public void remove(int position) {
        listValues.remove(position);
        notifyItemRemoved(position);
    }*/

    public MyAdapter2(List<F1> listValues) {
        this.listValues = listValues;
    }

    @Override
    public CelluleJava onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.team_fragment, parent, false);
        CelluleJava vh = new CelluleJava(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CelluleJava holder, final int position) {

        F1 currentF1 = listValues.get(position);
        final String name2 = currentF1.getTeamName();
        holder.txtHeader2.setText(name2);
        Picasso.with(context).load(currentF1.getLogo()).resize(104,104).into(holder.image2);

        /*holder.txtHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(position);
            }
        });*/

//        holder.txtFooter.setText("");
    }

    @Override
    public int getItemCount() {
        return listValues.size();
    }

}
