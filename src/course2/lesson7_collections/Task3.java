package course2.lesson7_collections;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        example();
    }
    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                //biDemArrList.get(i).add(j, (i+j)%2=1 ? "●" : "◯"); - Вот эта строчка заменяет 7 нижних
                if (i==0 && j%2!=0 || i%2==0 && j%2!=0){
                    biDemArrList.get(i).add(j, "●");
                } else if (i!=0 && i%2!=0 && j%2==0){
                    biDemArrList.get(i).add(j, "●");
                } else {
                    biDemArrList.get(i).add(j, "◯");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }
}
