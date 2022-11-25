package course2.transport;

import java.util.Objects;

public abstract class Transport {
//    private final int year;
//    private final String country;

    private String brand;
    private String model;
    private double engineVolume;

    protected Transport(String brand, String model, double engineVolume) {
        this.brand = validateStringValue(brand);
        this.model = validateStringValue(model);
        this.engineVolume = validateDoubleValue(engineVolume);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Бренд " + brand + ", модель " + model +
                ", объем двигателя " + engineVolume +
                ", начало движения " + startGoing()  + ", конец движения " + finishGoing();
    }

    public abstract String startGoing();
    public abstract String finishGoing();

    //    private String color;
//    private double maxSpeed;
//    private String fuel;

//    protected Transport (String brand, String model, String color, int year, String country,
//                         double maxSpeed) {
//        this.year = validateIntValue(year);
//        this.country = validateStringValue(country);
//        this.brand = validateStringValue(brand);
//        this.model = validateStringValue(model);
//        if (color == null || color.isEmpty() || color.isBlank()) {
//            this.color = "белый";
//        } else {
//            this.color = color;
//        }
//        this.maxSpeed = validateDoubleValue(maxSpeed);
//    }

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
//    public abstract String refill();
//    public int getYear() {
//        return year;
//    }
//    public String getCountry() {
//        return country;
//    }
    public final String getBrand() {
        return brand;
    }
    public final String getModel() {
        return model;
    }

    public final double getEngineVolume() {
        return engineVolume;
    }
    //    public String getColor() {
//        return color;
//    }
//    public double getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public String getFuel() {
//        return fuel;
//    }

    public void setBrand(String brand) {
        this.brand = validateStringValue(brand);
    }
    public void setModel(String model) {
        this.model = validateStringValue(model);
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateDoubleValue(engineVolume);
    }
    //    public void setColor(String color) {
//        if (color == null || color.isEmpty() || color.isBlank()) {
//            this.color = "белый";
//        } else {
//            this.color = color;
//        }
//    }
//    public void setMaxSpeed(double maxSpeed) {
//        this.maxSpeed = validateDoubleValue(maxSpeed);
//    }
//
//    public void setFuel(String fuel) {
//        this.fuel = validateStringValue(fuel);
//    }
}
