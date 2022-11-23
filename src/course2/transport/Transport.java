package course2.transport;

import java.util.Objects;

public abstract class Transport {
    private final int year;
    private final String country;

    private String brand;
    private String model;
    private String color;
    private double maxSpeed;
    private String fuel;

    protected Transport (String brand, String model, String color, int year, String country,
                         double maxSpeed) {
        this.year = validateIntValue(year);
        this.country = validateStringValue(country);
        this.brand = validateStringValue(brand);
        this.model = validateStringValue(model);
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        this.maxSpeed = validateDoubleValue(maxSpeed);
    }

    public String validateStringValue(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return "default";
        } else {
            return value;
        }
    }
    public int validateIntValue (int value) {
        if (value <= 0) {
            return 0;
        } else  {
            return value;
        }
    }
    public double validateDoubleValue (double value) {
        if (value <= 0) {
            return 0;
        } else  {
            return value;
        }
    }
    public abstract String refill();
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setBrand(String brand) {
        this.brand = validateStringValue(brand);
    }
    public void setModel(String model) {
        this.model = validateStringValue(model);
    }
    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = validateDoubleValue(maxSpeed);
    }

    public void setFuel(String fuel) {
        this.fuel = validateStringValue(fuel);
    }
}
