package com.example.finalassignment.api_classes;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseAPI {
    public static Retrofit retrofit = null;

    public static Retrofit getRetrofit(){

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://localhost:3000/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
