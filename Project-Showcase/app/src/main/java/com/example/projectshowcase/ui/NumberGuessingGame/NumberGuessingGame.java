package com.example.projectshowcase.ui.NumberGuessingGame;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.projectshowcase.R;

import java.util.concurrent.atomic.AtomicInteger;


    public class NumberGuessingGame extends Fragment {

        private NumberGuessingGameViewModel mViewModel;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_number_guessing_game, container, false);
            return view; // Return the inflated view
        }

        public NumberGuessingGame newInstance() {
            return new NumberGuessingGame();
        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            GuessingGame();
        }


        @SuppressLint("SetTextI18n")
        void GuessingGame() {
            AtomicInteger randomNumber = new AtomicInteger((int) (Math.random() * 100 + 1));
            Button Guess = requireView().findViewById(R.id.button6);
            Button NewGame = requireView().findViewById(R.id.button7);
            TextView Reply = requireView().findViewById(R.id.textView20);
            TextView Guesses = requireView().findViewById(R.id.textView21);
            EditText GuessNumber = requireView().findViewById(R.id.editTextNumber);
            AtomicInteger guesses = new AtomicInteger();

            Guess.setOnClickListener(v -> {
                Reply.setText("");
                Guesses.setText("");
                NewGame.setVisibility(View.INVISIBLE);
                guesses.getAndIncrement();
                GuessNumber.getText().toString();
                if (randomNumber.get() == Integer.parseInt(GuessNumber.getText().toString())) {
                    Reply.setText("Correct!");
                    Guesses.setText("You guessed the number in " + guesses + " guesses!");
                    NewGame.setVisibility(View.VISIBLE);
                } else if (randomNumber.get() > Integer.parseInt(GuessNumber.getText().toString())) {
                    Reply.setText("Too low!");
                } else {
                    Reply.setText("Too high!");
                }
                if(guesses.get() == 10){
                    Reply.setText("You ran out of guesses!");
                    Guesses.setText("The number was " + randomNumber);
                    Reply.setTextSize(35);
                    Reply.setTextColor(000000);
                    NewGame.setVisibility(View.VISIBLE);
                }
            });
            NewGame.setOnClickListener(v -> {
                randomNumber.set((int) (Math.random() * 100 + 1));
                guesses.set(0);
                Reply.setText("");
                Guesses.setText("");
                NewGame.setVisibility(View.INVISIBLE);
            });
        }
    }
