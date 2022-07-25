package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("vehiclebean")
public class Vehicle {

    @Autowired
    public Vehicle(@Qualifier("vehicleservicesbean") VehicleServices services){
       this.vservice=services;
    }

    public String veh;
    public final VehicleServices vservice;

    public String getVeh() {
        return veh;
    }

    public void setVeh(String veh) {
        this.veh = veh;
    }

    public VehicleServices getVservice() {
        return vservice;
    }

    @PostConstruct
    public String vehInitialize(){
        veh="Benz";
        return veh;
    }
}
