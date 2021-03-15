package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JagannathTemplePosterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jagannath_temple_poster);
    }
    public void visitTemple(View view){
        Intent intent = new Intent(this, JagannathTempleActivity.class);
        startActivity(intent);
    }
}