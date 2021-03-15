package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KonarkTemplePosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konark_temple_poster);
    }

    public void visitKonark(View view){
        Intent intent = new Intent(this, KonarkTempleActivity.class);
        startActivity(intent);
    }
}