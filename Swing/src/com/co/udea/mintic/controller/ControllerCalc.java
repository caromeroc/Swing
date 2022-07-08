package com.co.udea.mintic.controller;

import com.co.udea.mintic.model.Calculadora;

public class ControllerCalc {

    Calculadora objCalc = new Calculadora();

    public double a(String data) {

        
        return objCalc.procesar(data);
        
        // Llamado a la Base de datos para persistir.
        // llamado a una notifición SMS

    }

}
