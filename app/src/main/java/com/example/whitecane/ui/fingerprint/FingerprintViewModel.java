package com.example.whitecane.ui.fingerprint;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FingerprintViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FingerprintViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is fingerprint fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
