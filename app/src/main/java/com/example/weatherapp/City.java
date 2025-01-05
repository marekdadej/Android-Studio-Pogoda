package com.example.weatherapp;

public class City {
    private String name;
    private String province;
    private int rainChance;
    private double temperature;
    private int weatherIcon; // Resource ID for icon

    public City(String name, String province, int rainChance, double temperature, int weatherIcon) {
        this.name = name;
        this.province = province;
        this.rainChance = rainChance;
        this.temperature = temperature;
        this.weatherIcon = weatherIcon;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    public int getRainChance() {
        return rainChance;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getWeatherIcon() {
        return weatherIcon;
    }
}
