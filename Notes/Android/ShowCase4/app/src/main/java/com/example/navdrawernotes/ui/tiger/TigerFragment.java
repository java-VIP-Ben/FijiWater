package com.example.navdrawernotes.ui.tiger;

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
import android.widget.EditText;
import android.widget.TextView;

import com.example.navdrawernotes.R;
import com.example.navdrawernotes.databinding.FragmentSlideshowBinding;
import com.example.navdrawernotes.databinding.FragmentTigerBinding;
import com.example.navdrawernotes.ui.slideshow.SlideshowViewModel;

import java.util.Random;

public class TigerFragment extends Fragment {

    //more variables
    private Button back, generate, home;
    private EditText first, last, city, school, pet, sibling;
    private TextView output;
    private TigerViewModel mViewModel;

    private FragmentTigerBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TigerViewModel tigerViewModel =
                new ViewModelProvider(this).get(TigerViewModel.class);
        binding = FragmentTigerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //connect the widgets
        //findViewById is a method from the view class -> but here is is something else

        //text views
        first = root.findViewById(R.id.txtFirst);
        last = root.findViewById(R.id.txtLast);
        city = root.findViewById(R.id.txtCity);
        school = root.findViewById(R.id.txtSchool);
        pet = root.findViewById(R.id.txtPet);
        sibling = root.findViewById(R.id.txtSibling);
        output = root.findViewById(R.id.txtOutput);
        generate = root.findViewById(R.id.btnGenerate);


        //using a button to generate the sci fi story
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creating a random event to generate the substrings (if substrings work)
                Random randy = new Random();

                //getting the text values so substring can work
                String fName = String.valueOf(first.getText());
                String lName = String.valueOf(last.getText());
                String cLive = String.valueOf(city.getText());
                String sLive = String.valueOf(school.getText());
                String domestic = String.valueOf(pet.getText());
                String housemate = String.valueOf(sibling.getText());

                //getting the answers for the inputs
                int firstPortion = randy.nextInt(fName.length());
                int lastPortion = randy.nextInt(lName.length());
                String scifiFirst = fName.substring(0, firstPortion) + lName.substring(0, lastPortion);
                firstPortion = randy.nextInt(cLive.length());
                lastPortion = randy.nextInt(sLive.length());
                String scifiLast = cLive.substring(0, firstPortion) + sLive.substring(0, lastPortion);
                firstPortion = randy.nextInt(domestic.length());
                lastPortion = randy.nextInt(housemate.length());
                String scifiOrigin = domestic.substring(0, firstPortion) + housemate.substring(0, lastPortion);
                output.setText(String.format("%s %s of the planet: %s.", scifiFirst, scifiLast, scifiOrigin));
            }
        });

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}