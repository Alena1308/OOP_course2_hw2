package course2.people;

import course2.transport.Transport;

import java.util.Objects;

public class Mechanics <T extends Transport> {
    private String name;
    private String companyName;
    private String typeOfTransport;

    public Mechanics(String name, String companyName, String typeOfTransport) {
        this.name = validateStringValue(name);
        this.companyName = validateStringValue(companyName);
        this.typeOfTransport = validateStringValue(typeOfTransport);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics<?> mechanics = (Mechanics<?>) o;
        return name.equals(mechanics.name) && companyName.equals(mechanics.companyName) && typeOfTransport.equals(mechanics.typeOfTransport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, companyName, typeOfTransport);
    }

    public  boolean performMaintenance (T t) {
        return t.passDiagnostics();
    }
    public void fixTheCar (T t) {
       t.fixTheCar();
    }
    public String validateStringValue(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return "default";
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = validateStringValue(companyName);
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = validateStringValue(typeOfTransport);
    }
}
