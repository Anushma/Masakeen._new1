package com.example.admin.masakeen.Model;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.masakeen.R;

/**
 * Created by admin on 20-07-2016.
 */
public class Subservices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);
        //save
        Sub1 ser = new Sub1("Classic AC Package","1900",1);
        ser.save();

        Sub1 ser1 = new Sub1("Comprehensive AC Package","3150",1);
        ser1.save();

        Sub1 ser2 = new Sub1("Basic Army takeover","1200",1);
        ser2.save();

        Sub1 ser3 = new Sub1("Full Army takeover","3600",1);
        ser3.save();

        Sub1 ser4 = new Sub1("Ultimate Army takeover","7200",1);
        ser4.save();

        Sub1 ser5 = new Sub1("Electrical work ","300",2);
        ser5.save();
        Sub1 ser6 = new Sub1("AC work","300",2);
        ser6.save();
        Sub1 ser7 = new Sub1("Fan repair","300",2);
        ser5.save();
        Sub1 ser8 = new Sub1("Repair of MCB","300",2);
        ser5.save();



    }

}

