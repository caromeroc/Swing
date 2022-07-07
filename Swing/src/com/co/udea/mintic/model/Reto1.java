package com.co.udea.mintic.model;

import java.util.ArrayList;
import java.util.Collections;

public class Reto1 {

    public int[] procesar(int[] datos) {
        int[] salida = {0, 0, 0};

        int suma = 0;
        int max = 0;
        int min = 0;

        ArrayList<Integer> arrayNew = new ArrayList<>(datos.length);

        for (Integer i : datos) {
            arrayNew.add(i);
            suma += i;
        }
        
        max = Collections.max(arrayNew);
        min = Collections.min(arrayNew);
        
        salida[0]= suma;
        salida[1]= max;
        salida[2] = min;
        
        return salida;
    }

}
