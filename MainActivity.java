package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText operasi, n1, n2;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.hitung);
        n1 =  findViewById(R.id.number1);
        n2 =  findViewById(R.id.number2);
        operasi =  findViewById(R.id.operasi);
        textview = findViewById(R.id.hasil);

    }
    public  void kalkulasi(View view){
        int number1 = Integer.parseInt(n1.getText().toString());
        int number2 = Integer.parseInt(n2.getText().toString());
        String operasional = operasi.getText().toString();
        double hasil;

        if (operasional.equals("+")) {
            hasil = number1+number2;
            textview.setText("Hasil Operasi adalah " +hasil);
        } else if (operasional.equals("-")) {
            hasil = number1-number2;
            textview.setText("Hasil Operasi adalah " +hasil);
        }else if (operasional.equals("/")){
            hasil = number1/number2;
            textview.setText("Hasil Operasi adalah " +hasil);
        } else if (operasional.equals("*")){
            hasil = number1*number2;
            textview.setText("Hasil Operasi adalah " +hasil);
        }else{
            textview.setText("Tidak ada dalam operasi");
        }
    }
}