package course2.transport;

import course2.lesson4_task3.B_license_driver;
import course2.lesson4_task3.C_license_driver;
import course2.lesson4_task3.D_license_driver;

public class Transport_test {
    public static void main(String[] args) {
//        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015,
//                "Россия", "МКПП", null, null, 0,
//                true, new Car.Key(true, false),
//                new Car.Insurance(null, 20_000, null), 180, "бензин");
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
//                2020, "Германия", "АКПП", null,
//                null, 0, false, null, null,
//                230, "Бензин");
//        Car bmw = new Car("BMW", "Z8", 3.0, "", 2021,
//                "Германия", "АКПП", null, null, 0,
//                false, null, null, 0, "Дизель");
//        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
//                2018, "Южная Корея", null,
//                null, null, 2, true, null, null,
//                0, "электричество");
//        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
//                2016, "Южная Корея", null, null,
//                "a123bc456", 5, true, null, null,
//                180, "Бензин");
//        System.out.println(lada);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(hyundai);
//        lada.changeTire();
//        System.out.println(lada);
//        System.out.println(hyundai.isCorrectRegNumber());
//
//        Train lastochka = new Train("Ласточка","B-901", "", 2011, "Россия",
//                301, 3500, 0, "Белорусский вокзал",
//                "Минск-Пассажирский", 11);
//        Train leningrad = new Train("Ленинград"," D-125", "", 2019, "Россия",
//                270, 1700, 0, "Ленинградский вокзал",
//                "Ленинград-Пассажирский", 8);
//        System.out.println(lastochka);
//        System.out.println(leningrad);
//
//        Bus liAZ = new Bus("ЛиАЗ","4292", "синий", 2015, "Россия",
//                210, "Бензин");
//        Bus mAZ = new Bus("МАЗ","232", "желтый", 2011, "Россия",
//                210, "дизель");
//        Bus mAN = new Bus("МАН","Lian City", "серебрянный", 2017, "Германия",
//                210, "дизель");
//        System.out.println(liAZ);
//        System.out.println(mAZ);
//        System.out.println(mAN);
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

        B_license_driver alex = new B_license_driver("Ivanov Alex Ivanovich",
                true, 6);
        System.out.println(alex.goRace(car1));
        C_license_driver john = new C_license_driver("Ivanov John Ivanovich",
                true, 6);
        System.out.println(john.goRace(track1));
        D_license_driver katya = new D_license_driver("Ivanova Katya Ivanovna",
                true, 6);
        System.out.println(katya.goRace(mAZ));

    }
}