package com.example.projectshowcase.ui.StoryOneInput;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.projectshowcase.databinding.FragmentSlideshowBinding;
import com.example.projectshowcase.databinding.FragmentStoryOneInputBinding;
import com.example.projectshowcase.ui.slideshow.SlideshowViewModel;

public class StoryOneInputAppCompat extends AppCompatActivity {

    class StoryOneInputFragment extends Fragment {
        private FragmentStoryOneInputBinding binding;

        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            StoryOneInputViewModel StoryOneInputViewModel;
            StoryOneInputViewModel = new ViewModelProvider(this).get(StoryOneInputViewModel.class);

            binding = FragmentStoryOneInputBinding.inflate(inflater, container, false);
            View root = binding.getRoot();

            Class<? extends com.example.projectshowcase.ui.StoryOneInput.StoryOneInputViewModel> aClass = StoryOneInputViewModel.getClass();

            return root;
        }


    private StoryOneInputAppCompat mViewModel;
    public StoryOneInputAppCompat newInstance() {
        return new StoryOneInputAppCompat();
    }





}

}