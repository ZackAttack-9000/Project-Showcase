package com.example.projectshowcase.ui.slideshow;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.projectshowcase.databinding.FragmentSlideshowBinding;
import com.google.android.material.snackbar.Snackbar;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        generateName();
        return root;
    }

    @SuppressLint("SetTextI18n")
    public void generateName() {
        Button generate = binding.button8;
        binding.textView22.setText("SCIFI name generator");
        binding.textView24.setText("Your New Scifi name is: Nothing yet...");

        generate.setOnClickListener(v -> {

            String firstName = binding.editTextText10.getText().toString();
            String lastName = binding.editTextText11.getText().toString();
            String city = binding.editTextText12.getText().toString();
            String school = binding.editTextText13.getText().toString();
            String pet = binding.editTextText14.getText().toString();
            String sibling = binding.Sibling.getText().toString();

            if (firstName.length() >= 2 && lastName.length() >= 2 && city.length() >= 4 && school.length() >= 3 && pet.length() >= 3 && sibling.length() >= 2) {

                String sciFiFirstName = firstName.substring(0, 2) + lastName.substring(lastName.length() - 2);
                String sciFiLastName = city.substring(0, 4) + school.substring(school.length() - 3);
                String sciFiOrigin = pet.substring(0, 3) + sibling.substring(sibling.length() - 2);
                String sciFiName = sciFiFirstName + " " + sciFiLastName + " " + sciFiOrigin;
                binding.textView24.setText("Your New Scifi name is: " + sciFiName);


            } else if (firstName.length() < 3) {
                Snackbar.make(v, "First name must be at least 3 characters", Snackbar.LENGTH_LONG).show();
                } else if (lastName.length() < 3) {
                Snackbar.make(v, "Last name must be at least 3 characters", Snackbar.LENGTH_LONG).show();
                } else if (city.length() < 4) {
                Snackbar.make(v, "City must be at least 4 characters", Snackbar.LENGTH_LONG).show();
                } else if (school.length() < 3) {
                Snackbar.make(v, "School must be at least 3 characters", Snackbar.LENGTH_LONG).show();
                } else if (pet.length() < 3) {
                Snackbar.make(v, "Pet's name must be at least 3 characters", Snackbar.LENGTH_LONG).show();
                } else if (sibling.length() < 2) {
                Snackbar.make(v, "Sibling's name must be at least 2 characters", Snackbar.LENGTH_LONG).show();
            }


                }
        );
    }

    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
