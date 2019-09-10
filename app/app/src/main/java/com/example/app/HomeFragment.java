package com.example.app;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    Button open_git;
    public HomeFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        open_git = (Button)v.findViewById(R.id.opengitbtn);
        open_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opengitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nhussain2/zindagi"));
                startActivity(opengitIntent);
            }
        });

        return v;
    }
}
