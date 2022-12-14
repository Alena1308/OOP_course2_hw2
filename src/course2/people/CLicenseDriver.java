package course2.people;

import course2.transport.Trucks;

public class CLicenseDriver<C extends Trucks> extends Driver{

    public CLicenseDriver(String fullName, boolean hasLicense, int experience, String typeLicense) {
        super(fullName, hasLicense, experience, typeLicense);
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
