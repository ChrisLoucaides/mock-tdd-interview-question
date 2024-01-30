package converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterSolutionTest {
    private final TemperatureConverterSolution temperatureConverter = new TemperatureConverterSolution();
    private final String OVER_MAXIMUM_TEMPERATURE_CELSIUS = "5500000000000.01";
    private final String UNDER_MINIMUM_TEMPERATURE_CELSIUS = "-273.16";
    private final String OVER_MAXIMUM_TEMPERATURE_FAHRENHEIT = "9900000000032.01";
    private final String UNDER_MINIMUM_TEMPERATURE_FAHRENHEIT = "-459.67";
    private final String OVER_MAXIMUM_TEMPERATURE_KELVIN = "9900000000032.01";
    private final String UNDER_MINIMUM_TEMPERATURE_KELVIN = "-459.67";
    private final double TWENTY_DEGREES_CELSIUS = 20.0;
    private final double SIXTY_EIGHT_DEGREES_FAHRENHEIT = 68.0;
    private final double _293_POINT_FIFTEEN_DEGREES_KELVIN = 293.15;
    private final double TO_ONE_DECIMAL_PLACE = 0.01;

    @Nested
    class ConvertCelsiusToFahrenheit {
        @Test
        void convertCelsiusToFahrenheitTest() {
            assertEquals(SIXTY_EIGHT_DEGREES_FAHRENHEIT, temperatureConverter.convertCelsiusToFahrenheit(TWENTY_DEGREES_CELSIUS), TO_ONE_DECIMAL_PLACE);
        }
    }

    @Nested
    class ConvertCelsiusToKelvin {
        @Test
        void convertCelsiusToKelvinTest() {
            assertEquals(_293_POINT_FIFTEEN_DEGREES_KELVIN, temperatureConverter.convertCelsiusToKelvin(TWENTY_DEGREES_CELSIUS), TO_ONE_DECIMAL_PLACE);
        }
    }

    @Nested
    class ConvertFahrenheitToFahrenheit {
        @Test
        void convertFahrenheitToKelvinTest() {
            assertEquals(_293_POINT_FIFTEEN_DEGREES_KELVIN, temperatureConverter.convertFahrenheitToKelvin(SIXTY_EIGHT_DEGREES_FAHRENHEIT), TO_ONE_DECIMAL_PLACE);
        }
    }

    @Nested
    class ConvertFahrenheitToCelsius {
        @Test
        void convertFahrenheitToCelsiusTest() {
            assertEquals(TWENTY_DEGREES_CELSIUS, temperatureConverter.convertFahrenheitToCelsius(SIXTY_EIGHT_DEGREES_FAHRENHEIT), TO_ONE_DECIMAL_PLACE);
        }
    }

    @Nested
    class ConvertKelvinToCelsius {
        @Test
        void convertKelvinToCelsiusTest() {
            assertEquals(TWENTY_DEGREES_CELSIUS, temperatureConverter.convertKelvinToCelsius(_293_POINT_FIFTEEN_DEGREES_KELVIN), TO_ONE_DECIMAL_PLACE);
        }
    }

    @Nested
    class ConvertKelvinToFahrenheit {
        @Test
        void convertKelvinToFahrenheitTest() {
            assertEquals(SIXTY_EIGHT_DEGREES_FAHRENHEIT, temperatureConverter.convertKelvinToFahrenheit(_293_POINT_FIFTEEN_DEGREES_KELVIN), TO_ONE_DECIMAL_PLACE);
        }
    }

    @Nested
    class ConversionThrowsIllegalArgumentException {
        @ParameterizedTest(name = "Maximum and Minimum boundaries")
        @CsvSource(value = {
                OVER_MAXIMUM_TEMPERATURE_CELSIUS,
                UNDER_MINIMUM_TEMPERATURE_CELSIUS,
                OVER_MAXIMUM_TEMPERATURE_FAHRENHEIT,
                UNDER_MINIMUM_TEMPERATURE_FAHRENHEIT,
                OVER_MAXIMUM_TEMPERATURE_KELVIN,
                UNDER_MINIMUM_TEMPERATURE_KELVIN
        })
        @DisplayName("throwsIllegalArgumentExceptionWhenTemperatureIsOutsideRange")
        void throwsIllegalArgumentExceptionWhenTemperatureIsOutsideRange(double temperature) {
            Assertions.assertThrows(IllegalArgumentException.class, () -> temperatureConverter.convertCelsiusToKelvin(temperature));
        }
    }
}