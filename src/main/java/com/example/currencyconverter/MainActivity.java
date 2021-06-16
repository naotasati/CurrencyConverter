package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ClickConvert(View view){
        Log.i("myTag", "Conversion detected");
        EditText value1 = (EditText) findViewById(R.id.txtNumber);
        String amountPounds = value1.getText().toString();
        double amountInPoundsDouble = Double.parseDouble(amountPounds);
        double amountInDollarsDouble = amountInPoundsDouble * 1.33;
        //String totalDollars =  Double.toString(amountInDollarsDouble);
        String totalDollars = String.format("%.2f",amountInDollarsDouble );
        Log.i("Total Dollars", totalDollars);
        ImageView image = (ImageView)  findViewById(R.id.imageView);
        image.setImageResource(R.drawable.slap2);
        Toast.makeText(this,"€"+amountPounds + "  are  $"+totalDollars, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}