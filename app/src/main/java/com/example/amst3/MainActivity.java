package com.example.amst3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button videoBtn,calendarBtn,mapBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoBtn = (Button)findViewById(R.id.videoBtn);
        calendarBtn = (Button)findViewById(R.id.calendarBtn);
        mapBtn = (Button)findViewById(R.id.mapBtn);
    }

    public void passPage(View v){
        Intent i;
        switch(v.getId()){
            case R.id.videoBtn:
                i = new Intent(this, videoActivity.class );
                startActivity(i);
                break;
            case R.id.calendarBtn:
                i = new Intent(this, calendarActivity.class );
                startActivity(i);
                break;
            case R.id.mapBtn:
                i = new Intent(this, mapActivity.class );
                startActivity(i);
                break;
        }
    }
}
