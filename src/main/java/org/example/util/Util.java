package org.example.util;

public class Util {
    public static Object checkIfNull(Object o, String parameterName) {
        if (o == null) {
            throw new IllegalArgumentException(parameterName + " parameter value is null!");
        }
        return o;
    }
}
