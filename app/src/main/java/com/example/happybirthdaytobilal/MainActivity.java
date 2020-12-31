package com.example.happybirthdaytobilal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "BirthEventActivity";

    private TextView textView;

    private int[] nums = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        try{



            textView =  findViewById(R.id.birthday_message);
            Log.i("BirthEventActivity", "Action is in progress");



            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText("Clicked");
                    Log.d(LOG_TAG, "Click process is successful");
                }
            });

            for(int i=0; i<5; i++){
                nums[i] = i;
            }

        }
        catch (Exception e){
            Log.e(LOG_TAG, "The exception is catched");
        }


    }


}