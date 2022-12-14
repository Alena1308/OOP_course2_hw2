package course2.people;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean hasLicense;
    private int experience;
    private final String VALID_CHARACTERS = "bcdBCD";
    private String typeLicense;

    protected Driver(String fullName, boolean hasLicense, int experience, String typeLicense) {
        this.fullName = validateStringValue(fullName);
        this.hasLicense = hasLicense;
        this.experience = validateIntValue(experience);
        setTypeLicense(typeLicense);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && fullName.equals(driver.fullName) && typeLicense.equals(driver.typeLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, experience, typeLicense);
    }

    public abstract String startGoing();
    public abstract String stop();
    public abstract String refuelTheCar();

    public String validateStringValue(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return "default";
        } else {
            return value;
        }
    }
    public int validateIntValue (int value) {
        if (value <= 0) {
            return 0;
        } else  {
            return value;
        }
    }

    public final String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = validateStringValue(fullName);
    }
    public final boolean isHasLicense() {
        return hasLicense;
    }
    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }
    public final int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = validateIntValue(experience);
    }

    public String getTypeLicense() {
        return typeLicense;
    }
    public void setTypeLicense(String typeLicense) {
        if (typeLicense == null || typeLicense.isEmpty() || typeLicense.isBlank()
                || typeLicense.length() > 1) {
            throw new IllegalArgumentException("???? ?????????? ?????????????? ?????????????????? ????????");
        }
        for (int i = 0; i < typeLicense.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(typeLicense.charAt(i)))) {
                throw new IllegalArgumentException("???? ?????????? ?????????????? ?????????????????? ????????");
            }
            this.typeLicense = typeLicense;
        }
    }
}
