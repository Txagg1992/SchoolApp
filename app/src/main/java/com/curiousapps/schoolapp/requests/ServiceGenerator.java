package com.curiousapps.schoolapp.requests;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.curiousapps.schoolapp.util.Constants.BASE_URL;

public class ServiceGenerator {

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static SchoolApi schoolApi = retrofit.create(SchoolApi.class);
    private static SatApi satApi = retrofit.create(SatApi.class);

    public static SchoolApi getSchoolApi(){
        return schoolApi;
    }
    public static SatApi getSatApi(){
        return satApi;
    }
}
