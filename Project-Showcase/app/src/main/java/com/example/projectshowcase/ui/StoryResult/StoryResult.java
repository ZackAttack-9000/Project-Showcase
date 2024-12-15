package com.example.projectshowcase.ui.StoryResult;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.projectshowcase.R;
import com.example.projectshowcase.ui.StoryResult.StoryResultViewModel;
import com.example.projectshowcase.ui.StoryOneInput.StoryOneInput;
import com.example.projectshowcase.ui.StoryTwoInput.StoryTwoInput;
import com.example.projectshowcase.ui.StoryThreeInput.StoryThreeInput;

public class StoryResult extends Fragment {

    private StoryResultViewModel mViewModel;

    public static StoryResult newInstance() {
        return new StoryResult();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ShowResult();
    }

    public void ShowResult(){
        TextView textView11 = requireView().findViewById(R.id.textView11);
        TextView textView12 = requireView().findViewById(R.id.textView12);
        TextView textView13 = requireView().findViewById(R.id.textView13);
        TextView textView14 = requireView().findViewById(R.id.textView14);
        TextView textView15 = requireView().findViewById(R.id.textView15);
        TextView textView16 = requireView().findViewById(R.id.textView16);
        TextView textView17 = requireView().findViewById(R.id.textView17);
        TextView textView18 = requireView().findViewById(R.id.textView18);
        EditText Name = requireView().findViewById(R.id.editTextText2);
        EditText Adjective = requireView().findViewById(R.id.editTextText3);
        EditText Verb = requireView().findViewById(R.id.editTextText4);
        EditText Noun = requireView().findViewById(R.id.editTextText5);
        EditText Place = requireView().findViewById(R.id.editTextText6);
        EditText FamousPerson = requireView().findViewById(R.id.editTextText7);
        EditText Restaurant = requireView().findViewById(R.id.editTextText8);
        EditText Food = requireView().findViewById(R.id.editTextText9);

        textView11.setText(Name.getText());
        textView12.setText(Adjective.getText());
        textView13.setText(Verb.getText());
        textView14.setText(Noun.getText());
        textView15.setText(Place.getText());
        textView16.setText(FamousPerson.getText());
        textView17.setText(Restaurant.getText());
        textView18.setText(Food.getText());
    }








//    Button StartOne = requireView().findViewById(R.id.button2);
//    Button StartTwo = requireView().findViewById(R.id.button);
//    Button Random = requireView().findViewById(R.id.button3);
//    Button StartThree = requireView().findViewById(R.id.button4);
//
//
//
//        StartOne.setOnClickListener(v -> {
//        StartOne.setVisibility(View.INVISIBLE);
//        StartTwo.setVisibility(View.INVISIBLE);
//        StartThree.setVisibility(View.INVISIBLE);
//        Random.setVisibility(View.INVISIBLE);
//        LayoutInflater inflater = getLayoutInflater();
//        ViewGroup frameLayout = requireView().findViewById(R.id.frameLayout);
//        View inflate = inflater.inflate(R.layout.fragment_story_one_input, frameLayout);
//        inflate.setVisibility(View.VISIBLE);
//    });

}