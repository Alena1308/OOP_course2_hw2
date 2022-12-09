package course2.lesson8_collections_hash;

import java.util.HashMap;

public class TestPassport {
    public static void main(String[] args) {
        System.out.println("ДЗ-3");
        System.out.println("Задание-3");
        Passport p1 = new Passport(
                "AB123456",
                "Salise",
                "Gabriel",
                "-",
                "13/12/1975");
        Passport p2 = new Passport(
                "AB12D456",
                "Mayer",
                "Susian",
                "-",
                "07/10/1973");
        Passport p3 = new Passport(
                "B12C3456",
                "Orson",
                "Bree",
                "-",
                "06/12/1970");
        Passport p4 = new Passport(
                "AB789123",
                "Skavo",
                "Linett",
                "-",
                "13/11/1970");
        Passport p5 = new Passport(
                "B12C3456",
                "Van de Camp",
                "Bree",
                "-",
                "06/12/1970");

        HashMap<String, Passport> list = new HashMap<>();
        list.put(p1.getPassportNumber(), p1);
        list.put(p2.getPassportNumber(), p2);
        list.put(p3.getPassportNumber(), p3);
        list.put(p4.getPassportNumber(), p4);
        System.out.println(list);
        list.put(p5.getPassportNumber(), p5);
        System.out.println(list);
        System.out.println(list.get("B12C3456"));
    }
}
