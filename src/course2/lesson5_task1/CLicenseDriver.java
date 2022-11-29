package course2.lesson5_task1;

import course2.transport.Trucks;

public class CLicenseDriver<C extends Trucks> extends Driver{

    public CLicenseDriver(String fullName, boolean hasLicense, int experience) {
        super(fullName, hasLicense, experience);
    }

    @Override
    public String startGoing() {
        return " Завожу грузовой автомобиль";
    }
    @Override
    public String stop() {
        return " Останавливаю грузовой автомобиль";
    }
    @Override
    public String refuelTheCar() {
        return " Заправляю грузовой автомобиль";
    }

    public String goRace(Trucks car){
        return "Водитель " + getFullName() + " управляет автомобилем " + car.getBrand() + " " +
                car.getModel() + " и будет участвовать в заезде.";
    }
}
