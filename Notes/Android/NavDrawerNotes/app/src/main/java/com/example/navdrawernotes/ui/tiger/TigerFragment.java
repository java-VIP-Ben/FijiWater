package com.example.navdrawernotes.ui.tiger;

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

import com.example.navdrawernotes.R;

public class TigerFragment extends Fragment {

    private TigerViewModel mViewModel;

    public static TigerFragment newInstance() {
        return new TigerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tiger, container, false);
        //connect the widgets
        //findViewById is a method from the view class -> but here is is somethine else
        TextView output = rootView.findViewById(R.id.textView2);
        EditText input = rootView.findViewById(R.id.input);
        Button one = rootView.findViewById(R.id.btn1);

        return rootView;
    }
}