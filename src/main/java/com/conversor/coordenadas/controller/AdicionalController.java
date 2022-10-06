package com.conversor.coordenadas.controller;

import com.conversor.coordenadas.model.SistemaGeocentrico;
import com.conversor.coordenadas.model.SistemaGeodesico;

import java.util.Arrays;
import java.util.List;

public class AdicionalController {

    private List<SistemaGeodesico> sistemaGeodesicoList;

    private List<SistemaGeocentrico> sistemaGeocentricoList;

    public AdicionalController(
            List<SistemaGeodesico> coordenadaGeodesica,
            List<SistemaGeocentrico> coordenadaGeocentrica
    ) {
        this.sistemaGeodesicoList = coordenadaGeodesica;
        this.sistemaGeocentricoList = coordenadaGeocentrica;

    }

    public Double distanciaGeodesica() {
        SistemaGeodesico coordenadaUno = sistemaGeodesicoList.get(0);
        SistemaGeodesico coordenadaDos = sistemaGeodesicoList.get(1);

        CoordenadaController controllerUno = new CoordenadaController(
                coordenadaUno
        );

        CoordenadaController controllerDos = new CoordenadaController(
                coordenadaDos
        );

        sistemaGeocentricoList = Arrays.asList(
                controllerUno.geodesicaToGeocentrica(),
                controllerDos.geodesicaToGeocentrica()
        );

        return distanciaGeocentrica();
    }

    public Double distanciaGeocentrica() {
        SistemaGeocentrico coordenadaUno = sistemaGeocentricoList.get(0);
        SistemaGeocentrico coordenadaDos = sistemaGeocentricoList.get(1);

        Double calculoX = Math.pow(
                (coordenadaDos.getX() - coordenadaUno.getX()),
                2
        );

        Double calculoY = Math.pow(
                (coordenadaDos.getY() - coordenadaUno.getY()),
                2
        );

        Double calculoZ = Math.pow(
                (coordenadaDos.getZ() - coordenadaUno.getZ()),
                2
        );

        return Math.sqrt(
                calculoX + calculoY + calculoZ
        );
    }

}
