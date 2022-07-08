package com.co.udea.mintic.model.figura;

public class Cuadrado extends Figura {

    private double base;
    private double altura;

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(Double base, Double altura, Double radio) {

        Double areaCuadrado = null;

        try {
            areaCuadrado = base * altura;
        } catch (Exception e) {
            System.err.println("Se presento un error en el calculo del area del cuadrado " + e.getMessage() + "  Causa" + e.getCause());
        }

        return areaCuadrado;
    }

    @Override
    public double calcularPerimetro(Double base, Double altura, Double diametro) {
        Double perimetroCuadrado = null;

        try {
            perimetroCuadrado = (base * 2) + (altura * 2);
        } catch (Exception e) {
            System.err.println("Se presento un error en el calculo del perimetro del cuadrado " + e.getMessage() + "  Causa" + e.getCause());
        }

        return perimetroCuadrado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
