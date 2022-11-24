package course2.lesson3_task_3.animals;

import java.util.Objects;

public class Flying extends Birds{
    private String typeOfGoing;

    protected Flying(String name, int age, String environment, String typeOfGoing) {
        super(name, age, environment);
        this.typeOfGoing = validateStringValue(typeOfGoing);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfGoing, flying.typeOfGoing);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfGoing);
    }
    @Override
    public String toString() {
        return "Класс: " + getClass() + " Название - " + getName() + ". Возраст - " + getAge() +
                ". Место обитания - " + getEnvironment() + ". Тип передвижения - " + go() + ", "
                + getTypeOfGoing();
    }
    @Override
    public String go() {
        return "Летают по воздуху";
    }

    public final String getTypeOfGoing() {
        return typeOfGoing;
    }

    public void setTypeOfGoing(String typeOfGoing) {
        this.typeOfGoing = validateStringValue(typeOfGoing);
    }
}
