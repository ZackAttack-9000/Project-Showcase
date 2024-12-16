package com.example.projectshowcase.ui.Credits;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectshowcase.databinding.FragmentCreditsBinding;
import com.example.projectshowcase.ui.home.HomeViewModel;

public class CreditsFragment extends Fragment {

    private CreditsViewModel mViewModel;

    public static CreditsFragment newInstance() {
        return new CreditsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        new ViewModelProvider(this).get(HomeViewModel.class);

        com.example.projectshowcase.databinding.FragmentCreditsBinding binding = FragmentCreditsBinding.inflate(inflater, container, false);

        return binding.getRoot();


    }
}