package com.azizerel.javablog.converter;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * created by Abdulaziz Erel on 20:24 17.02.2020
 **/
public class BaseCommonConverter {

    private static final ObjectMapper MAPPER;

    static {
        MAPPER = new ObjectMapper();
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MAPPER.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    public static <MODEL> MODEL convert(Object from, Class<MODEL> clazz) {
        return MAPPER.convertValue(from, clazz);
    }

    public static <MODEL> MODEL convert(Object from, TypeReference<MODEL> typeReference) {
        return MAPPER.convertValue(from, typeReference);
    }
}
