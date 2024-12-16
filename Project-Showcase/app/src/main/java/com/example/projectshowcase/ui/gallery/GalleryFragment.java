package com.example.projectshowcase.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.projectshowcase.R;
import com.example.projectshowcase.databinding.FragmentGalleryBinding;
import com.example.projectshowcase.ui.StoryOneInput.StoryOneInput;
import com.example.projectshowcase.ui.StoryThreeInput.StoryThreeInput;
import com.example.projectshowcase.ui.StoryTwoInput.StoryTwoInput;
import com.example.projectshowcase.ui.gallery.GalleryViewModel;
import com.example.projectshowcase.ui.StoryResult.StoryResult;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import com.google.android.material.snackbar.Snackbar;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textView2;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SelectWords();
    }
    

    public void SelectWords(){
        Button StartOne = requireView().findViewById(R.id.button2);
        Button StartTwo = requireView().findViewById(R.id.button);
        Button Random = requireView().findViewById(R.id.button3);
        Button StartThree = requireView().findViewById(R.id.button4);

        StartOne.setOnClickListener(v -> {
            StartOne.setVisibility(View.INVISIBLE);
            StartTwo.setVisibility(View.INVISIBLE);
            StartThree.setVisibility(View.INVISIBLE);
            Random.setVisibility(View.INVISIBLE);
            LayoutInflater inflater = getLayoutInflater();
            ViewGroup frameLayout = requireView().findViewById(R.id.frameLayout);
            View inflate = inflater.inflate(R.layout.fragment_story_one_input, frameLayout);
            Intent intent = new Intent(getActivity(), StoryOneInput.class);
            inflate.setVisibility(View.VISIBLE);
            startActivity(intent);
        });

        StartTwo.setOnClickListener(v -> {
            StartOne.setVisibility(View.INVISIBLE);
            StartTwo.setVisibility(View.INVISIBLE);
            StartThree.setVisibility(View.INVISIBLE);
            Random.setVisibility(View.INVISIBLE);
            LayoutInflater inflater = getLayoutInflater();
            ViewGroup frameLayout = requireView().findViewById(R.id.frameLayout);
            View inflate = inflater.inflate(R.layout.fragment_story_two_input, frameLayout);
            inflate.setVisibility(View.VISIBLE);
        });

        StartThree.setOnClickListener(v -> {
            StartOne.setVisibility(View.INVISIBLE);
            StartTwo.setVisibility(View.INVISIBLE);
            StartThree.setVisibility(View.INVISIBLE);
            Random.setVisibility(View.INVISIBLE);
            LayoutInflater inflater = getLayoutInflater();
            ViewGroup frameLayout = requireView().findViewById(R.id.frameLayout);
            View inflate = inflater.inflate(R.layout.fragment_story_three_input, frameLayout);
            inflate.setVisibility(View.VISIBLE);
        });


        Random.setOnClickListener(v -> {
            Random RandInt = new Random();
            int StoryPick = RandInt.nextInt(5);
            if(StoryPick < 1){
                StartOne.setVisibility(View.INVISIBLE);
                StartTwo.setVisibility(View.INVISIBLE);
                StartThree.setVisibility(View.INVISIBLE);
                Random.setVisibility(View.INVISIBLE);
                LayoutInflater inflater = getLayoutInflater();
                ViewGroup frameLayout = requireView().findViewById(R.id.frameLayout);
                View inflate = inflater.inflate(R.layout.fragment_story_one_input, frameLayout);
                inflate.setVisibility(View.VISIBLE);
            }
            else if(StoryPick < 3){
                StartOne.setVisibility(View.INVISIBLE);
                StartTwo.setVisibility(View.INVISIBLE);
                StartThree.setVisibility(View.INVISIBLE);
                Random.setVisibility(View.INVISIBLE);
                LayoutInflater inflater = getLayoutInflater();
                ViewGroup frameLayout = requireView().findViewById(R.id.frameLayout);
                View inflate = inflater.inflate(R.layout.fragment_story_two_input, frameLayout);
                inflate.setVisibility(View.VISIBLE);
            }
            else if(StoryPick < 5){
                StartOne.setVisibility(View.INVISIBLE);
                StartTwo.setVisibility(View.INVISIBLE);
                StartThree.setVisibility(View.INVISIBLE);
                Random.setVisibility(View.INVISIBLE);
                LayoutInflater inflater = getLayoutInflater();
                ViewGroup frameLayout = requireView().findViewById(R.id.frameLayout);
                View inflate = inflater.inflate(R.layout.fragment_story_three_input, frameLayout);
                inflate.setVisibility(View.VISIBLE);
            }
            else{
                Snackbar.make(getView(), "An error Occurred, try again", Snackbar.LENGTH_LONG)
                        .setAction("Action", null)
                        .setAnchorView(R.id.fab).show();
            }
        });
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}