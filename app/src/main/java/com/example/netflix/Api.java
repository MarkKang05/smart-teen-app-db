package com.example.netflix;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://simplifiedcoding.net/demos/";
    //String BASE_URL = "http://192.168.1.17:444/";

    @GET("marvel")
    Call<List<Results>> getsuperHeroes();
}
