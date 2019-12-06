package com.example.projet.Controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projet.Model.F1;
import com.example.projet.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CelluleJava> {
    private List<F1> listValues;

    public class CelluleJava extends RecyclerView.ViewHolder {
        public TextView txtHeader;
        public TextView txtFooter;
        public ImageView image;
        public View layout;

        public CelluleJava(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.calendar_fragment);
            //txtFooter = (TextView) v.findViewById(R.id.secondLine);
            image = v.findViewById(R.id.list_image);
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

    public MyAdapter(List<F1> listValues) {
        this.listValues = listValues;
    }

    @Override
    public CelluleJava onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.calendar_fragment, parent, false);
        CelluleJava vh = new CelluleJava(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CelluleJava holder, final int position) {

        F1 currentF1 = listValues.get(position);
        final String name = currentF1.getRaceName();
        holder.txtHeader.setText(name);

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
