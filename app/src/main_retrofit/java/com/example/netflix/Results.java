package com.example.netflix;

import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("content")
    private String superName;


    public Results(String name) {
        this.superName = name;
    }

    public String getName() {
        return superName;
    }
}
