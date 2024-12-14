package com.example.projectshowcase.ui.StoryOneInput;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.projectshowcase.R;
import com.example.projectshowcase.ui.StoryThreeInput.StoryThreeInput;
import com.example.projectshowcase.ui.StoryTwoInput.StoryTwoInput;
import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class StoryOneInput extends AppCompatActivity {

    private StoryOneInputViewModel mViewModel;

    public static StoryOneInput newInstance() {
        return new StoryOneInput();
    }


    public void SelectWords(View view) {
        Button StartOne = findViewById(R.id.button2);
        Button StartTwo = findViewById(R.id.button);
        Button Random = findViewById(R.id.button3);
        Button StartThree = findViewById(R.id.button4);

        StartOne.setOnClickListener(v -> {
            Intent InputWordsOne = new Intent(this, StoryOneInput.class);
            startActivity(InputWordsOne);
        });

        StartTwo.setOnClickListener(v -> {
            Intent InputWordsTwo = new Intent(this, StoryTwoInput.class);
            startActivity(InputWordsTwo);
        });

        StartThree.setOnClickListener(v -> {
            Intent InputWordsThree = new Intent(this, StoryThreeInput.class);
            startActivity(InputWordsThree);
        });

        Random.setOnClickListener(v -> {
            java.util.Random RandInt = new Random();
            int StoryPick = RandInt.nextInt(5);
            if(StoryPick < 1){
                Intent InputWordsOne = new Intent(this, StoryOneInput.class);
                startActivity(InputWordsOne);
            }
            else if(StoryPick < 3){
                Intent InputWordsTwo = new Intent(this, StoryTwoInput.class);
                startActivity(InputWordsTwo);
            }
            else if(StoryPick < 5){
                Intent InputWordsThree = new Intent(this, StoryThreeInput.class);
                startActivity(InputWordsThree);
            }
            else{
                Snackbar.make(this.getCurrentFocus(), "An error Occurred, try again", Snackbar.LENGTH_LONG)
                        .setAction("Action", null)
                        .setAnchorView(R.id.fab).show();
            }
        });
    }
}