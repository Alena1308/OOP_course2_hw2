package course2.transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String color, int year, String country,
               double maxSpeed, String fuel) {
        super(brand, model, color, year, country, maxSpeed);
        this.setFuel(fuel);
    }

    @Override
    public String refill() {
        if ("бензин".equalsIgnoreCase(getFuel())) {
            return "можно заправлять бензином";
        }
        if ("дизель".equalsIgnoreCase(getFuel())) {
            return "можно заправлять дизелем";
        }
        return "Некорректная информация";
    }

    @Override
    public String toString() {
        return "Бренд автобуса - " + getBrand() + ", модель - " + getModel() + ", цвет - " +
                getColor() + ", год выпуска - " + getYear() +  ", страна производства - " + getCountry() +
                ", максимальная скорость - " + getMaxSpeed() + " " + refill();
    }
}
