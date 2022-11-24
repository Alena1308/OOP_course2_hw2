package course2.lesson3_task_3.animals;

import java.util.Objects;

public class Herbivorous extends Mammals{
    private String typeOfFood;

    protected Herbivorous(String name, int age, String environment, int speed, String typeOfFood) {
        super(name, age, environment, speed);
        this.typeOfFood = validateStringValue(typeOfFood);
    }
    @Override
    public String eat() {
        return "Пасутся";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivorous that = (Herbivorous) o;
        return typeOfFood.equals(that.typeOfFood);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() + " Название - " + getName() + ". Возраст - " + getAge() +
                ". Место обитания - " + getEnvironment() + ". Скорость - " + getSpeed() +
                ". Тип пищи - " + eat() + ", едят - " + getTypeOfFood() + ". Тип передвижения - " + go();
    }

    public final String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = validateStringValue(typeOfFood);
    }
}
