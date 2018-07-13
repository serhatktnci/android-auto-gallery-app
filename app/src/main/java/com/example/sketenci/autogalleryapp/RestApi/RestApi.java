package com.example.sketenci.autogalleryapp.RestApi;

import com.example.sketenci.autogalleryapp.Models.LoginPojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RestApi {
    @FormUrlEncoded
    @POST("login.php")
    Call<LoginPojo> checkLogin(@Field("username") String username, @Field("password") String password) ;

}
