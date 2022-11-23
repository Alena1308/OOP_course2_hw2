package course2.lesson3_task_3.animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    protected Animals(String name, int age) {
        this.name = validateStringValue(name);
        this.age = validateIntValue(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public abstract String eat();
    public abstract String go();
    public String sleep() {
        return "Может спать немного днем и ночью";
    }
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

    public final String getName() {
        return name;
    }
    public final int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = validateStringValue(name);
    }
    public void setAge(int age) {
        this.age = validateIntValue(age);
    }
}
