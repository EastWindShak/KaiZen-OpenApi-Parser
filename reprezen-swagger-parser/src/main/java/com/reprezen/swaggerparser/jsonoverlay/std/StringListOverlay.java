package com.reprezen.swaggerparser.jsonoverlay.std;

import java.util.Collection;

import com.fasterxml.jackson.databind.JsonNode;
import com.reprezen.swaggerparser.jsonoverlay.JsonOverlay;
import com.reprezen.swaggerparser.jsonoverlay.JsonOverlayFactory;
import com.reprezen.swaggerparser.jsonoverlay.coll.ValListOverlay;

public class StringListOverlay extends ValListOverlay<String, StringOverlay> {

    public StringListOverlay(String key, Collection<String> values, JsonOverlay<?> parent) {
        super(key, values, parent, StringOverlay.factory);
    }

    public StringListOverlay(String key, JsonNode json, JsonOverlay<?> parent) {
        super(key, json, parent, StringOverlay.factory);
    }

    public StringListOverlay(String key, JsonOverlay<?> parent) {
        super(key, parent, StringOverlay.factory);
    }

    public static JsonOverlayFactory<StringListOverlay> factory = new JsonOverlayFactory<StringListOverlay>() {
        @Override
        public StringListOverlay create(String key, JsonNode json, JsonOverlay<?> parent) {
            return new StringListOverlay(key, json, parent);
        }
    };
}