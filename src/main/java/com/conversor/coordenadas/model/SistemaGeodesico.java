package com.conversor.coordenadas.model;

public class SistemaGeodesico extends Coordenada {

    private Double latitud;

    private Double longitud;

    private Double altura;


    public Double getRadioCurvatura() {
        return getDatum().getSemiejeMayor() /
                Math.sqrt(
                        1 - getDatum().getPrimeraExcentricidad() *
                                Math.pow(getLatitudSin(), 2)
                );
    }

    public Double getLatitudSin(){
        return Math.sin(Math.toRadians(latitud));
    }

    public Double getLongitudSin(){
        return Math.sin(Math.toRadians(longitud));
    }

    public Double getLatitudCos(){
        return Math.cos(Math.toRadians(latitud));
    }

    public Double getLongitudCos(){
        return Math.cos(Math.toRadians(longitud));
    }

    // <editor-fold defaultstate="collapsed" desc="GET AND SET">
    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    // </editor-fold>


    @Override
    public String toString() {
        return "SistemaGeodesico{" +
                "latitud=" + latitud +
                ", longitud=" + longitud +
                ", altura=" + altura +
                '}';
    }
}
