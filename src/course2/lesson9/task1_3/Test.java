package course2.lesson9.task1_3;

public class Test {
    public static void main(String[] args) {
        Random task3 = new Random();
        task3.addRandom("First", 16789);
        System.out.println(task3.taskMap);
        task3.addRandom("Second", 1987);
        task3.addRandom("First", 17);
        System.out.println(task3.taskMap);
    }
}
