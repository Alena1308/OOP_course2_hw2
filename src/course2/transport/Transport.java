package course2.transport;

import course2.people.Driver;
import course2.people.Mechanics;
import course2.people.Sponsors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Sponsors> sponsors = new ArrayList<>();
    private List<Mechanics<?>> mechanics = new ArrayList<>();

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
    public abstract void printType();
    public abstract boolean passDiagnostics();
    public abstract void fixTheCar();

    public void addDriver(Driver driver){
        drivers.add(driver);
    }
    public void addSponsor(Sponsors... sponsor){
        sponsors.addAll(Arrays.asList(sponsor));
    }
    public void addMechanic(Mechanics<?> mechanic){
        mechanics.add(mechanic);
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
    public final String getBrand() {
        return brand;
    }
    public final String getModel() {
        return model;
    }

    public final double getEngineVolume() {
        return engineVolume;
    }

    public void setBrand(String brand) {
        this.brand = validateStringValue(brand);
    }
    public void setModel(String model) {
        this.model = validateStringValue(model);
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateDoubleValue(engineVolume);
    }

    public List<Driver> getDrivers() {
        return drivers;
    }
    public List<Sponsors> getSponsors() {
        return sponsors;
    }
    public List<Mechanics<?>> getMechanics() {
        return mechanics;
    }


}
