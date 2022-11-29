package course2.lesson5_task1;

public abstract class Driver {
    private String fullName;
    private boolean hasLicense;
    private int experience;

    protected Driver(String fullName, boolean hasLicense, int experience) {
        this.fullName = validateStringValue(fullName);
        this.hasLicense = hasLicense;
        this.experience = validateIntValue(experience);
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
}
