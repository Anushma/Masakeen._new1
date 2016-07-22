package com.example.admin.masakeen.Pages;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.masakeen.R;


/**
 * Created by admin on 20-07-2016.
 */
public class First extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6;
    EditText ed1, ed2, ed4;

    TextView tx1, tx4, tx2;
    int counter = 3;

    Spinner sp;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        sp = (Spinner) findViewById(R.id.spinner1);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                        Toast.LENGTH_SHORT).show();

            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

        b1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);

        b2 = (Button) findViewById(R.id.button2);
        tx1=(TextView)findViewById(R.id.textview);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        tx4=(TextView)findViewById(R.id.textview4);
        tx2=(TextView)findViewById(R.id.textview2);
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("admin") &&

                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(First.this, Second.class);

                intent1.putExtra("services",sp.getSelectedItem().toString());
                intent1.putExtra("category",tx4.getText().toString());

                //startActivity(intent1);

                startActivityForResult(intent1,1);
            }
        });


    }



    public void mt(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }



}


