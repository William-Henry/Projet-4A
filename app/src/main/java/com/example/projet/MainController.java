package com.example.projet;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController {

    private MainActivity activity;

    public MainController(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public void onStart(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/William-Henry/APIF1/master/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RestF1Api restF1Api = retrofit.create(RestF1Api.class);

        Call<RestF1Response> call = restF1Api.getListF1();
        call.enqueue(new Callback<RestF1Response>() {
            @Override
            public void onResponse(Call<RestF1Response> call, Response<RestF1Response> response) {
                if (response.isSuccessful()) {
                    RestF1Response restF1Response = response.body();
                    List<F1> listF1 = restF1Response.getResults();
                    activity.showList(listF1);
                } else {
                    System.out.println(response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<RestF1Response> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }
}