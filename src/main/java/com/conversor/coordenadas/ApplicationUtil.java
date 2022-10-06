package com.conversor.coordenadas;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class ApplicationUtil {

    public static final ObjectMapper objectMapper = new ObjectMapper();

    public static final ObjectMapper objectMapperYAML = new ObjectMapper(new YAMLFactory());
}
