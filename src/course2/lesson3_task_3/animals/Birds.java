package course2.lesson3_task_3.animals;

import java.util.Objects;

public class Birds extends Animals{
    private String environment;

    protected Birds(String name, int age, String environment) {
        super(name, age);
        this.environment = validateStringValue(environment);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds that = (Birds) o;
        return Objects.equals(environment, that.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }

    @Override
    public String eat() {
        return "охотятся";
    }

    @Override
    public String go() {
        return "летают по воздуху и ходят по земле, могут плавать по воде";
    }

    public final String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = validateStringValue(environment);
    }
}
