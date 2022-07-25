package com.example.beans;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleservicesbean")
public class VehicleServices {

    @Autowired
    public Speaker speaker;
    @Autowired
    public Tyres tyres;

    public void playMusic(){
        String music=speaker.makeSound();
        System.out.println(music);
    }
    public void moveVehicle(){
        String move=tyres.rotate();
        System.out.println(move);
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
