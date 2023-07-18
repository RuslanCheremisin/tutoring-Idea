package org.example.util;

import java.util.Optional;

public class Util {
    public static Object checkIfNull(Object o, String parameterName) {
        Optional<Object> objectOptional = Optional.ofNullable(o);
        if (objectOptional.isPresent()) {
            return o;
        } else {
            throw new IllegalArgumentException(parameterName + " parameter value is null");
        }
    }
}
