package converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void convertFromCelsiusToFahrenheitTest() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        assertEquals(32.0, temperatureConverter.convertFromCelsiusToFahrenheit(0.0), 0.01);
    }
}