package course2.lesson7_collections;

import java.util.*;

public class Task2 {
    private static final int MAXSIZE = 5;
    private static final List<String> NAMES = List.of("Андрей", "Вова", "Лена", "Катя",
            "Света", "Гриша", "Ира", "Соня", "Женя", "Антон", "Слава", "Тася");
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        Queue<String> queue3 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("Первая очередь: "+queue1);
        System.out.println("Вторая очередь: "+queue2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        add("Валя", queue1, queue2, queue3);
        System.out.println("Первая очередь: "+queue1);
        System.out.println("Вторая очередь: "+queue2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        remove(queue1,queue2);
        System.out.println("Первая очередь: "+queue1);
        System.out.println("Вторая очередь: "+queue2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
    private static void add(String name, Queue<String> queue1, Queue<String> queue2, Queue<String> queue3) {
        if (queue1.size()< queue2.size()){
            queue1.offer(name);
        }else if(queue2.size()< queue1.size()){
            queue2.offer(name);
        } else if (queue1.size()==queue2.size() && queue1.size()!=MAXSIZE && queue2.size()!=MAXSIZE) {
            queue1.offer(name);
        } else {
            System.out.println("Зовите Галю!");
            queue3.add(name);
        }
    }
    private static void remove( Queue<String> queue1, Queue<String> queue2){
        if(RANDOM.nextBoolean()){
            queue1.poll();
        } else {
            queue2.poll();
        }
    }
    private static void randomFilling(Queue<String> queue){
        int size=RANDOM.nextInt(MAXSIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
}

