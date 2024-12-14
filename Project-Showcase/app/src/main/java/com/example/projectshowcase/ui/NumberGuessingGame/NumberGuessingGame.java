package com.example.projectshowcase.ui.NumberGuessingGame;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectshowcase.R;

public class NumberGuessingGame extends Fragment {

    private NumberGuessingGameViewModel mViewModel;

    public static NumberGuessingGame newInstance() {
        return new NumberGuessingGame();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_number_guessing_game, container, false);
    }
}