package com.example.muhsin.retrfitinsert;

import java.util.List;

import retrofit.Callback;
import retrofit.http.POST;

/**
 * Created by MUHSIN on 2/14/2017.
 */

public interface ViewApi {


        /*Retrofit get annotation with our URL
           And our method that will return us the list ob Book
        */
        @POST("/emc/aa.php")
        public void getBooks(Callback<List<Viewmodeclass>> response);

}
