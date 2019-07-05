package com.example.basiccalc;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText field1;
    EditText field2;
    Button mode;
    Button calculate;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        field1 = findViewById(R.id.editText1);
        field2 = findViewById(R.id.editText2);
        result = findViewById(R.id.result);
        mode = findViewById(R.id.button_mode);
        mode.setText("MODE_ADDITION");
        mode.setTag(1);

        calculate = findViewById(R.id.button_calc);

    }

    public void onModeChanged(View view)
    {
        int m = Integer.parseInt(mode.getTag().toString());

        switch (m)
        {
            case 1: mode.setTag(2);
                mode.setText("MODE_SUBTRACTION");
                break;
            case 2: mode.setTag(3);
                mode.setText("MODE_MULTIPLICATION");
                break;
            case 3: mode.setTag(4);
                mode.setText("MODE_DIVISION");
                break;
            case 4: mode.setTag(1);
                mode.setText("MODE_ADDITION");
                break;
        }

      }

    public void onCalculate(View view)
    {
        String s1, s2;
        double sum=0.0,a, b;


        s1 = field1.getText().toString();
        s2 = field2.getText().toString();

        int k = Integer.parseInt(mode.getTag().toString());

        a = Double.parseDouble(s1);
        b = Double.parseDouble(s2);

             if(k == 1)
           sum = a+b;
        else if(k==2)
            sum = a-b;
        else if(k==3)
            sum = a*b;
        else if(k==4)
            sum = a/b;




        result.setText(sum+" ");


    }
}
