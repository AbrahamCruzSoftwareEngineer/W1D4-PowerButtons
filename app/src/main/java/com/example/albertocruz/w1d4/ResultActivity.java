package com.example.albertocruz.w1d4;

//-------------------------------------//
//POWER BUTTONS: W1D4                  //
//-------------------------------------//
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView = (TextView) findViewById(R.id.resulttext);
        mTextView.setText(getIntent().getIntExtra(MainActivity.VALOR, -1) + "");
    }
}