package com.co.udea.mintic.model;

public class Calculadora {

    public Calculadora() {
    }

    public double procesar(String data) {
        double totalTemp = Character.getNumericValue(data.charAt(0));

        for (int i = 1; i < data.length(); i++) {
            if (String.valueOf(data.charAt(i)).matches("[%*+\\/-]")) {

                switch (String.valueOf(data.charAt(i))) {
                    case "+":

                        totalTemp = totalTemp + Character.getNumericValue(data.charAt(i + 1));
                        break;

                    case "-":

                        totalTemp = totalTemp - Character.getNumericValue(data.charAt(i + 1));
                        break;
                    case "*":

                        totalTemp = totalTemp * Character.getNumericValue(data.charAt(i + 1));
                        break;
                    case "/":

                        totalTemp = totalTemp / Character.getNumericValue(data.charAt(i + 1));
                        break;
                    default:
                        System.out.println(" Opción no evaluada ");
                        break;
                }

            }

        }

        return totalTemp;

    }

}
