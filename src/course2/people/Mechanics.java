package course2.people;

import course2.transport.Transport;

public class Mechanics <T extends Transport> {
    private String name;
    private String companyName;
    private String typeOfTransport;

    public Mechanics(String name, String companyName, String typeOfTransport) {
        this.name = validateStringValue(name);
        this.companyName = validateStringValue(companyName);
        this.typeOfTransport = validateStringValue(typeOfTransport);
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
