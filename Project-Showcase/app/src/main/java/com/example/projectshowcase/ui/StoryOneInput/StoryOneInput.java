package com.example.projectshowcase.ui.StoryOneInput;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;

import com.example.projectshowcase.R;
import com.example.projectshowcase.databinding.FragmentStoryOneInputBinding;
import com.example.projectshowcase.ui.StoryOneInput.StoryOneInputViewModel;
import com.example.projectshowcase.ui.gallery.GalleryFragment;
import com.example.projectshowcase.ui.StoryResult.StoryResult;

import java.util.Objects;


public class StoryOneInput extends Fragment {

    // ... other code ...

    public void setStoryOneInputListener(StoryOneInputListener listener) {

        if (listener != null) {
        listener.onSubmitStory(); // Trigger the interface method
       }
    }

    private StoryOneInputViewModel mViewModel;

    public static StoryOneInput newInstance() {
        return new StoryOneInput();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    public interface StoryOneInputListener {
        void onSubmitStory();
    }


    public void SubmitStory() {
        Button Submit = requireView().findViewById(R.id.button5);
        Submit.setOnClickListener(v -> {
            System.out.println("Button Clicked");
            LayoutInflater inflater = getLayoutInflater();
            ViewGroup frameLayout = requireView().findViewById(R.id.frameLayout3);
            View inflate = inflater.inflate(R.layout.fragment_story_result, frameLayout);
            inflate.setVisibility(View.VISIBLE);
        });

    }
}