package com.conversor.coordenadas.model;

public class SistemaGeocentrico extends Coordenada {

    private Double x;

    private Double y;

    private Double z;


    public Double getRadioCircunferencia() {
        return Math.atan(
                (getZ() * getDatum().getSemiejeMayor()) /
                        (Math.sqrt(
                                (Math.pow(getX(), 2)) + (Math.pow(getY(), 2))
                        ) * getDatum().getSemiejeMenor())
        );
    }

    // <editor-fold defaultstate="collapsed" desc="GET AND SET">
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }
    // </editor-fold>

    @Override
    public String toString() {
        return "SistemaGeocentrico{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
