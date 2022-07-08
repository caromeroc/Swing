package com.co.udea.mintic.model.figura;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(Double base, Double altura, Double radio) {
        Double areaCirculo = null;

        try {
            areaCirculo = Math.PI * (Math.pow(radio, 2));
        } catch (Exception e) {
            System.err.println("Se presento un error en el calculo del area del circulo " + e.getMessage() + "  Causa" + e.getCause());
        }

        return areaCirculo;
    }

    @Override
    public double calcularPerimetro(Double base, Double altura, Double radio) {
        Double perimetroCirculo = null;

        try {
            if (radio > 0) {
                perimetroCirculo = 2 * Math.PI * radio;
            } else {
                throw new Exception("Radio debe ser mayor a 0");
            }

        } catch (Exception e) {
            System.err.println("Se presento un error en el calculo del perimetro del circulo " + e.getMessage() + "  Causa" + e.getCause());
        }

        return perimetroCirculo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}

