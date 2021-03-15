package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RatnagiriFortPosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratnagiri_fort_poster);
    }
    public void visitRatnagiri(View view){
        Intent intent= new Intent(this, RatnagiriFortActivity.class);
        startActivity(intent);
    }
}