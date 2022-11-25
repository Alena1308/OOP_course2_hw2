package course2.lesson4_task3;

import course2.transport.Bus;
import course2.transport.Passenger_cars;

public class B_license_driver <B extends Passenger_cars> extends Driver {

    public B_license_driver(String fullName, boolean hasLicense, int experience) {
        super(fullName, hasLicense, experience);
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
    public String goRace(Passenger_cars car){
        return "Водитель " + getFullName() + " управляет автомобилем " + car.getBrand() + " " +
                car.getModel() + " и будет участвовать в заезде.";
    }
}