package course2.transport;

public class Transport_test {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015,
                "Россия", "МКПП", null, null, 0,
                true, new Car.Key(true, false),
                new Car.Insurance(null, 20_000, null), 180, "бензин");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
                2020, "Германия", "АКПП", null,
                null, 0, false, null, null,
                230, "Бензин");
        Car bmw = new Car("BMW", "Z8", 3.0, "", 2021,
                "Германия", "АКПП", null, null, 0,
                false, null, null, 0, "Дизель");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                2018, "Южная Корея", null,
                null, null, 2, true, null, null,
                0, "электричество");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея", null, null,
                "a123bc456", 5, true, null, null,
                180, "Бензин");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        lada.changeTire();
        System.out.println(lada);
        System.out.println(hyundai.isCorrectRegNumber());

        Train lastochka = new Train("Ласточка","B-901", "", 2011, "Россия",
                301, 3500, 0, "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград"," D-125", "", 2019, "Россия",
                270, 1700, 0, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus liAZ = new Bus("ЛиАЗ","4292", "синий", 2015, "Россия",
                210, "Бензин");
        Bus mAZ = new Bus("МАЗ","232", "желтый", 2011, "Россия",
                210, "дизель");
        Bus mAN = new Bus("МАН","Lian City", "серебрянный", 2017, "Германия",
                210, "дизель");
        System.out.println(liAZ);
        System.out.println(mAZ);
        System.out.println(mAN);
    }
}