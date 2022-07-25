package com.example.interfaceimplementation;

import com.example.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speaker {

    public String makeSound(){
        return "Bose Speaker Music Playing.....";
    }
}
