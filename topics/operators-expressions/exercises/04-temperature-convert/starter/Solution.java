public class Solution {

    public static double fahrenheitToCelsius(double fahrenheit) {
        // TODO: Convert Fahrenheit to Celsius
        // Formula: (F - 32) * 5.0 / 9.0
        return 0.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        // TODO: Convert Celsius to Fahrenheit
        // Formula: C * 9.0 / 5.0 + 32
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("32 F = " + fahrenheitToCelsius(32.0) + " C");
        System.out.println("212 F = " + fahrenheitToCelsius(212.0) + " C");
        System.out.println("0 C = " + celsiusToFahrenheit(0.0) + " F");
        System.out.println("100 C = " + celsiusToFahrenheit(100.0) + " F");
    }
}
