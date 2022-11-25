package course2.transport;

public class Trucks extends Transport implements Competing{
    private double pitStopIndicator;
    private double BestLapTimeIndicator;
    private double maxSpeedIndicator;
    public Trucks(String brand, String model, double engineVolume,
                  double pitStopIndicator, double bestLapTimeIndicator, double maxSpeedIndicator) {
        super(brand, model, engineVolume);
        this.pitStopIndicator = validateDoubleValue(pitStopIndicator);
        BestLapTimeIndicator = validateDoubleValue(bestLapTimeIndicator);
        this.maxSpeedIndicator = validateDoubleValue(maxSpeedIndicator);
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


}
