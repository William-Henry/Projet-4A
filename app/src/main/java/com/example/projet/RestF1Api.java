package com.example.projet;

import com.example.projet.Controller.RestF1Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestF1Api {

    @GET("Races.json")
    Call<RestF1Response> getListF1();
}
