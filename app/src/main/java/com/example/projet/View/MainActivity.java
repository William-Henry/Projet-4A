package com.example.projet.View;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.projet.Controller.MainController;
import com.example.projet.Controller.MyAdapter;
import com.example.projet.Model.F1;
import com.example.projet.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle("Toolbar");
        setSupportActionBar(myToolbar);
        recyclerView = findViewById(R.id.my_recycler_view);
        controller = new MainController(this);
        controller.onStart();
    }

    public void showList(final List<F1> input){
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(input);
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnItemTouchListener(new Click(getApplicationContext(), recyclerView, new Click.ClickListener() {
            public void onClick(View view, int position) {
                F1 f1 = input.get(position);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("round", f1.getRound());
                intent.putExtra("raceName", f1.getRaceName());
                intent.putExtra("circuitName", f1.getCircuitName());
                intent.putExtra("locality", f1.getLocality());
                intent.putExtra("country", f1.getCountry());
                intent.putExtra("circuiturl", f1.getCircuiturl());
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        MenuItem searchViewItem = menu.findItem(R.id.menuSearch);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        final SearchView searchView = (SearchView) searchViewItem.getActionView();
        searchView.setQueryHint("Search Tutorials...");
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(true);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.menuAbout:
                Toast.makeText(this, "You clicked about", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuSettings:
                Toast.makeText(this, "You clicked settings", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuLogout:
                Toast.makeText(this, "You clicked logout", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }

}