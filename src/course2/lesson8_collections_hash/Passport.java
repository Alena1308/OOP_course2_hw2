package course2.lesson8_collections_hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private String passportNumber;
    private String surname;
    private String name;
    private String patronymic;
    private String birthDate;

    public Passport(String passportNumber, String surname, String name, String patronymic, String birthDate) {
        this.passportNumber = validateStringValue(passportNumber);
        this.surname = validateStringValue(surname);
        this.name = validateStringValue(name);
        this.patronymic = patronymic;
        this.birthDate = validateStringValue(birthDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber.equals(passport.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }

    @Override
    public String toString() {
        return  "Номер пспорта: " + passportNumber +
                ", ФИО: " + surname + ", " + name + ", " + patronymic +
                ", дата рождения: " + birthDate + "\n";
    }

    public String validateStringValue(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new IllegalArgumentException("Заполните поле");
        } else {
            return value;
        }
    }

    public final String getPassportNumber() {
        return passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
