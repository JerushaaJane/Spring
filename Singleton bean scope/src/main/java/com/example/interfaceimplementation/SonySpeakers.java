package com.example.interfaceimplementation;

import com.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speaker {

    public String makeSound(){
        return "Sony Speaker Music Playing.....";
    }
}
