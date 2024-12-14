package com.example.projectshowcase.ui.StoryThreeInput;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectshowcase.R;

public class StoryThreeInput extends AppCompatActivity {

    private StoryThreeInputViewModel mViewModel;

    public static StoryThreeInput newInstance() {
        return new StoryThreeInput();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_story_three_input, container, false);
    }
}