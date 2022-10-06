package com.conversor.coordenadas.model;

import java.util.Arrays;

public class Coordenada {

    private Datum datum;

    public Datum getDatum() {
        return datum;
    }

    public void setDatum(Datum datum) {
        this.datum = datum;
    }

    public enum Tipo {
        GEODESICA("Geodésica"),
        GEOCENTRICA("Geocentrica");

        private final String label;

        Tipo(String label){
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public static Tipo valorOf(String label){
            return Arrays.stream(values())
                    .filter(x -> x.label.equals(label))
                    .findFirst()
                    .orElse(null);
        }
    }

    public enum Conversion {
        GEODESICA_TO_GEOCENTRICA("Geodésica -> Geocentrica"),
        GEOCENTRICA_TO_GEODESICA("Geocentrica -> Geodésica");

        private final String label;

        Conversion(String label){
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public static Conversion valorOf(String label){
            return Arrays.stream(values())
                    .filter(x -> x.label.equals(label))
                    .findFirst()
                    .orElse(null);
        }
    }

}
