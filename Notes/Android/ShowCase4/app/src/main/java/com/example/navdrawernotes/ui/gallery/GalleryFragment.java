package com.example.navdrawernotes.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navdrawernotes.R;
import com.example.navdrawernotes.databinding.FragmentGalleryBinding;

import java.util.Random;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    private Button reset, guess;
    private EditText num;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        reset = root.findViewById(R.id.btnReset);
        guess = root.findViewById(R.id.btnGuess);
        num = root.findViewById(R.id.txtNum);

        Random randy = new Random(int);


        guess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //final TextView textView = binding.textGallery;
        //galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}