package com.example.aitest;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Body;

public interface ClarifaiService {
    @Headers("Authorization: Key c8c47c10d34045ae9e522a7131242d12")
    @POST("/v2/models/food-item-recognition/versions/1d5fd481e0cf4826aa72ec3ff049e044/outputs")
    Call<ClarifaiResponse> postImage(@Body ClarifaiRequest request);
}