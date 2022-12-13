package course2.lesson8_collections_hash.task2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {
    public static void main(String[] args) {
        Set<Integer>integers = new HashSet<>();
        for (int i=0; i<21; i++){
            integers.add((int) (Math.random()*1000) +1);
        }
        System.out.println(integers);
        integers.removeIf(integer -> integer % 2 != 0);
        System.out.println(integers);

    }
}
