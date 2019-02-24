package com.moosilaukecycling.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private JsonUtil() { }

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static JsonNode toJson(Object object) {
        return MAPPER.valueToTree(object);
    }

    public static <T> T fromJson(JsonNode jsonNode, Class<T> clazz) throws IOException {
        return MAPPER.treeToValue(jsonNode, clazz);
    }

    public static String toJsonString(Object object) throws JsonProcessingException {
        if (object == null) {
            throw new NullPointerException();
        }
        return MAPPER.writeValueAsString(object);
    }

    public static <T> T fromJsonString(String jsonBody, Class<T> clazz) throws IOException {
        return MAPPER.readValue(jsonBody, clazz);
    }

}
