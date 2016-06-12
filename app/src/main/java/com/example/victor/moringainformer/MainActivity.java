package com.example.victor.moringainformer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the reference to the Welcome screen by using its ID
        //Note that that the layout must have been given the ID
        LinearLayout screen = (LinearLayout) findViewById(R.id.WelcomeScreen);
        TextView gotToMenu =(TextView) findViewById(R.id.goToMenu) ;


        //Set the onclick listener fornthe button
        gotToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MenuActivity.class));

            }
        });
    }
}
