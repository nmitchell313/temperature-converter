package edu.cnm.deepdive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void convertC2F() {
        double celsius = -40;
        double expectedFahrenheit = -40;
        double actualFahrenheit = TemperatureConverter.convertC2F(celsius);
        if (expectedFahrenheit != actualFahrenheit) {
            fail();
        }
    }

}