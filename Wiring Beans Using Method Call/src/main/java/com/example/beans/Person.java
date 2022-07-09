package com.example.beans;

public class Person {
    public String pname;
    public Vehicle veh;

    public String getPname() {
        return pname;
    }

    public Vehicle getVeh() {
        return veh;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setVeh(Vehicle veh) {
        this.veh = veh;
    }
    public Person(){System.out.println("Person bean created");}
}
