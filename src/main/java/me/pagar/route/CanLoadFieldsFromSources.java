package me.pagar.route;

import java.util.Map;

public interface CanLoadFieldsFromSources {

    void loadParametersFrom(Map<String, Object> parameters);
    void loadParametersFrom(String jsonString);
}
