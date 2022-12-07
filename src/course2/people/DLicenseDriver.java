package course2.people;

import course2.transport.Bus;

public class DLicenseDriver<D extends Bus> extends Driver{

    public DLicenseDriver(String fullName, boolean hasLicense, int experience, String typeLicense) {
        super(fullName, hasLicense, experience, typeLicense);
    }
    @Override
    public String startGoing() {
        return " Завожу автобус";
    }
    @Override
    public String stop() {
        return " Останавливаю автобус";
    }
    @Override
    public String refuelTheCar() {
        return " Заправляю автобус";
    }
    public String goRace(Bus car){
        return "Водитель " + getFullName() + " управляет автомобилем " + car.getBrand() + " " +
                car.getModel() + " и будет участвовать в заезде.";
    }
}
