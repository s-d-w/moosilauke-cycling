package com.moosilaukecycling.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static JsonNode toJson(Object object) {
        return MAPPER.valueToTree(object);
    }

    public static <T> T fromJson(JsonNode jsonNode, Class<T> clazz) {
        try {
            return MAPPER.treeToValue(jsonNode, clazz);
        } catch (IOException e) {
            throw new RuntimeException("Failed to deserialize to class: " + clazz.getSimpleName() + " from " + jsonNode.toString() + " error: " + e);
        }
    }

}
