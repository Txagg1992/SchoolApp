package com.curiousapps.schoolapp.requests;

import com.curiousapps.schoolapp.models.SchoolList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SchoolApi {

    //Get response for a List of schools limited to 150 schools, and start at 200.
    @GET("resource/s3k6-pzi2.json")
    Call<List<SchoolList>> searchSchools(
            @Query("$$app_token") String app_token,
            @Query("$limit") String limit,
            @Query("$offset") int offset
    );

    //Get response for a single School.
    @GET("resource/s3k6-pzi2.json")
    Call<List<SchoolList>> searchOneSchool(
            @Query("$$app_token") String app_token,
            @Query("dbn") String dbn
    );

}
