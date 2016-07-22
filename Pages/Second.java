package com.example.admin.masakeen.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.masakeen.R;

/**
 * Created by admin on 20-07-2016.
 */
public class Second  extends AppCompatActivity {
    TextView txt5,txt3,txt7;
    EditText edt4,edt,edt1,edt2,edt9,edt3;
    Button b2,b5,b6;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        txt5 = (TextView) findViewById(R.id.textview5);
        txt3 = (TextView) findViewById(R.id.textview3);
        txt7 = (TextView) findViewById(R.id.textview7);
        edt3 = (EditText) findViewById(R.id.editText3);
        edt9 = (EditText) findViewById(R.id.editText9);

        edt = (EditText) findViewById(R.id.editText);

        edt1 = (EditText) findViewById(R.id.editText1);

        edt2 = (EditText) findViewById(R.id.editText2);
        b2 = (Button) findViewById(R.id.button2);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);


        Intent intent2 = getIntent();

        //  String ser = intent2.getStringExtra("services");
        //  String cat= intent2.getStringExtra("category");

        Bundle bundle = intent2.getExtras();
        String ser = bundle.getString("services");
        String cat = bundle.getString("category");


        txt7.setText(":  "+ser.toString());
        txt5.setText(":  "+cat.toString());




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Second.this, Third.class);


                intent3.putExtra("category",txt5.getText().toString());

                //startActivity(intent1);

                startActivityForResult(intent3,3);
            }
        });

    }


    public void mt(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}


