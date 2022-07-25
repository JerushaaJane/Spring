package com.example.interfaceimplementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {

    public String rotate(){
        return "Vehicle with Michelin Tyre is moving";
    }
}
