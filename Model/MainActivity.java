package com.example.admin.masakeen.Model;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.masakeen.R;


/**
 * Created by admin on 19-07-2016.
 */
public class MainActivity extends AppCompatActivity {
    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //save
        Services contact = new Services("AMC Services");
        contact.save();

        Services contact1 = new Services("Beautician");
        contact1.save();

        Services contact2 = new Services("Electrician");
        contact2.save();

        Services contact3=new Services("Plumbing");
        contact3.save();

        Services contact4=new Services("Home appliances");
        contact4.save();
        Services contact5=new Services("Home Cleaning");
        contact5.save();
        Services contact6=new Services("Carpentry");
        contact6.save();
        Services contact7=new Services("Home appliance repair");
        contact7.save();

    }

}

