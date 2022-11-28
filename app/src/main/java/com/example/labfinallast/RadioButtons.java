package com.example.labfinallast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtons extends AppCompatActivity {
    RadioGroup rd1,rd2;

    TextView txtFlag;
    TextView Result ;

    Button Submit ;
    Button nextActivity ;

    RadioButton str1;
    RadioButton str2;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        txtFlag = findViewById(R.id.FlagText);
        Result = findViewById(R.id.ansOutputTxt);


        rd1 = findViewById(R.id.rd1grp);
        rd2 = findViewById(R.id.rd2grp);
        Submit = findViewById(R.id.rdSubmitBtn);
        nextActivity = findViewById(R.id.nextButton);



        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        txtFlag.setText(str);







        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = rd1.getCheckedRadioButtonId();
                str1 = (RadioButton) findViewById(selectedId);
                int selectedId2 = rd2.getCheckedRadioButtonId();
                str2 =  (RadioButton) findViewById(selectedId2);

                String x = str1.getText().toString();
                String y = str2.getText().toString();
                String ans = "Answer is "+ x+y;

                Result.setText(ans);
            }
        });



  nextActivity.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent = new Intent(getApplicationContext(), RatingBars.class);

          startActivity(intent);

      }
  });



    }






    }



