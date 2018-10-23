package my.edu.tarc.lab2bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Lab2BMIResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bmiresult);

        TextView result;
        result = findViewById(R.id.result);

        Intent intent = getIntent();
        if(intent.hasExtra(MainActivity.TAG_MESSAGE)){
            String stringMsgResult = intent.getStringExtra(MainActivity.TAG_MESSAGE);
            result.setText(stringMsgResult);
        }


    }
}
