package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class personal extends AppCompatActivity {

    SpaceNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        navigationView = findViewById(R.id.space);


        navigationView.initWithSaveInstanceState(savedInstanceState);
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_call_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_info_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_textsms_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_favorite_black_24dp));

        //set on click listeners for navigation view
        navigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                navigationView.setCentreButtonSelectable(true);
                Intent homeintent= new Intent(personal.this, MainActivity.class);
                personal.this.startActivity(homeintent);

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                Toast.makeText(personal.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();


/*
                onItemClick(0,"");
                navigationView.changeCurrentItem(0);
                //Intent callintent= new Intent(MainActivity.this, call.class);
                //MainActivity.this.startActivity(callintent);

                onItemClick(1, "");
                navigationView.changeCurrentItem(1);
                //Intent infointent = new Intent(MainActivity.this, info.class);
                //MainActivity.this.startActivity(infointent);

                onItemClick(2,"");
                navigationView.changeCurrentItem(2);
                //Intent adviceintent = new Intent(MainActivity.this, advice.class);
                //MainActivity.this.startActivity(adviceintent);

                onItemClick(3, "");
                navigationView.changeCurrentItem(3);
                //Intent personalintent = new Intent(MainActivity.this, personal.class);
                //MainActivity.this.startActivity(personalintent);

*/

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Toast.makeText(personal.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
/*
                onItemReselected(0,"");
                //Intent callintent=new Intent(MainActivity.this, call.class);
                //MainActivity.this.startActivity(callintent);

                onItemReselected(1,"");
                //Intent infointent = new Intent(MainActivity.this, info.class);
                //MainActivity.this.startActivity(infointent);

                onItemReselected(1,"");
                //Intent adviceintent = new Intent(MainActivity.this, advice.class);
                //MainActivity.this.startActivity(adviceintent);

                //onItemReselected(1,"");
                //Intent personalintent = new Intent(MainActivity.this, personal.class);
                //MainActivity.this.startActivity(personalintent);
*/
            }

        });

    }
}
