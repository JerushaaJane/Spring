package com.example.beans;

public class Vehicle {


    /*public Vehicle(){
        System.out.println("Vehicle bean created");
    }*/

    public String veh;

    public String getVeh(){return  veh;}

    public void setVeh(String veh){this.veh=veh;}

    @Override
    public String toString(){
        return veh;
    }

}
