package com.co.udea.mintic.model.figura;

public abstract class Figura {

    private double area;
    private double perimetro;

    public Figura() {
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public abstract double calcularArea(Double base, Double altura, Double radio);

    public abstract double calcularPerimetro(Double base, Double altura, Double radio);
}
