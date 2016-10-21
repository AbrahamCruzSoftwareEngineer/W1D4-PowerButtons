package com.example.albertocruz.w1d4;

import android.annotation.SuppressLint;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//-------------------------------------//
//POWER BUTTONS: W1D4                  //
//-------------------------------------//

public class MainActivity extends AppCompatActivity {

    public static final String VALOR = "VALOR";
    private EditText mEditText;
    public int numero = Integer.parseInt(mEditText.getText().toString());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.textViewfisrtscreen);
    }

    public void power2(View view) {


        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(VALOR, numero * numero);
        startActivity(intent);
    }

    public void power3(View view) {


        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(VALOR, numero * numero * numero);
        startActivity(intent);
    }

    public void power4(View view) {


        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(VALOR, numero * numero * numero * numero);
        startActivity(intent);
    }
}