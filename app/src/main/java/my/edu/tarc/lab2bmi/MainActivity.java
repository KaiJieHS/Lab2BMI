package my.edu.tarc.lab2bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_MESSAGE = "my.edu.tarc.lab2intent.MESSAGE";
    private EditText textViewWeight ;
    private EditText textViewHeight ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewWeight = findViewById(R.id.textViewWeight);
        textViewHeight = findViewById(R.id.textViewHeight);

    }

    public void CalculateBMI(View view){
        int stringMessageWeight;
        int stringMessageHeight;
        int BMIResult;

        if(TextUtils.isEmpty(textViewWeight.getText())){
            textViewWeight.setError("Please enter your weight");
            return;
        }
        if(TextUtils.isEmpty(textViewHeight.getText())){
            textViewHeight.setError("Please enter your height");
            return;
        }
        stringMessageWeight = Integer.parseInt(textViewWeight.getText().toString());
        stringMessageHeight = Integer.parseInt(textViewHeight.getText().toString());

        BMIResult = stringMessageWeight / (stringMessageHeight/100) * (stringMessageHeight/100);


        Intent intent = new Intent(this,Lab2BMIResult.class);
        intent.putExtra(TAG_MESSAGE,String.valueOf(BMIResult));
        startActivity(intent);


    }
}
