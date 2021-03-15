package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OdishaPosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odisha_poster);

    }
    public void visitOdisha(View view){
        Intent intent = new Intent(this, OdishaContentActivity.class);

        startActivity(intent);
    }
}