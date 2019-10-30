package com.example.myapplication1017;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;


public class Main2Activity extends AppCompatActivity {
private int i;
private int j,w,a,store_bfr,store_wat,store_mus,store_bon,store_meta,store_bmi;
private double wst,bmi,bfr,wat,mus,bon,meta,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main3);




        Button button2=(Button)findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener(){
       @Override
        public void onClick(View view){


       Intent intent2=new Intent(Main2Activity.this,MainActivity.class);

           EditText editText=(EditText)findViewById(R.id.edit_text1);

                   String message=editText.getText().toString();
           i=Integer.parseInt(editText.getText().toString());
       intent2.putExtra("heightData",message);

           EditText editTextSex=(EditText)findViewById(R.id.edit_sex);
           j=Integer.parseInt(editTextSex.getText().toString());
           EditText editTextWeight=(EditText)findViewById(R.id.edit_text2);
           w=Integer.parseInt(editTextWeight.getText().toString());
           EditText editTextAge=(EditText)findViewById(R.id.edit_age);
           a=Integer.parseInt(editTextAge.getText().toString());

           bmi=w/(i*i*0.01*0.01);

           bon=(w-a)*0.2;
           BigDecimal bgbon = new BigDecimal(bon);
           double bon1 = bgbon.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
           String bons=Double.toString(bon1);
           String dataBON=bons;
           intent2.putExtra("bone",dataBON);

           if(bon<-4)
           {
               String storebon="风险高";
               intent2.putExtra("bonStore", storebon);
               store_bon=50;
           }else if((bon>=-4)&&(bon<=-1))
           {
               String storebon="中度风险";
               intent2.putExtra("bonStore", storebon);
               store_bon=70;
           }
           else if(bon>-1)
           {
               String storebon="风险低";
               intent2.putExtra("bonStore", storebon);
               store_bon=100;
           }




       if(j==1)
   {    wst=(i-80)*0.7;

     bfr=1.2*bmi+0.23*a-5.4-10.8;
       BigDecimal bg = new BigDecimal(bfr);
       double bfr1 = bg.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
       String bfrs = Double.toString(bfr1);
     String dataBFR=bfrs+"%";
     intent2.putExtra("bodyFatRate",dataBFR);

     if((bfr>8)&&(bfr<=15))
     {
         String storebfr="过瘦";
         intent2.putExtra("bfrStore", storebfr);
         store_bfr=70;
     }else if((bfr>15)&&(bfr<=25))
     {
         String storebfr="正常";
         intent2.putExtra("bfrStore", storebfr);
         store_bfr=100;
     }
     else if((bfr>25)&&(bfr<=35))
     {
         String storebfr="超重";
         intent2.putExtra("bfrStore", storebfr);
         store_bfr=70;
     }

     mus=100*78/(w*2);
     BigDecimal bgmus=new BigDecimal(mus);
     double mus1=bgmus.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
     String muss=Double.toString(mus1);
     String dataMUS=muss+"%";
     intent2.putExtra("muscle",dataMUS);

     if(mus<=60)
     {
         String storemus="偏低";
         intent2.putExtra("musStore",storemus);
         store_mus=60;
     }else if((mus>60)&&(mus<=65))
     {
         String storemus="正常";
         intent2.putExtra("musStore",storemus);
         store_mus=80;
     }
     else if(mus>65)
     {
         String storemus="优秀";
         intent2.putExtra("musStore",storemus);
         store_mus=100;
     }


     wat=mus*1.2;
     BigDecimal bgwat=new BigDecimal(wat);
     double wat1=bgwat.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
     String wats=Double.toString(wat1);
     String dataWAT=wats+"%";
     intent2.putExtra("water",dataWAT);
     if(wat<70)
     {
         store_wat=70;
     }else if((wat>=70)&&(wat<=80))
     {
         store_wat=100;
     }else if(wat>80)
     {
         store_wat=70;
     }


     meta=13.7*w+5*i-6.8*a+66;

       BigDecimal bgmeta = new BigDecimal(meta);
       double meta1 = bgmeta.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
       String dataMETA=Double.toString(meta1);
     intent2.putExtra("metabolism",dataMETA);


   if(meta<1300)
   {
       String storemeta="偏低";
       intent2.putExtra("metaStore", storemeta);
       store_meta=70;
   }
   else if((meta>=1300)&&(meta<=1900))
   {
       String storemeta="正常";
       intent2.putExtra("metaStore", storemeta);
       store_meta=100;
   }else if(meta>1900)
   {
       String storemeta="偏高";
       intent2.putExtra("metaStore", storemeta);
       store_meta=70;
   }




   if (i >= 160) {
          String dataHeight = "标准";
          intent2.putExtra("heightStandard", dataHeight);
    }
      else{
          String dataHeight2="偏低";
          intent2.putExtra("heightStandard",dataHeight2);
    }



      if((w<=1.1*wst)&&(w>=0.9*wst))
      {String dataWeight="标准";
          intent2.putExtra("WeightStd",dataWeight);
      }else if((w>1.1*wst)&&(w<=1.2*wst))
      {
          String dataWeight="偏重";
          intent2.putExtra("WeightStd",dataWeight);
      }else if((w>=0.8*wst)&&(w<0.9*wst))
      {
          String dataWeight="偏轻";
          intent2.putExtra("WeightStd",dataWeight);
      }else if(w>1.2*wst)
      {
          String dataWeight="肥胖";
          intent2.putExtra("WeightStd",dataWeight);
      }
      else if(w<0.8*wst)
      {
          String dataWeight="营养不良";
          intent2.putExtra("WeightStd",dataWeight);
      }
   }


    else if(j==0){
        wst=(i-70)*0.6;

           bfr=1.2*bmi+0.23*a-5.4;
           BigDecimal bg = new BigDecimal(bfr);
           double bfr1 = bg.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();

           if((bfr>10)&&(bfr<=20))
           {
               String storebfr="过瘦";
               intent2.putExtra("bfrStore", storebfr);
               store_bfr=70;
           }else if((bfr>20)&&(bfr<=30))
           {
               String storebfr="正常";
               intent2.putExtra("bfrStore", storebfr);
               store_bfr=100;
           }
           else if((bfr>30)&&(bfr<=45))
           {
               String storebfr="超重";
               intent2.putExtra("bfrStore", storebfr);
               store_bfr=70;
           }

           String bfrs = Double.toString(bfr1);
           String dataBFR=bfrs+"%";
           intent2.putExtra("bodyFatRate",dataBFR);

           mus=100*56/(w*2);
           BigDecimal bgmus=new BigDecimal(mus);
           double mus1=bgmus.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
           String muss=Double.toString(mus1);
           String dataMUS=muss+"%";
           intent2.putExtra("muscle",dataMUS);

           if(mus<=55)
           {
               String storemus="偏低";
               intent2.putExtra("musStore",storemus);
               store_mus=60;
           }else if((mus>55)&&(mus<=60))
           {
               String storemus="正常";
               intent2.putExtra("musStore",storemus);
               store_mus=80;
           }
           else if(mus>60)
           {
               String storemus="优秀";
               intent2.putExtra("musStore",storemus);
               store_mus=100;
           }

           wat=mus*1.3;
           BigDecimal bgwat=new BigDecimal(wat);
           double wat1=bgwat.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
           String wats=Double.toString(wat1);
           String dataWAT=wats+"%";
           intent2.putExtra("water",dataWAT);

           if(wat<70)
           {
               store_wat=70;
           }else if((wat>=70)&&(wat<=80))
           {
               store_wat=100;
           }else if(wat>80)
           {
               store_wat=70;
           }

           meta=9.6*w+1.8*i-4.7*a+655;
           BigDecimal bgmeta = new BigDecimal(meta);
           double meta1 = bgmeta.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
           String dataMETA=Double.toString(meta1);
           intent2.putExtra("metabolism",dataMETA);

           if(meta<1100)
           {
               String storemeta="偏低";
               intent2.putExtra("metaStore", storemeta);
               store_meta=70;
           }
           else if((meta>=1100)&&(meta<=1500))
           {
               String storemeta="正常";
               intent2.putExtra("metaStore", storemeta);
               store_meta=100;
           }else if(meta>1500)
           {
               String storemeta="偏高";
               intent2.putExtra("metaStore", storemeta);
               store_meta=70;
           }

           if (i >= 150) {
               String dataHeight1 = "标准";
               intent2.putExtra("heightStandard", dataHeight1);
           } else {
               String dataHeight2 = "偏低";
               intent2.putExtra("heightStandard", dataHeight2);
           }


           if((w<=1.1*wst)&&(w>=0.9*wst))
           {String dataWeight="标准";
               intent2.putExtra("WeightStd",dataWeight);
           }else if((w>1.1*wst)&&(w<=1.2*wst))
           {
               String dataWeight="偏重";
               intent2.putExtra("WeightStd",dataWeight);
           }else if((w>=0.8*wst)&&(w<0.9*wst))
           {
               String dataWeight="偏轻";
               intent2.putExtra("WeightStd",dataWeight);
           }else if(w>1.2*wst)
           {
               String dataWeight="肥胖";
               intent2.putExtra("WeightStd",dataWeight);
           }
           else if(w<0.8*wst)
           {
               String dataWeight="营养不良";
               intent2.putExtra("WeightStd",dataWeight);
           }
       }

    if(wat<70)
    {
        String storewat="偏低";
        intent2.putExtra("watStore",storewat);
    }else if((wat>=70)&&(wat<=80))
    {
        String storewat="正常";
        intent2.putExtra("watStore",storewat);
    }
    else if(wat>80)
    {
        String storewat="偏高";
        intent2.putExtra("watStore",storewat);
    }
           BigDecimal bgBmi = new BigDecimal(bmi);
           double bmi1 = bgBmi.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
           String dataBMIs = Double.toString(bmi1);
           intent2.putExtra("BMIs",dataBMIs);


    if((bmi>=10)&&(bmi<=18.5))
      {
        store_bmi=75;

        String dataBMI="过轻";
        intent2.putExtra("BMI",dataBMI);
       }else if((bmi>18.5)&&(bmi<=24))
    {
        store_bmi=100;

        String dataBMI="正常";
        intent2.putExtra("BMI",dataBMI);
    } else if ((bmi>24)&&(bmi<=28))
    {
        store_bmi=80;

        String dataBMI="超重";
        intent2.putExtra("BMI",dataBMI);
    }else if((bmi>28)&&(bmi<=35))
    {
       store_bmi=60;

        String dataBMI="肥胖";
        intent2.putExtra("BMI",dataBMI);
    }

      sum=store_bmi*0.5+store_bfr*0.1+store_wat*0.1+store_mus*0.1+store_bon*0.1+store_meta*0.1;

           String sums = Double.toString(sum);

           intent2.putExtra("SumStore",sums);

         if(sum<70)
         {
             String dataSum="较差";
             intent2.putExtra("SUM",dataSum);
         }else if((sum>=70)&&(sum<85))
         {
             String dataSum="良好";
             intent2.putExtra("SUM",dataSum);
         }else if((sum>=85)&&(sum<=100))
         {
             String dataSum="优秀";
             intent2.putExtra("SUM",dataSum);
         }


        EditText editText2 = (EditText) findViewById(R.id.edit_text2);

           String message2=editText2.getText().toString();
           intent2.putExtra("weightData",message2);


       startActivity(intent2);
       }

    });





        super.onCreate(savedInstanceState);





}


}
