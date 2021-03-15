package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SimilipalNationalParkPosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_similipal_national_park_poster);
    }
    public void visitPark(View view){
        Intent intent = new Intent(this, SimilipalNationalParkActivity.class);
        startActivity(intent);
    }
}