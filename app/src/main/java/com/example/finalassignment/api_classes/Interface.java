package com.example.finalassignment.api_classes;

import com.example.finalassignment.modal.EventModal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface {

    // Node API for event
    @GET("event")
    Call<List<EventModal>> parseEvent();
}
