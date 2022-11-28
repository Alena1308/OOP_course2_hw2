package course2.transport;

import course2.lesson4_task3.BLicenseDriver;
import course2.lesson4_task3.CLicenseDriver;
import course2.lesson4_task3.DLicenseDriver;

public class TransportTest {
    public static void main(String[] args) {

        Passenger_cars car1 = new Passenger_cars("Kia", "Picanta", 2.5,
                30, 1.5, 254);
        Passenger_cars car2 = new Passenger_cars("Kia", "Soul", 1.5,
                30, 1.5, 254);
        Passenger_cars car3 = new Passenger_cars("Audi", "R8", 4,
                30, 1.5, 254);
        Passenger_cars car4 = new Passenger_cars("BMW", "X5", 6,
                30, 1.5, 254);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        Trucks track1 = new Trucks("Ford", "Transit", 4,
                84, 3, 115);
        Trucks track2 = new Trucks("KAMAZ", "54901", 6,
                84, 3, 115);
        Trucks track3 = new Trucks("Ford", "Aerostar", 3,
                84, 3, 115);
        Trucks track4 = new Trucks("Kia", "Pregio", 4,
                84, 3, 115);
        System.out.println(track1);
        System.out.println(track2);
        System.out.println(track3);
        System.out.println(track4);

        Bus liAZ = new Bus("ЛиАЗ","4292", 5,
                65, 4, 115);
        Bus mAZ = new Bus("МАЗ","232", 5,
                65, 4, 115);
        Bus mAN = new Bus("МАН","Lian City", 5,
                65, 4, 115);
        Bus mAN2 = new Bus("МАН","Lian", 4,
                65, 4, 115);
        System.out.println(liAZ);
        System.out.println(mAZ);
        System.out.println(mAN);
        System.out.println(mAN2);

        BLicenseDriver alex = new BLicenseDriver("Ivanov Alex Ivanovich",
                true, 6);
        System.out.println(alex.goRace(car1));
        CLicenseDriver john = new CLicenseDriver("Ivanov John Ivanovich",
                true, 6);
        System.out.println(john.goRace(track1));
        DLicenseDriver katya = new DLicenseDriver("Ivanova Katya Ivanovna",
                true, 6);
        System.out.println(katya.goRace(mAZ));

    }
}