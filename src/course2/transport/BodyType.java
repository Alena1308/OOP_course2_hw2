package course2.transport;

public enum BodyType {
     SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");
     private final String namePCBodyType;

    BodyType(String namePCBodyType) {
        this.namePCBodyType = validateStringValue(namePCBodyType);
    }

    public String getNamePCBodyType() {
        return namePCBodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + namePCBodyType;
    }
    public String validateStringValue(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return "Данных по транспортному средству недостаточно";
        } else {
            return value;
        }
    }
}
