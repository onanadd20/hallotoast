package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToast(View view) {
        Toast.makeText(this, R.string.Message_toast, Toast.LENGTH_SHORT).show();
    }

    public void onCount(View view) {
    }
}