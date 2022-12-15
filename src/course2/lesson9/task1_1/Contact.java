package course2.lesson9.task1_1;

import java.util.Objects;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = validateStringValue(name);
        this.phoneNumber = validateStringValue(phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name) && phoneNumber.equals(contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public String toString() {
        return "\n" + name + " - " + phoneNumber;
    }

    public String validateStringValue(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new IllegalArgumentException("Неверно заполненно поле");
        } else {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateStringValue(name);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = validateStringValue(phoneNumber);
    }
}
