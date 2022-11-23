package course2.lesson3_task_3.animals;

public class Animal_test {
    public static void main(String[] args) {
        Amphibious frog = new Amphibious("Лягушка", 1,"Пруд");
        Amphibious waterSnake = new Amphibious("Уж пресноводный", 1,"Пруд");
        Amphibious frog2 = new Amphibious("Лягушка", 1,"Пруд");
        System.out.println(frog);
        System.out.println(waterSnake);
        System.out.println(frog.equals(waterSnake));
        System.out.println(frog2.equals(frog));

        Herbivorous gazelle = new Herbivorous("Газель",3,"луг", 50,"трава");
        Herbivorous giraffe = new Herbivorous("Жираф",3,"савана", 20,"трава");
        Herbivorous horse = new Herbivorous("Лошадь",3,"луг", 60,"трава");
        Herbivorous horse2 = new Herbivorous("Лошадь",3,"луг", 60,"трава");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(horse.equals(giraffe));
        System.out.println(horse2.equals(horse));

        Predators hyena = new Predators("Гиена", 3, "савана", 70, "мясо");
        Predators tiger = new Predators("Тигр", 3, "джунгли", 70, "мясо");
        Predators bear = new Predators("Медведь", 3, "лес", 30, "мясо");
        Predators bear2 = new Predators("Медведь", 3, "лес", 30, "мясо");
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(bear.equals(bear2));
        System.out.println(bear.equals(tiger));

        Flightless peacock = new Flightless("Павлин", 1, "Джунгли", "на лапках");
        Flightless penguin = new Flightless("Пингвин", 1, "Арктика", "на лапках");
        Flightless penguin2 = new Flightless("Пингвин", 1, "Арктика", "на лапках");
        Flightless dodoBird = new Flightless("Птица До-до", 1, "Джунгли", "на лапках");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);
        System.out.println(penguin.equals(penguin2));
        System.out.println(penguin.equals(tiger));

        Flying seagull = new Flying("Чайка", 2, "возле воды", "крылья");
        Flying albatross = new Flying("Альбатрос", 2, "возле океана", "крылья");
        Flying falcon = new Flying("Сокол", 2, "возле полей", "крылья");
        Flying falcon2 = new Flying("Сокол", 2, "возле полей", "крылья");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        System.out.println(falcon.equals(falcon2));
        System.out.println(penguin.equals(falcon));
    }
}
