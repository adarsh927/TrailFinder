package com.adarshcoder.trailfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.View;

public class OdishaContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odisha_content);
    }

    public void konarkTemple(View view){
        Intent intent = new Intent(this, KonarkTemplePosterActivity.class);
        startActivity(intent);
    }

    public void jiRang(View view){
        Intent intent = new Intent(this, JirangPosterActivity.class);
        startActivity(intent);
    }

    public void gopalpurBeach(View view){
        Intent intent = new Intent(this, GopalpurBeachPosterActivity.class);
        startActivity(intent);
    }

    public void jaganathTemple(View view){
        Intent intent = new Intent(this, JagannathTemplePosterActivity.class);
        startActivity(intent);
    }

    public void nationalPark(View view) {
        Intent intent = new Intent(this, SimilipalNationalParkPosterActivity.class);
        startActivity(intent);
    }
}