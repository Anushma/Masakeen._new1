package com.example.admin.masakeen.Model;

import com.orm.SugarRecord;

/**
 * Created by admin on 20-07-2016.
 */
public class Sub1 extends SugarRecord {
    private String type ;
    private String fare;
    long service_id;
    public Sub1() {
    }
    public Sub1(String type, String  fare,long service_id) {
        this.type = type;
        this.fare=fare;
        this.service_id=service_id;

    }
    public  String getType() {
        return type;
    }
    public  String getFare() {
        return fare;
    }
    public  void setType(String type) {
        this.type = type;
    }
    public  void setFare(String fare) {
        this.fare = fare;
    }
    public  long getService_id() {
        return service_id;
    }

    public  void setService_id(long service_id) {
        this.service_id = service_id;
    }



    @Override
    public String toString() {
        return "Type: " + type  +  "Fare:"     + fare +  "Id"    +  service_id ;

    }

}
