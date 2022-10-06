package com.conversor.coordenadas.model;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import static com.conversor.coordenadas.ApplicationUtil.objectMapperYAML;

public class Datum {

    private Double semiejeMayor;

    private Double semiejeMenor;


    public Double getSemiejeMayor() {
        return semiejeMayor;
    }

    public void setSemiejeMayor(Double semiejeMayor) {
        this.semiejeMayor = semiejeMayor;
    }

    public Double getSemiejeMenor() {
        return semiejeMenor;
    }

    public void setSemiejeMenor(Double semiejeMenor) {
        this.semiejeMenor = semiejeMenor;
    }

    public Double getPrimeraExcentricidad() {
        var semiejeMayorCuadrado =  Math.pow(semiejeMayor, 2);
        return (semiejeMayorCuadrado - Math.pow(semiejeMenor, 2)) / semiejeMayorCuadrado;
    }


    public Double getSegundaExcentricidad() {
        var semiejeMenorCuadrado =  Math.pow(semiejeMenor, 2);
        return (Math.pow(semiejeMayor, 2) - semiejeMenorCuadrado) / semiejeMenorCuadrado;
    }

    public enum Sistema {

        WSG84("WGS 84");

        private final String label;

        Sistema(String label){
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public static Sistema valorOf(String label){
            return Arrays.stream(values())
                    .filter(x -> x.label.equals(label))
                    .findFirst()
                    .orElse(null);
        }

        public Datum load(){

            try {

                Map<String, Map> config = objectMapperYAML.readValue(
                        new File("src/main/resources/application.yaml"),
                        Map.class
                );

                return objectMapperYAML.readValue(
                        objectMapperYAML.writeValueAsString(
                                config.get("datum").get(this.name())
                        ),
                        Datum.class
                );

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public String toString() {
        return "Datum{" +
                "semiejeMayor=" + semiejeMayor +
                ", semiejeMenor=" + semiejeMenor +
                ", primeraExcentricidad=" + getPrimeraExcentricidad() +
                ", segundaExcentricidad=" + getSegundaExcentricidad() +
                '}';
    }
}
