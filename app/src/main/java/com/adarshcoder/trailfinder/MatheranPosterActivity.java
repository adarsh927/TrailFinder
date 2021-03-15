package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MatheranPosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matheran_poster);
    }
    public void visitMatheran(View view){
        Intent intent= new Intent(this, MatheranActivity.class);
        startActivity(intent);
    }
}