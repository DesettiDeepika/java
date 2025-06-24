class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    double convertFtoC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Kelvin to Celsius
    double convertKtoC(int kelvin) {
        return kelvin - 273.15;
    }
}

public class Temperature {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();

        double f = tc.convert(25.0);
