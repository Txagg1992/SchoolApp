package com.curiousapps.schoolapp.requests;

import android.util.Log;

import com.curiousapps.schoolapp.models.SchoolList;
import com.curiousapps.schoolapp.models.SchoolSAT;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.curiousapps.schoolapp.util.Constants.APP_TOKEN;
import static com.curiousapps.schoolapp.util.Constants.LIMIT;
import static com.curiousapps.schoolapp.util.Constants.OFFSET;

public class TestClient {
    private static final String TAG = "TestClient";
    private static TestClient instance;

    public static TestClient getInstance() {
        if (instance == null) {
            instance = new TestClient();
        }
        return instance;
    }

    public void checkSingleItemFromListRetrofit() {
        SchoolApi schoolApi = ServiceGenerator.getSchoolApi();
        Log.d(TAG, "Clicked for SingleSchoolApi:" + schoolApi);
        Call<List<SchoolList>> responseCall = schoolApi.searchOneSchool(
                APP_TOKEN,
                "25Q252"
        );
        responseCall.enqueue(new Callback<List<SchoolList>>() {
            @Override
            public void onResponse(Call<List<SchoolList>> call, Response<List<SchoolList>> response) {
                Log.d(TAG, "onResponse: Server: " + response.toString());
                Log.d(TAG, "<<onResponse>>: Code: " + response.code());
                if (response.code() == 200) {
                    Log.d(TAG, "Response: " + response.body());
                    List<SchoolList> schoolLists = new ArrayList<>(response.body());
                    for (SchoolList schoolList : schoolLists) {
                        Log.d(TAG, " School Dbn: " + schoolList.getDbn());
                        Log.d(TAG, " School Name: " + schoolList.getSchool_name());
                    }

                } else {
                    try {
                        Log.d(TAG, "Error: " + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<SchoolList>> call, Throwable t) {

            }
        });
    }


    public void checkSchoolListRetrofit() {
        SchoolApi schoolApi = ServiceGenerator.getSchoolApi();
        Log.d(TAG, "Clicked for ListApi: " + schoolApi);
        Call<List<SchoolList>> responseCall = schoolApi.searchSchools(
                APP_TOKEN,
                LIMIT,
                OFFSET
        );

        responseCall.enqueue(new Callback<List<SchoolList>>() {
            @Override
            public void onResponse(Call<List<SchoolList>> call, Response<List<SchoolList>> response) {
                Log.d(TAG, "OnResponse: Server: " + response.toString());
                Log.d(TAG, "<<onResponse>>: Code: " + response.code());
                if (response.code() == 200) {
                    Log.d(TAG, "Response Body" + response.body());
                    List<SchoolList> schoolLists = new ArrayList<>(response.body());
                    for (SchoolList schoolList : schoolLists) {
                        Log.d(TAG, " SchoolName: " + schoolList.getSchool_name());
                    }
                } else {
                    try {
                        Log.d(TAG, "Response Error: " + response.errorBody().string());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<SchoolList>> call, Throwable t) {

            }
        });

    }

    public void checkSchoolSATRetrofit() {
        SatApi satApi = ServiceGenerator.getSatApi();
        Log.d(TAG, "Clicked for SatAPI: " + satApi);
        Call<List<SchoolSAT>> responseCall = satApi.getSchoolSat(
                APP_TOKEN,
                "25Q252"
        );
        responseCall.enqueue(new Callback<List<SchoolSAT>>() {
            @Override
            public void onResponse(Call<List<SchoolSAT>> call, Response<List<SchoolSAT>> response) {
                Log.d(TAG, "onResponse: Server: " + response.toString());
                Log.d(TAG, "<<onResponse>>: Code: " + response.code());
                if (response.code() == 200) {
                    Log.d(TAG, "Response: " + response.body());
                    List<SchoolSAT> schoolSATS = new ArrayList<>(response.body());
                    for (SchoolSAT schoolSAT : schoolSATS) {
                        Log.d(TAG, " School Dbn: " + schoolSAT.getDbn());
//                        Log.d(TAG, " School Name: " + schoolSAT.getSchool_Name());
                    }
                } else {
                    try {
                        Log.d(TAG, "Error: " + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<SchoolSAT>> call, Throwable t) {

            }
        });

    }
}

//    @Test
//    public void testIfToolbarIsNullInActivity(){
//        View view = mainActivity.findViewById(R.id.tool_bar);
//
//        assertNotNull(view);
//    }
//    @Test
//    public void testIfRecyclerViewIsNull(){
//        View view = mainActivity.findViewById(R.id.school_list_recycler_view);
//        if (mainActivity.findViewById(R.id.school_list_recycler_view) == null){
//            System.out.println("RecyclerView is NULL...");
//        }else {
//            System.out.println("RecyclerView Exists!");
//        }
//        assertNotNull(view);
//    }

