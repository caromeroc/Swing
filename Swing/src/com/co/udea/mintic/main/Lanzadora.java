package com.co.udea.mintic.main;

import com.co.udea.mintic.controller.ControllerCalc;


public class Lanzadora {
    
    public static void main(String[] args) {
        ControllerCalc objContr = new ControllerCalc();
        String data = "7+3+5-3+6+4-3/5*3";

        System.out.println("" + objContr.a(data));

    }
    
}
