package com.example.app;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    Button open_git;
    TextView display_quote;
    public HomeFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        // Button to open Git Page for dev
        open_git = (Button)v.findViewById(R.id.opengitbtn);
        open_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opengitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nhussain2/zindagi"));
                startActivity(opengitIntent);
            }
        });
        // Text view with Listener to display quotes on click (Random)
        display_quote = (TextView)v.findViewById(R.id.quotestextview);
        display_quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] quotes= getResources().getStringArray(R.array.home_quotes);
                Random random = new Random();
                display_quote.setText(quotes[random.nextInt(quotes.length-1)]);
            }
        });

        return v;
    }
}
