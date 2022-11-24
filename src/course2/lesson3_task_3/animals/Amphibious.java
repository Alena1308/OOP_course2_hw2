package course2.lesson3_task_3.animals;

import java.util.Objects;

public class Amphibious extends Animals{
    private String environment;

    protected Amphibious(String name, int age, String environment) {
        super(name, age);
        this.environment = validateStringValue(environment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibious that = (Amphibious) o;
        return Objects.equals(environment, that.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }

    @Override
    public String toString() {
        return "Название - " + getName() + ". Возраст - " + getAge() + ". Место обитания - " + getEnvironment()
                + ", " + eat() + ", " + go();
    }

    @Override
    public String eat() {
        return " охотятся";
    }

    @Override
    public String go() {
        return " Перемещаются по суше и воде";
    }

    public final String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = validateStringValue(environment);
    }
}
