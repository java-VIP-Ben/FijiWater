package com.example.navdrawernotes.ui.slideshow;

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
import com.example.navdrawernotes.databinding.FragmentSlideshowBinding;

import java.util.Random;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    private EditText noun1, verb1, adj1, noun2, verb2, adverb1, adj2, noun3;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        noun1 = root.findViewById(R.id.noun1txt);
        verb1 = root.findViewById(R.id.verb1txt);
        adj1 = root.findViewById(R.id.adjective1txt);
        noun2 = root.findViewById(R.id.noun2txt);
        verb2 = root.findViewById(R.id.verb2txt);
        adverb1 = root.findViewById(R.id.adverb1txt);
        adj2 = root.findViewById(R.id.adjective2txt);
        noun3 = root.findViewById(R.id.noun3txt);
        Button btnRand = root.findViewById(R.id.btnRandomize);
        Button btnMadLib1 = root.findViewById(R.id.btnLib1);
        Button btnMadLib2 = root.findViewById(R.id.btnLib2);
        Button btnMadLib3 = root.findViewById(R.id.btnLib3);
        TextView madlib1 = root.findViewById(R.id.madlib1);
        TextView madlib2 = root.findViewById(R.id.madlib2);
        TextView madlib3 = root.findViewById(R.id.madlib3);

        //final TextView textView = binding.textSlideshow;
        //slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        btnRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randy = new Random();
                int lib = randy.nextInt(3) + 1;

                String fnoun = String.valueOf(noun1.getText());
                String fverb = String.valueOf(verb1.getText());
                String fadj = String.valueOf(adj1.getText());
                String snoun = String.valueOf(noun2.getText());
                String sverb = String.valueOf(verb2.getText());
                String fadverb = String.valueOf(adverb1.getText());
                String sadj = String.valueOf(adj2.getText());
                String tnoun = String.valueOf(noun3.getText());

                if(lib == 1) {
                    madlib2.setVisibility(View.GONE);
                    madlib3.setVisibility(View.GONE);
                    madlib1.setVisibility(View.VISIBLE);
                    madlib1.setText(String.format("Quick! The %s is %s from the police! We are going to need %s to catch the criminal before it can play kickball with infant puppies. \n Quick, hop into the %s and go catch the criminal! \n Later: \n Thanks for your %s %s, we were able to capture that %s %s and prevent him from hurting the puppies!", fnoun, fverb, fadj, snoun, fadverb, sverb, sadj, tnoun));
                } else if (lib == 2) {
                    madlib1.setVisibility(View.GONE);
                    madlib3.setVisibility(View.GONE);
                    madlib2.setVisibility(View.VISIBLE);
                    madlib2.setText(String.format("Ready for your first %s trip? We are going to %s today during the %s %s and see who is the best at it! \n Later: \n Congrats on your %s %s skills, you rocked that game! Next up we have a super fun game called %s %s and the other players want their champion. Lets go!", fnoun, fverb, fadj, snoun, fadverb, sverb, sadj, tnoun));
                } else {
                    madlib1.setVisibility(View.GONE);
                    madlib2.setVisibility(View.GONE);
                    madlib3.setVisibility(View.VISIBLE);
                    madlib3.setText(String.format("Shhhh, be quiet. %s is following us and we have to get away. Quick! %s to the clearing in the field, I'll meet up with you later. %s %s are the bets for defending yourself from them. \n Later: \n Phew, we made it, those things are %s %s , and we barely escaped it.  Glad you managed to seek shelter in that %s %s , because that thing did not see you at all! Guess we better head back to camp and tell the others to get out of the forests.", fnoun, fverb, fadj, snoun, fadverb, sverb, sadj, tnoun));
                }
            }
        });

        btnMadLib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnoun = String.valueOf(noun1.getText());
                String fverb = String.valueOf(verb1.getText());
                String fadj = String.valueOf(adj1.getText());
                String snoun = String.valueOf(noun2.getText());
                String sverb = String.valueOf(verb2.getText());
                String fadverb = String.valueOf(adverb1.getText());
                String sadj = String.valueOf(adj2.getText());
                String tnoun = String.valueOf(noun3.getText());

                madlib2.setVisibility(View.GONE);
                madlib3.setVisibility(View.GONE);
                madlib1.setVisibility(View.VISIBLE);
                madlib1.setText(String.format("Quick! The %s is %s from the police! We are going to need %s to catch the criminal before it can play kickball with infant puppies. \n Quick, hop into the %s and go catch the criminal! \n Later: \n Thanks for your %s %s, we were able to capture that %s %s and prevent him from hurting the puppies!", fnoun, fverb, fadj, snoun, fadverb, sverb, sadj, tnoun));
            }
        });

        btnMadLib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnoun = String.valueOf(noun1.getText());
                String fverb = String.valueOf(verb1.getText());
                String fadj = String.valueOf(adj1.getText());
                String snoun = String.valueOf(noun2.getText());
                String sverb = String.valueOf(verb2.getText());
                String fadverb = String.valueOf(adverb1.getText());
                String sadj = String.valueOf(adj2.getText());
                String tnoun = String.valueOf(noun3.getText());

                madlib1.setVisibility(View.GONE);
                madlib3.setVisibility(View.GONE);
                madlib2.setVisibility(View.VISIBLE);
                madlib2.setText(String.format("Ready for your first %s trip? We are going to %s today during the %s %s and see who is the best at it! \n Later: \n Congrats on your %s %s skills, you rocked that game! Next up we have a super fun game called %s %s and the other players want their champion. Lets go!", fnoun, fverb, fadj, snoun, fadverb, sverb, sadj, tnoun));
            }
        });

        btnMadLib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnoun = String.valueOf(noun1.getText());
                String fverb = String.valueOf(verb1.getText());
                String fadj = String.valueOf(adj1.getText());
                String snoun = String.valueOf(noun2.getText());
                String sverb = String.valueOf(verb2.getText());
                String fadverb = String.valueOf(adverb1.getText());
                String sadj = String.valueOf(adj2.getText());
                String tnoun = String.valueOf(noun3.getText());

                madlib2.setVisibility(View.GONE);
                madlib1.setVisibility(View.GONE);
                madlib3.setVisibility(View.VISIBLE);
                madlib3.setText(String.format("Shhhh, be quiet. %s is following us and we have to get away. Quick! %s to the clearing in the field, I'll meet up with you later. %s %s are the bets for defending yourself from them. \n Later: \n Phew, we made it, those things are %s %s , and we barely escaped it.  Glad you managed to seek shelter in that %s %s , because that thing did not see you at all! Guess we better head back to camp and tell the others to get out of the forests.", fnoun, fverb, fadj, snoun, fadverb, sverb, sadj, tnoun));

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