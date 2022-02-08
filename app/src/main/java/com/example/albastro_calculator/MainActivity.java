package com.example.albastro_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddBT(View view){
        EditText et1 =(EditText)findViewById(R.id.editTextNumberDecimal);
        EditText et2 =(EditText)findViewById(R.id.editTextNumberDecimal2);
        TextView et3 =(TextView)findViewById(R.id.textView3);


        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double result = n1+n2;

        et3.setText("" + result);
    }

    public void SubBT(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumberDecimal);
        EditText et2 =(EditText)findViewById(R.id.editTextNumberDecimal2);
        TextView et3 =(TextView)findViewById(R.id.textView3);


        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double result = n1-n2;

        et3.setText("" + result);
        }

    public void MultiplyBT(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumberDecimal);
        EditText et2 =(EditText)findViewById(R.id.editTextNumberDecimal2);
        TextView et3 =(TextView)findViewById(R.id.textView3);


        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double result = n1*n2;

        et3.setText("" + result);
        }

    public void DivideBT(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumberDecimal);
        EditText et2 =(EditText)findViewById(R.id.editTextNumberDecimal2);
        TextView et3 =(TextView)findViewById(R.id.textView3);


        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double result = n1/n2;

        et3.setText("" + result);
        }

    public void ModuloBT(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumberDecimal);
        EditText et2 =(EditText)findViewById(R.id.editTextNumberDecimal2);
        TextView et3 =(TextView)findViewById(R.id.textView3);


        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());
        double result = n1%n2;

        et3.setText("" + result);
        }

}
