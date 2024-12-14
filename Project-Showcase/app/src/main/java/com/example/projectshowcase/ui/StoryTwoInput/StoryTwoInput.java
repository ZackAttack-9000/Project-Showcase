package com.example.projectshowcase.ui.StoryTwoInput;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectshowcase.R;

public class StoryTwoInput extends Fragment {

    private StoryTwoInputViewModel mViewModel;

    public static StoryTwoInput newInstance() {
        return new StoryTwoInput();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_story_two_input, container, false);
    }
}