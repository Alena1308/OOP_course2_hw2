package course2.lesson3_task_3.animals;

import java.util.Objects;

public class Mammals extends Animals{
    private String environment;
    private int speed;

    public Mammals(String name, int age, String environment, int speed) {
        super(name, age);
        this.environment = validateStringValue(environment);
        this.speed = validateIntValue(speed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && environment.equals(mammals.environment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment, speed);
    }

    @Override
    public String eat() {
        return "Могут быть травоядные и хищные";
    }
    @Override
    public String go() {
        return "Передвигаются по суше или в воде";
    }


    public final String getEnvironment() {
        return environment;
    }
    public final int getSpeed() {
        return speed;
    }

    public void setEnvironment(String environment) {
        this.environment = validateStringValue(environment);
    }
    public void setSpeed(int speed) {
        this.speed = validateIntValue(speed);
    }
}
