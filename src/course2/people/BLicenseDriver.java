package course2.people;

import course2.transport.PassengerCars;

public class BLicenseDriver<B extends PassengerCars> extends Driver {

    public BLicenseDriver(String fullName, boolean hasLicense, int experience, String typeLicense) {
        super(fullName, hasLicense, experience, typeLicense);
    }

    @Override
    public String startGoing() {
        return " Завожу легковой автомобиль";
    }
    @Override
    public String stop() {
        return " Останавливаю легковой автомобиль";
    }
    @Override
    public String refuelTheCar() {
        return " Заправляю легковой автомобиль";
    }
    public String goRace(PassengerCars car){
        return "Водитель " + getFullName() + " управляет автомобилем " + car.getBrand() + " " +
                car.getModel() + " и будет участвовать в заезде.";
    }
}
