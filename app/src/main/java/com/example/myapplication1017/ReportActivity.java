package com.example.myapplication1017;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_report);
        Intent intent=getIntent();
        String ReportSum =intent.getStringExtra("R_Sum");
        TextView textViewR=(TextView)findViewById(R.id.textReport);
        textViewR.setText(ReportSum);



        super.onCreate(savedInstanceState);

    }
}
