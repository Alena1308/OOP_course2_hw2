package course2.transport;

public class Bus extends Transport implements Competing{
    private double pitStopIndicator;
    private double BestLapTimeIndicator;
    private double maxSpeedIndicator;
    public Bus(String brand, String model, double engineVolume,
               double pitStopIndicator, double bestLapTimeIndicator, double maxSpeedIndicator) {
        super(brand, model, engineVolume);
        this.pitStopIndicator = validateDoubleValue(pitStopIndicator);
        BestLapTimeIndicator = validateDoubleValue(bestLapTimeIndicator);
        this.maxSpeedIndicator = validateDoubleValue(maxSpeedIndicator);
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




    //    public Bus(String brand, String model, String color, int year, String country,
//               double maxSpeed, String fuel) {
//        super(brand, model, color, year, country, maxSpeed);
//        this.setFuel(fuel);
//    }
//
//    @Override
//    public String refill() {
//        if ("бензин".equalsIgnoreCase(getFuel())) {
//            return "можно заправлять бензином";
//        }
//        if ("дизель".equalsIgnoreCase(getFuel())) {
//            return "можно заправлять дизелем";
//        }
//        return "Некорректная информация";
//    }
//
//    @Override
//    public String toString() {
//        return "Бренд автобуса - " + getBrand() + ", модель - " + getModel() + ", цвет - " +
//                getColor() + ", год выпуска - " + getYear() +  ", страна производства - " + getCountry() +
//                ", максимальная скорость - " + getMaxSpeed() + " " + refill();
//    }
}