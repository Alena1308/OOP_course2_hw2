package course2.transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key () {
            this(false, false);
        }
        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean getKeylessAccess() {
            return keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null){
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null){
                this.number = "111111111";
            } else {
                this.number = number;
            }
        }
        public Insurance(){
            this(null, 10_000, null);
        }
        public LocalDate getExpireDate() {
            return expireDate;
        }
        public double getCost() {
            return cost;
        }
        public String getNumber() {
            return number;
        }
        public void checkExpireDate (){
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }
        public void checkNumber() {
            if(number.length() != 9){
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;
    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, boolean summerTires, Key key, Insurance insurance,
               double maxSpeed, String fuel) {
        super(brand, model, color, year, country, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.transmission = validateStringValue(transmission);
        this.bodyType = validateStringValue(bodyType);
        this.registrationNumber = Objects.requireNonNullElse(registrationNumber, "х000хх000");
        this.numberOfSeats = validateIntValue(numberOfSeats);
        this.summerTires = summerTires;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.setFuel(fuel);
    }
    @Override
    public String refill() {
        if ("бензин".equalsIgnoreCase(getFuel())) {
            return "можно заправлять бензином";
        }
        if ("дизель".equalsIgnoreCase(getFuel())) {
            return "можно заправлять дизелем";
        }
        if ("электричество".equalsIgnoreCase(getFuel())) {
            return "можно заряжать на специальных электропарковках";
        }
        return "Некорректная информация";
    }
    @Override
    public String toString(){
        return "Бренд - " + getBrand() + ". Модель - " + getModel() + ". Объем двигателя - " + engineVolume +
                ". Цвет - " + getColor() + ". Год выпуска - " + getYear() + ". Сборка - " + getCountry() +
                ". Коробка передач " + "- " + transmission + ". Тип кузова - " + bodyType +
                ". Регистрационный номер - " + registrationNumber + ". Количество мест - " +
                numberOfSeats + ". Резина - " + (summerTires ? "Летняя" : "Зимняя") + "." + " Доступ - " +
                (getKey().getKeylessAccess() ? "безключевой доступ" : "ключевой доступ" + ". Запуск: " +
                        (getKey().getRemoteEngineStart() ? "удаленный запуск" : "обычный запуск") +
                        ". Номер страховки - " + getInsurance().getNumber() + ". Стоимость страховки - " +
                        getInsurance().getCost() + ". Срок действия страховки - " +
                        getInsurance().getExpireDate()) + " " + refill();
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "Не указано";
        } else {
            this.transmission = transmission;
        }
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public boolean getSummerTires() {
        return summerTires;
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public Insurance getInsurance() {
        return insurance;
    }
    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTire() {
        summerTires =!summerTires;
    }
    public boolean isCorrectRegNumber () {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) ||
                !Character.isAlphabetic(chars[5])){
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) ||
                !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

}
