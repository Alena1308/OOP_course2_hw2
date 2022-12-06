package course2.transport;

public class Trucks extends Transport implements Competing{
    private LoadCapacity loadCapacity;
    private double pitStopIndicator;
    private double BestLapTimeIndicator;
    private double maxSpeedIndicator;
    public Trucks(String brand, String model, double engineVolume,
                  double pitStopIndicator, double bestLapTimeIndicator, double maxSpeedIndicator,
                  LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.pitStopIndicator = validateDoubleValue(pitStopIndicator);
        BestLapTimeIndicator = validateDoubleValue(bestLapTimeIndicator);
        this.maxSpeedIndicator = validateDoubleValue(maxSpeedIndicator);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String startGoing() {
        return "Сесть в грузовик";
    }
    @Override
    public String finishGoing() {
        return "Выйти из грузовика";
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(loadCapacity);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.8;
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
    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
