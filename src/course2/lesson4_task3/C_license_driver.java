package course2.lesson4_task3;

import course2.transport.Passenger_cars;
import course2.transport.Trucks;

public class C_license_driver <C extends Trucks> extends Driver{

    public C_license_driver(String fullName, boolean hasLicense, int experience) {
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
