package com.example.sketenci.autogalleryapp.RestApi;

import com.example.sketenci.autogalleryapp.Models.LoginPojo;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager{


    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance(){
        return ourInstance;
    }

    public Call<LoginPojo> login(String username,String password){
        Call<LoginPojo> call = getRestApiClient().checkLogin(username,password);
        return call;

    }
}
