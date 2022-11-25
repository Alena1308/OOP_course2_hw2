package course2.lesson4_task3;

import course2.transport.Bus;
import course2.transport.Passenger_cars;

public class D_license_driver <D extends Bus> extends Driver{

    public D_license_driver(String fullName, boolean hasLicense, int experience) {
        super(fullName, hasLicense, experience);
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
