package com.example.admin.masakeen.Model;

import com.orm.SugarRecord;

/**
 * Created by admin on 19-07-2016.
 */
public class Services extends SugarRecord {
    private String type ;

    public Services() {
    }
    public Services(String type) {
        this.type = type;

    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Type: " + type ;

    }

}
