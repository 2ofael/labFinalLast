package com.example.labfinallast;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String sent ="Argentina" ;
    String[] Flags = {"Arengentina", "Brazil" , "Arab"};
    Button btn;
    Intent intent = new Intent(getApplicationContext(), RadioButtons.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp = findViewById(R.id.SpFlag);
         btn = findViewById(R.id.SpButton);

        ArrayAdapter adapter = new ArrayAdapter(this , android.R.layout.simple_spinner_dropdown_item,Flags);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                sent = sp.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), RadioButtons.class);
                intent.putExtra("message_key", sent);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {





    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}