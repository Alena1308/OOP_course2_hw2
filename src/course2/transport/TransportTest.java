package course2.transport;

import course2.lesson5_task1.BLicenseDriver;
import course2.lesson5_task1.CLicenseDriver;
import course2.lesson5_task1.DLicenseDriver;

public class TransportTest {
    public static void main(String[] args) {

        PassengerCars car1 = new PassengerCars("Kia", "Picanta", 2.5,
                30, 1.5, 254, BodyType.SEDAN);
        PassengerCars car2 = new PassengerCars("Kia", "Soul", 1.5,
                30, 1.5, 254, BodyType.HATCHBACK);
        PassengerCars car3 = new PassengerCars("Audi", "R8", 4,
                30, 1.5, 254, BodyType.SEDAN);
        PassengerCars car4 = new PassengerCars("BMW", "X5", 6,
                30, 1.5, 254, BodyType.HATCHBACK);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        car4.printType();

        Trucks track1 = new Trucks("Ford", "Transit", 4,
                84, 3, 115, null);
        Trucks track2 = new Trucks("KAMAZ", "54901", 6,
                84, 3, 115, LoadCapacity.N2);
        Trucks track3 = new Trucks("Ford", "Aerostar", 3,
                84, 3, 115, LoadCapacity.N1);
        Trucks track4 = new Trucks("Kia", "Pregio", 4,
                84, 3, 115, LoadCapacity.N3);
        System.out.println(track1);
        System.out.println(track2);
        System.out.println(track3);
        System.out.println(track4);
        track3.printType();
        track1.printType();

        Bus liAZ = new Bus("ЛиАЗ","4292", 5,
                65, 4, 115, Capacity.ESPECIALLY_SMALL);
        Bus mAZ = new Bus("МАЗ","232", 5,
                65, 4, 115, Capacity.LARGE);
        Bus mAN = new Bus("МАН","Lian City", 5,
                65, 4, 115, Capacity.ESPECIALLY_LARGE);
        Bus mAN2 = new Bus("МАН","Lian", 4,
                65, 4, 115, Capacity.MEDIUM);
        System.out.println(liAZ);
        liAZ.printType();
        System.out.println(mAZ);
        System.out.println(mAN);
        mAN.printType();
        System.out.println(mAN2);

        BLicenseDriver alex = new BLicenseDriver("Ivanov Alex Ivanovich",
                true, 6, "B");
        System.out.println(alex.goRace(car1));
        CLicenseDriver john = new CLicenseDriver("Ivanov John Ivanovich",
                true, 6, "C");
        System.out.println(john.goRace(track1));
        DLicenseDriver katya = new DLicenseDriver("Ivanova Katya Ivanovna",
                true, 6, "D");
        System.out.println(katya.goRace(mAZ));

        passDiagnostics(car1, car2, car3,
                        track1, track2, track3,
                        liAZ, mAZ, mAN);

    }
    private static void passDiagnostics(Transport...transports){
        for (Transport transport : transports) {
            service(transport);
        }
    }
    private static void service (Transport transport){
        try {
            if (!transport.passDiagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " "
                        + transport.getModel() + " диагностику не прошел");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}