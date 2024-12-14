package com.example.projectshowcase.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.projectshowcase.R;
import com.example.projectshowcase.databinding.FragmentGalleryBinding;
import com.example.projectshowcase.ui.StoryOneInput.StoryOneInput;
import com.example.projectshowcase.ui.StoryThreeInput.StoryThreeInput;
import com.example.projectshowcase.ui.StoryTwoInput.StoryTwoInput;
import com.example.projectshowcase.ui.home.HomeFragment;

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

    private void SelectWords(){
        Button StartOne = requireView().findViewById(R.id.button2);
        Button StartTwo = requireView().findViewById(R.id.button);
        Button Random = requireView().findViewById(R.id.button3);
        Button StartThree = requireView().findViewById(R.id.button4);

        StartOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InputWordsOne = new Intent(getActivity(), StoryOneInput.class);
                startActivity(InputWordsOne);
            }
        });

        StartTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InputWordsTwo = new Intent(getActivity(), StoryTwoInput.class);
            }
        });

        StartThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InputWordsThree = new Intent(getActivity(), StoryThreeInput.class);
                startActivity(InputWordsThree);
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}