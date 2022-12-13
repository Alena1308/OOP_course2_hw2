package course2.transport;

import course2.people.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        Bus liaz = new Bus("ЛиАЗ", "4292", 5,
                65, 4, 115, Capacity.ESPECIALLY_SMALL);
        Bus mAZ = new Bus("МАЗ", "232", 5,
                65, 4, 115, Capacity.LARGE);
        Bus mAN = new Bus("МАН", "Lian City", 5,
                65, 4, 115, Capacity.ESPECIALLY_LARGE);
        Bus mAN2 = new Bus("МАН", "Lian", 4,
                65, 4, 115, Capacity.MEDIUM);
        System.out.println(liaz);
        liaz.printType();
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
                liaz, mAZ, mAN);
        Set<Transport> transports = new HashSet<>();
        transports.add(car1);
        transports.add(track1);
        transports.add(liaz);

        Sponsors sp1 = new Sponsors("Богач1", 200_000);
        Sponsors sp2 = new Sponsors("Богач2", 300_000);
        Sponsors sp3 = new Sponsors("Богач3", 400_000);


        Mechanics<PassengerCars> mch1 = new Mechanics<>("Механик1", "ABC",
                "легковые");
        Mechanics<Trucks> mch2 = new Mechanics<>("Механик2", "ABC",
                "грузовики");
        Mechanics<Bus> mch3 = new Mechanics<>("Механик3", "ABC",
                "автобусы");
        Mechanics<Bus> mch4 = new Mechanics<>("Механик3", "ABC",
                "автобусы");

        car1.addDriver(alex);
        car1.addDriver(alex);
        car1.addMechanic(mch1);
        car1.addMechanic(mch1);
        car1.addSponsor(sp1, sp2);
        car1.addSponsor(sp1, sp2);
        printInfo(car1);

        track1.addDriver(john);
        track1.addMechanic(mch2);
        track1.addMechanic(mch2);
        track1.addSponsor(sp1, sp2);
        printInfo(track1);

        liaz.addDriver(katya);
        liaz.addSponsor(sp2);
        liaz.addMechanic(mch3);
        liaz.addMechanic(mch4);
        printInfo(liaz);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addPassengerCar(car1);
        serviceStation.addTruck(track1);
        serviceStation.service();

        System.out.println("\n=======================================");
        System.out.println("ДЗ-3");
        System.out.println("Задание-2");
        int [][] tasks = new int[15][3];
        for (int i = 0; i < tasks.length; i++) {
            for (int j = 0; j < tasks[i].length; j++) {
                tasks[i][j] = (int)(Math.random() * 8) + 2;
                if(j==tasks[i].length-1){
                    tasks[i][j] = tasks[i][j-2] * tasks[i][j-1];
                    for (int k = 0; k < i; k++) {
                        if(tasks[i][j]==tasks[k][j]){
                            if(tasks[i][j-1]==tasks[k][j-1] || tasks[i][j-2]== tasks[k][j-2]) --i;
                        }

                    }
                }

            }

        }
        for (int i = 0; i < tasks.length; i++) {
            System.out.print("Задача №"+(i+1+" умножить "));
            for (int j = 0; j < tasks[i].length; j++) {
                if (j==0)
                    System.out.print(tasks[i][j] + " на ");
                if (j==1)
                    System.out.println(tasks[i][j]);
            }
        }
    }


    private static void printInfo(Transport t){
        System.out.println("Автомобиль: "+t.getBrand()+" "+ t.getModel()+" "+
                "Информация: ");
    getNames(t);
    }
    public static void getNames (Transport transport){
        for (Driver driver : transport.getDrivers()) {
            System.out.println(driver.getFullName());
        }
        for (Sponsors sponsors : transport.getSponsors()) {
            System.out.println(sponsors.getName()+" "+sponsors.getMoney());
        }
        for (Mechanics mechanics : transport.getMechanics()) {
            System.out.println(mechanics.getName()+" "+ mechanics.getCompanyName());
        }
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