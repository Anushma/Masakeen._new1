package com.example.admin.masakeen.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.masakeen.R;

/**
 * Created by admin on 21-07-2016.
 */
public class Third extends AppCompatActivity {

    TextView txt1,txt,txt3,txt4;
    EditText edt2,edt;
    Button b2,b1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.third);

        txt = (TextView) findViewById(R.id.textview);
        txt1 = (TextView) findViewById(R.id.textview1);
        txt3 = (TextView) findViewById(R.id.textview3);
        txt4 = (TextView) findViewById(R.id.textview4);

        edt = (EditText) findViewById(R.id.editText);

        edt2 = (EditText) findViewById(R.id.editText2);


        b2 = (Button) findViewById(R.id.button1);
        b1 = (Button) findViewById(R.id.button);


        Intent intent3 = getIntent();

        //  String ser = intent2.getStringExtra("services");
        //  String cat= intent2.getStringExtra("category");

        Bundle bundle = intent3.getExtras();
        String cat = bundle.getString("category");


        txt4.setText(":  "+cat.toString());




    }

    public void mt(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}



