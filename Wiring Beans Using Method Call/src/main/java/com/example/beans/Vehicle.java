package com.example.beans;

public class Vehicle {
    public String vname;

    public String getVname(){return vname;}

    public void setVname(String vname){this.vname=vname;}

    public Vehicle(){System.out.println("Vehicle Bean created");}

    @Override
    public String toString(){
        return "Vehicle name is - "+vname;
    }



}
