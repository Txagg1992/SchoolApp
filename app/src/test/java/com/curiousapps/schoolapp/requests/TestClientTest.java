package com.curiousapps.schoolapp.requests;

import com.curiousapps.schoolapp.models.SchoolList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.configuration.IMockitoConfiguration;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.curiousapps.schoolapp.util.Constants.APP_TOKEN;
import static org.junit.jupiter.api.Assertions.*;

class TestClientTest {
    private SchoolApi schoolApi;
    private Retrofit retrofit;


    @Test
    public void checkSingleItemFromListRetrofit() {


//        CountDownLatch latch = new CountDownLatch(1);
//        responseCall.enqueue(new Callback<List<SchoolList>>() {
//            @Override
//            public void onResponse(Call<List<SchoolList>> call, Response<List<SchoolList>> response) {
//                if (response.code() == 200) {
//                    assertEquals("200", response.code());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<SchoolList>> call, Throwable t) {
//
//            }
//        });
//        try {
//            latch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Test
    void checkSchoolListRetrofit() throws Exception {
        //Arrange

        //Act

        //Assert
    }

    @Test
    void checkSchoolSATRetrofit() throws Exception {
        //Arrange

        //Act

        //Assert
    }
}