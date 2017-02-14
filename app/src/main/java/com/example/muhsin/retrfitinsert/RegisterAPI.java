package com.example.muhsin.retrfitinsert;

/**
 * Created by MUHSIN on 2/12/2017.
 */
import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
public interface RegisterAPI {
    @FormUrlEncoded
    @POST("/retrofitinsert/insert.php")
    public void insertUser(
            @Field("name") String name,
            @Field("username") String username,
            @Field("password") String password,
            @Field("email") String email,
            Callback<Response> callback);
}

