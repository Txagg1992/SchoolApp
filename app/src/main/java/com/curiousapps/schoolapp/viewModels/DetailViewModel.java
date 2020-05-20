package com.curiousapps.schoolapp.viewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.curiousapps.schoolapp.models.SchoolList;
import com.curiousapps.schoolapp.repositories.SchoolRepository;

import java.util.List;

public class DetailViewModel extends ViewModel {

    private SchoolRepository mSchoolRepository;
    private String mDbn;
    private boolean mDidRetrieveSchool;

    public DetailViewModel(){
        mSchoolRepository = SchoolRepository.getInstance();
        mDidRetrieveSchool = false;
    }

    public LiveData<List<SchoolList>> getSchool(){
        return mSchoolRepository.getSchool();
    }
    public LiveData<Boolean> isSchoolRequestTimedOut() {
        return mSchoolRepository.isSchoolRequestTimedOut();
    }

    public void searchSingleSchoolApi(String dbn){
        mDbn = dbn;
        mSchoolRepository.searchSingleSchoolApi(dbn);
    }

    public String getDbn(){
        return mDbn;
    }

    public void setDidRetrieveSchool(boolean retrieveSchool){
        mDidRetrieveSchool = retrieveSchool;
    }
    public boolean didRetrieveSchool(){
        return mDidRetrieveSchool;
    }

}
