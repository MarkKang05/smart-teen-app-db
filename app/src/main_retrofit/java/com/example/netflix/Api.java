package com.example.netflix;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    //String BASE_URL = "http://simplifiedcoding.net/demos/";
    //String BASE_URL = "http://192.168.1.17:444/";
    //String BASE_URL = "http://klspace.asuscomm.com:4545/";
    String BASE_URL = "https://netflix-clone-1e1b4-default-rtdb.firebaseio.com/";

    @GET("todos.json")
    Call<List<Results>> getsuperHeroes();
}
