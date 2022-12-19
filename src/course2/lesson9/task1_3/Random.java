package course2.lesson9.task1_3;

import java.util.HashMap;
import java.util.Objects;

public class Random {
    HashMap<String, Integer> taskMap = new HashMap<>();

    public void addRandom(String key, Integer value) {
        if (Objects.equals(this.taskMap.get(key), value)) {
            throw new IllegalArgumentException();
        }
        this.taskMap.put(key, value);
    }
}
