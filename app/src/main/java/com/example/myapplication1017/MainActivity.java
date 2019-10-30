package com.example.myapplication1017;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {




        setContentView(R.layout.activity_main);

       Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i=new Intent(MainActivity.this,Main2Activity.class);

                startActivity(i);
            }


        });
        Intent intent2=getIntent();
        String message =intent2.getStringExtra("heightData");
        TextView textView=(TextView)findViewById(R.id.textViewHeight);
        textView.setText(message);

        String message2=intent2.getStringExtra("weightData");
        TextView textView2=(TextView)findViewById(R.id.textViewWeight);
        textView2.setText(message2);

        String dataHeight=intent2.getStringExtra("heightStandard");
        TextView textView3=(TextView)findViewById(R.id.heightS);
        textView3.setText(dataHeight);

        String dataWeight=intent2.getStringExtra("WeightStd");
        TextView textView4=(TextView)findViewById(R.id.weightS);
        textView4.setText(dataWeight);

        String dataBMIs=intent2.getStringExtra("BMIs");
        TextView textView5=(TextView)findViewById(R.id.textViewBMIs);
        textView5.setText(dataBMIs);

        String dataBMI=intent2.getStringExtra("BMI");
        TextView textView6=(TextView)findViewById(R.id.textViewBMI);
        textView6.setText(dataBMI);


        String bft=intent2.getStringExtra("bodyFatRate");
        TextView textView7=(TextView)findViewById(R.id.num1);
        textView7.setText(bft);

        String storebfr=intent2.getStringExtra("bfrStore");
        TextView textView7_1=(TextView)findViewById(R.id.text12);
        textView7_1.setText(storebfr);


        String dataMUS=intent2.getStringExtra("muscle");
        TextView textView8=(TextView)findViewById(R.id.num3);
        textView8.setText(dataMUS);

        String storemus=intent2.getStringExtra("musStore");
        TextView textView8_1=(TextView)findViewById(R.id.view3);
        textView8_1.setText(storemus);


        String dataWAT=intent2.getStringExtra("water");
        TextView textView9=(TextView)findViewById(R.id.num2);
        textView9.setText(dataWAT);

        String storewat=intent2.getStringExtra("watStore");
        TextView textView9_1=(TextView)findViewById(R.id.view2);
        textView9_1.setText(storewat);


        String dataBON=intent2.getStringExtra("bone");
        TextView textView10=(TextView)findViewById(R.id.num4);
        textView10.setText(dataBON);

        String storebon=intent2.getStringExtra("bonStore");
        TextView textView10_1=(TextView)findViewById(R.id.view4);
        textView10_1.setText(storebon);


        String dataMETA=intent2.getStringExtra("metabolism");
        TextView textView11=(TextView)findViewById(R.id.num5);
        textView11.setText(dataMETA);

        String storemeta=intent2.getStringExtra("metaStore");
        TextView textView11_1=(TextView)findViewById(R.id.view5);
        textView11_1.setText(storemeta);

     String sums=intent2.getStringExtra("SumStore");
     TextView textView12=(TextView)findViewById(R.id.sumst);
     textView12.setText(sums);

     String dataSum=intent2.getStringExtra("SUM");
     TextView textView13=(TextView)findViewById(R.id.text_view001);
     textView13.setText(dataSum);

        super.onCreate(savedInstanceState);

    }
    }
