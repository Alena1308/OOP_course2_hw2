package course2.transport;

import course2.people.Driver;
import course2.people.Mechanics;
import course2.people.Sponsors;

import java.util.List;

public class PassengerCars extends Transport implements Competing{
    private BodyType bodyType;
    private double pitStopIndicator;
    private double BestLapTimeIndicator;
    private double maxSpeedIndicator;
    public PassengerCars(String brand, String model, double engineVolume, double pitStopIndicator,
                         double bestLapTimeIndicator, double maxSpeedIndicator, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.pitStopIndicator = validateDoubleValue(pitStopIndicator);
        BestLapTimeIndicator = validateDoubleValue(bestLapTimeIndicator);
        this.maxSpeedIndicator = validateDoubleValue(maxSpeedIndicator);
        this.bodyType = bodyType;
    }

    @Override
    public String startGoing() {
        return "Сесть в автобус";
    }
    @Override
    public String finishGoing() {
        return "Выйти из автобуса";
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.6;
    }

    @Override
    public void fixTheCar() {
        System.out.println("Машина "+getBrand()+" "+getModel()+" отремонтирована");
    }

    @Override
    public String getPitStop() {
        return " Время Пит стопа: " + getPitStopIndicator() + " секунд";
    }
    @Override
    public String getBestLapTime() {
        return " Лучшее время круга: " + getBestLapTimeIndicator()+ " минут";
    }
    @Override
    public String getMaxSpeed() {
        return " Максимальная скорость: " + getMaxSpeedIndicator() + " км/ч";
    }

    @Override
    public String toString() {
        return "Бренд " + getBrand() + ", модель " + getModel() +
                ", объем двигателя " + getEngineVolume() +
                ", начало движения: " + startGoing()  + ", конец движения: " + finishGoing() +
                getPitStop() + getBestLapTime() + getMaxSpeed();
    }

    public final double getPitStopIndicator() {
        return pitStopIndicator;
    }
    public void setPitStopIndicator(double pitStopIndicator) {
        this.pitStopIndicator = validateDoubleValue(pitStopIndicator);
    }
    public final double getBestLapTimeIndicator() {
        return BestLapTimeIndicator;
    }
    public void setBestLapTimeIndicator(double bestLapTimeIndicator) {
        BestLapTimeIndicator = validateDoubleValue(bestLapTimeIndicator);
    }
    public final double getMaxSpeedIndicator() {
        return maxSpeedIndicator;
    }
    public void setMaxSpeedIndicator(double maxSpeedIndicator) {
        this.maxSpeedIndicator = validateDoubleValue(maxSpeedIndicator);
    }
    public BodyType getBodyType() {
        return bodyType;
    }
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
