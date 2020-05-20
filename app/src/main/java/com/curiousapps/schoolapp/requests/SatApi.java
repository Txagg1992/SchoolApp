package com.curiousapps.schoolapp.requests;

import com.curiousapps.schoolapp.models.SchoolSAT;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SatApi {

    //Get Single response for SAT
    @GET("resource/f9bf-2cp4.json")
    Call<List<SchoolSAT>> getSchoolSat(
            @Query("$$app_token") String app_token,
            @Query("dbn") String dbn
    );
}
