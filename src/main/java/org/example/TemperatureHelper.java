package org.example;

public class TemperatureHelper {
    private double temperature;

    public TemperatureHelper() {

        setTemperature(temperature);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {

    }

    public double FahrenheitToCelsius(double temperature) {
        if (temperature == 0 ) throw new IllegalArgumentException("El valor ingresado no debe ser 0");
        this.temperature = temperature;
        return (temperature - 32) * 5/9;
    }

}
