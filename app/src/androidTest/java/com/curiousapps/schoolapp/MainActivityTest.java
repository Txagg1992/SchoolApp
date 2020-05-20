package com.curiousapps.schoolapp;

import android.view.View;

import androidx.test.rule.ActivityTestRule;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule

    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity = null;

    @Before
    public void setup() throws Exception{
        mainActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void testIfButtonIsNullInActivity(){
        View view = mainActivity.findViewById(R.id.button);

        assertNotNull(view);
    }
    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }

}