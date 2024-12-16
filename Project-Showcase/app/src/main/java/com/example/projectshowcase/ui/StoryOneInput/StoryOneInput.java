package com.example.projectshowcase.ui.StoryOneInput;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.projectshowcase.R;



public class StoryOneInput extends Fragment {


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SubmitStory();
    }


    @SuppressLint("SetTextI18n")
    public void SubmitStory() {
        Button Submit = requireView().findViewById(R.id.button5);
        Submit.setOnClickListener(v -> {
            Submit.setText("Story Submitted");
        });

    }
}