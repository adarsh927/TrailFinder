package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GopalpurBeachPosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gopalpur_beach_poster);
    }

    public void visitGopalpur(View view){
        Intent intent=new Intent(this, GopalpurActivity.class);
        startActivity(intent);
    }
}