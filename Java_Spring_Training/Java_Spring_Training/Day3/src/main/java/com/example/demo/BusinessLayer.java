
package com.example.demo;

import org.springframework.stereotype.Component;

@Component(" business-layer-bean-annotation")
public class BusinessLayer {
    private Calculator calculator;
    BusinessLayer(Calculator calculator){
        this.calculator = calculator;;
    }
    public void rumMyLogic(){
        System.out.println(this.calculator.add(2,5));



    }
}

