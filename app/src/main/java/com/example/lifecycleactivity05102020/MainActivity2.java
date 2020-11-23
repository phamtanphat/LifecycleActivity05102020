package com.example.lifecycleactivity05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button mBtnNavigateScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("BBB","onCreate2");

        mBtnNavigateScreen3 = findViewById(R.id.buttonNavigateScreen3);

        mBtnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent implicit : Dung xu ly cho doi khong cu the
                //Intent explicit : Dung xu ly cho doi tuong cu the
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);

            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy2");
    }
}