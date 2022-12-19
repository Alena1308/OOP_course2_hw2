package course2.lesson9.task2_1;

import java.util.*;

public class Task2Lesson9 {
    public static void main(String[] args) {
        Map<String, List<Integer>> task2 = new HashMap<>();
        List<Integer> value1 = new ArrayList<>();
        value1.add((int) (Math.random()*1000)+1);
        value1.add((int) (Math.random()*1000)+1);
        value1.add((int) (Math.random()*1000)+1);
        task2.put("first", value1);
        List<Integer> value2 = new ArrayList<>();
        value2.add((int) (Math.random()*1000)+1);
        value2.add((int) (Math.random()*1000)+1);
        value2.add((int) (Math.random()*1000)+1);
        task2.put("second", value2);
        List<Integer> value3 = new ArrayList<>();
        value3.add((int) (Math.random()*1000)+1);
        value3.add((int) (Math.random()*1000)+1);
        value3.add((int) (Math.random()*1000)+1);
        task2.put("third", value3);
        List<Integer> value4 = new ArrayList<>();
        value4.add((int) (Math.random()*1000)+1);
        value4.add((int) (Math.random()*1000)+1);
        value4.add((int) (Math.random()*1000)+1);
        task2.put("fourth", value4);
        List<Integer> value5 = new ArrayList<>();
        value5.add((int) (Math.random()*1000)+1);
        value5.add((int) (Math.random()*1000)+1);
        value5.add((int) (Math.random()*1000)+1);
        task2.put("fifth", value5);
        System.out.println(task2);

        Map<String, Integer> secondPart = new HashMap<>();
        for (Map.Entry<String, List<Integer>> target : task2.entrySet()) {
            secondPart.put(target.getKey(), calcSumOfList(target.getValue()));
        }
        System.out.println(secondPart);

        System.out.println("---------------------------------------------------------------");
        System.out.println("УРОК 9, ДЗ-2, задание 2");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 1; i < 11; i++) {
            String s = "Строчное значение № " + i;
            linkedHashMap.put(i, s);
        }
        System.out.println(linkedHashMap);
    }
    public static int calcSumOfList(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
