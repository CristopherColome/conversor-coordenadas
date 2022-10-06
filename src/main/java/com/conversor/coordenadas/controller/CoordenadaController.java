package com.conversor.coordenadas.controller;

import com.conversor.coordenadas.model.Datum;
import com.conversor.coordenadas.model.SistemaGeocentrico;
import com.conversor.coordenadas.model.SistemaGeodesico;

public class CoordenadaController {


    private SistemaGeodesico coordenadaGeodesica;

    private SistemaGeocentrico coordenadaGeocentrica;


    public CoordenadaController(SistemaGeodesico coordenadaGeodesica) {
        this.coordenadaGeodesica = coordenadaGeodesica;
    }

    public CoordenadaController(SistemaGeocentrico coordenadaGeocentrica) {
        this.coordenadaGeocentrica = coordenadaGeocentrica;
    }


    public static void main(String[] args) throws InterruptedException {


           /*     coordenadaGeodesica.setLatitud(-12.0646728442914);
        coordenadaGeodesica.setLongitud(-77.0375725237244);
        coordenadaGeodesica.setAltura(161.0);*/

        SistemaGeodesico coordenadaGeodesica = new SistemaGeodesico();
        coordenadaGeodesica.setDatum(Datum.Sistema.WSG84.load());
        coordenadaGeodesica.setLatitud(-22.1681111111);
        coordenadaGeodesica.setLongitud(-60.2563888889);
        coordenadaGeodesica.setAltura(1250.0);

        System.out.println("IN");
        System.out.println(coordenadaGeodesica);

        CoordenadaController cdes = new CoordenadaController(
                coordenadaGeodesica
        );
        SistemaGeocentrico sistemaGeocentrico = cdes.geodesicaToGeocentrica();
        sistemaGeocentrico.setDatum(Datum.Sistema.WSG84.load());
    /*          2932387.001
                -5131941.357
                -2392133.991
                */
        System.out.println(sistemaGeocentrico);

        CoordenadaController ccen = new CoordenadaController(
                sistemaGeocentrico
        );

        SistemaGeodesico sistemaGeodesico = ccen.geocentricoToGeodesico();


        System.out.println("OUT");
        System.out.println(sistemaGeodesico);

    }

    public SistemaGeocentrico geodesicaToGeocentrica() {

        SistemaGeocentrico sistemaGeocentrico = new SistemaGeocentrico();

        Double latitudCos = coordenadaGeodesica.getLatitudCos();
        Double letitudSin = coordenadaGeodesica.getLatitudSin();

        Double longitudCos = coordenadaGeodesica.getLongitudCos();
        Double longitudSin = coordenadaGeodesica.getLongitudSin();


        sistemaGeocentrico.setX(
                (coordenadaGeodesica.getRadioCurvatura() + coordenadaGeodesica.getAltura()) *
                        (latitudCos * longitudCos)
        );

        sistemaGeocentrico.setY(
                (coordenadaGeodesica.getRadioCurvatura() + coordenadaGeodesica.getAltura()) *
                        (latitudCos * longitudSin)
        );

        sistemaGeocentrico.setZ(
                (
                        coordenadaGeodesica.getRadioCurvatura() *
                                (Math.pow(coordenadaGeodesica.getDatum().getSemiejeMenor(), 2) /
                                        Math.pow(coordenadaGeodesica.getDatum().getSemiejeMayor(), 2)
                                ) +
                                coordenadaGeodesica.getAltura()
                ) * letitudSin
        );

        return sistemaGeocentrico;
    }

    public SistemaGeodesico geocentricoToGeodesico() {

        SistemaGeodesico sistemaGeodesico = new SistemaGeodesico();

        sistemaGeodesico.setDatum(coordenadaGeocentrica.getDatum());

        Double ecuacionLatitud1 = coordenadaGeocentrica.getZ() +
                (coordenadaGeocentrica.getDatum().getSegundaExcentricidad() *
                        coordenadaGeocentrica.getDatum().getSemiejeMenor()
                ) * Math.pow(
                        Math.sin(coordenadaGeocentrica.getRadioCircunferencia()), 3
                );

        Double ecuacionLatitud2 = (Math.sqrt(
                Math.pow(coordenadaGeocentrica.getX(), 2) + Math.pow(coordenadaGeocentrica.getY(), 2)
        )) - (coordenadaGeocentrica.getDatum().getPrimeraExcentricidad() *
                coordenadaGeocentrica.getDatum().getSemiejeMayor()
        ) * (Math.pow(
                Math.cos(coordenadaGeocentrica.getRadioCircunferencia()), 3
        ));

        sistemaGeodesico.setLatitud(
                (
                        (Math.atan(ecuacionLatitud1 / ecuacionLatitud2)) * 180
                ) / Math.PI
        );

        sistemaGeodesico.setLongitud(
                (
                        Math.atan(coordenadaGeocentrica.getY()/coordenadaGeocentrica.getX()) * 180
                ) / Math.PI
        );

        sistemaGeodesico.setAltura(
                (Math.sqrt(
                        Math.pow(coordenadaGeocentrica.getX(), 2) + Math.pow(coordenadaGeocentrica.getY(), 2)
                )) / sistemaGeodesico.getLatitudCos() - sistemaGeodesico.getRadioCurvatura()
        );

        return sistemaGeodesico;
    }


}
