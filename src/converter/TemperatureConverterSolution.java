package converter;

public class TemperatureConverterSolution {
    private static final double KELVIN_MAX_TEMPERATURE = 5500000000273.15;
    private static final double KELVIN_MIN_TEMPERATURE = 0;
    private static final double CELSIUS_MAX_TEMPERATURE = 5500000000000d;
    private static final double CELSIUS_MIN_TEMPERATURE = -273.15;
    private static final double FAHRENHEIT_MAX_TEMPERATURE = 9900000000032d;
    private static final double FAHRENHEIT_MIN_TEMPERATURE = -459.67;

    public double convertCelsiusToFahrenheit(double degreesCelsius) {
        return (degreesCelsius > CELSIUS_MAX_TEMPERATURE || degreesCelsius < CELSIUS_MIN_TEMPERATURE) ?
                throwIllegalArgumentException() :
                degreesCelsius * 1.8 + 32;
    }

    public double convertCelsiusToKelvin(double degreesCelsius) {
        return (degreesCelsius > CELSIUS_MAX_TEMPERATURE || degreesCelsius < CELSIUS_MIN_TEMPERATURE) ?
                throwIllegalArgumentException() :
                degreesCelsius + 273.15;
    }

    public double convertFahrenheitToKelvin(double degreesFahrenheit) {
        return (degreesFahrenheit > FAHRENHEIT_MAX_TEMPERATURE || degreesFahrenheit < FAHRENHEIT_MIN_TEMPERATURE) ?
                throwIllegalArgumentException() :
                (degreesFahrenheit + 459.67) * 5 / 9;
    }

    public double convertFahrenheitToCelsius(double degreesFahrenheit) {
        return (degreesFahrenheit > FAHRENHEIT_MAX_TEMPERATURE || degreesFahrenheit < FAHRENHEIT_MIN_TEMPERATURE) ?
                throwIllegalArgumentException() :
                (degreesFahrenheit - 32) / 1.8;
    }

    public double convertKelvinToCelsius(double kelvin) {
        return (kelvin > KELVIN_MAX_TEMPERATURE || kelvin < KELVIN_MIN_TEMPERATURE) ?
                throwIllegalArgumentException() :
                kelvin - 273.15;
    }

    public double convertKelvinToFahrenheit(double kelvin) {
        return (kelvin > KELVIN_MAX_TEMPERATURE || kelvin < KELVIN_MIN_TEMPERATURE) ?
                throwIllegalArgumentException() :
                (kelvin * 1.8 - 459.67);
    }

    private double throwIllegalArgumentException() {
        throw new IllegalArgumentException("Temperature out of bounds");
    }
}
