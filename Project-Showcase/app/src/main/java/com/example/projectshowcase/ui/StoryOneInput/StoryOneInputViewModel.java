package com.example.projectshowcase.ui.StoryOneInput;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StoryOneInputViewModel extends ViewModel {
    public static LiveData<Object> getText() {

        MutableLiveData<Object> text = new MutableLiveData<>();
        text.setValue("Test");
        return text;
    }
    // TODO: Implement the ViewModel

}