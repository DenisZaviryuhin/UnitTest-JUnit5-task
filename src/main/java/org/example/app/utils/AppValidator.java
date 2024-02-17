package org.example.app.utils;

import org.example.app.exceptions.TemperatureException;

public class AppValidator {


    public String validateTemperature(int temp)
            throws TemperatureException {
        if (temp >= Constants.TEMP_LOWER_LIMIT & temp <= Constants.TEMP_UPPER_LIMIT) {
            return "Temperature is fine. The device works normally.";
        } else {
            throw new TemperatureException("Invalid temperature.");
        }
    }
}

