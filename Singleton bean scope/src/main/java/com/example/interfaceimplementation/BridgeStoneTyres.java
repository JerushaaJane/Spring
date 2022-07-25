package com.example.interfaceimplementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {

    public String rotate(){
        return "Vehicle with Bridge Stone Tyre is moving";
    }
}
