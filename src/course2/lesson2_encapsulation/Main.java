package course2.lesson2_encapsulation;

import course2.transport.Car;
import course2.transport.Car.Key;
import course2.transport.Car.Insurance;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        runHomeWork1Task1();
//        runHomeWork1Task2();
    }
    public static void runHomeWork1Task1() {
        System.out.println("Домашнее задание 1");
        Human vladimir = new Human("Владимир", LocalDate.now().getYear() - 21,
                "Казань", null);
        System.out.println(vladimir);
    }
    public static void runHomeWork1Task2() {
        System.out.println("Домашнее задание 2");
        Flower rosa = new Flower();
        rosa.setName("Роза обыкновенная");
        rosa.setCountry("Голландия");
        rosa.setCost(35.59);
        System.out.println(rosa);
        Flower chrysanthemum = new Flower();
        chrysanthemum.setName("Хризантема");
        chrysanthemum.setCost(15);
        chrysanthemum.setLifeSpan(5);
        System.out.println(chrysanthemum);
        Flower pion = new Flower();
        pion.setName("Пион");
        pion.setCountry("Англия");
        pion.setCost(69.9);
        pion.setLifeSpan(1);
        System.out.println(pion);
        Flower gypsophila = new Flower();
        gypsophila.setName("Гипсофила");
        gypsophila.setCountry("Турция");
        gypsophila.setCost(19.5);
        gypsophila.setLifeSpan(10);
        System.out.println(gypsophila);
        System.out.println("Дополнительное задание");
        Flower [] bouquet = {rosa, rosa, rosa, chrysanthemum, chrysanthemum, chrysanthemum,
                chrysanthemum, chrysanthemum, gypsophila};
        printCostOfBouquetAndLifeSpan(bouquet);
    }
    public static void printCostOfBouquetAndLifeSpan(Flower[] arr) {
        double sum = 0;
        double percent = 0.1;
        int lifeSpanBouquet = arr[0].getLifeSpan();
        System.out.println("Состав букета:");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getCost();
            if (arr[i].getLifeSpan() < lifeSpanBouquet) {
                lifeSpanBouquet = arr[i].getLifeSpan();
            }
            System.out.println(arr[i].getName());
        }
        sum += sum*percent;
        System.out.printf("Стоимость букета: %.2f", sum);
        System.out.println();
        System.out.println("Срок стояния: " + lifeSpanBouquet);
    }

}
