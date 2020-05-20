package com.curiousapps.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.curiousapps.schoolapp.requests.SchoolApi;
import com.curiousapps.schoolapp.requests.TestClient;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testRetrofit();
//                if (mProgressBar.getVisibility() == View.VISIBLE){
//                    showProgressBar(false);
//                }else {
//                    showProgressBar(true);
//                }
            }
        });
    }

    private void testRetrofit(){

        //TestClient.getInstance().checkSchoolListRetrofit();
        //TestClient.getInstance().checkSchoolSATRetrofit();
        TestClient.getInstance().checkSingleItemFromListRetrofit();

    }
}
