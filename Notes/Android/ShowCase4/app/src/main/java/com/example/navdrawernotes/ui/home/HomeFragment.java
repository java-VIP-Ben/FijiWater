package com.example.navdrawernotes.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navdrawernotes.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment { //extends the fragment, instead of the compact activity. Keep fragment in the name for simplicity

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //Textview txt = findViewById(R.id.txtWhatever);
        //final TextView textView = binding.textHome;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    //makes sure that there are not errors thrown if a fragment is already opened
    //this is esepcially true when a user is already in a fragment, and tries to open another fragment.
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}