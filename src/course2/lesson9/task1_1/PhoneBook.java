package course2.lesson9.task1_1;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        System.out.println("УРОК 9, ДЗ-1, задание 1");
        Contact contact1 = new Contact("Герман Панасевич", "+79123556789");
        Contact contact2 = new Contact("Света Петрова", "+79123456789");
        Contact contact3 = new Contact("Василий Петров", "+79123656789");
        Contact contact4 = new Contact("Алена Мартынова", "+79123456788");
        Contact contact5 = new Contact("Елена Соколова", "+79123456789");
        Contact contact6 = new Contact("Александр Плутник", "+79123459789");
        Contact contact7 = new Contact("Виталий Мутко", "+79123456788");
        Contact contact8 = new Contact("Владимир Путин", "+79123456589");
        Contact contact9 = new Contact("Любовь Успенская", "+79123436789");
        Contact contact10 = new Contact("Надежда Кадышева", "+79123656789");
        Contact contact11 = new Contact("Илья Громов", "+79123456789");
        Contact contact12 = new Contact("Татьяна Сергеева", "+79123456789");
        Contact contact13 = new Contact("Эдуард Мацкевич", "+79123456789");
        Contact contact14 = new Contact("Елизовета Петрова", "+79123456789");
        Contact contact15 = new Contact("Григорий Измайлов", "+79123456789");
        Contact contact16 = new Contact("Алена Зарецкая", "+79123456789");
        Contact contact17 = new Contact("Светлана Громова", "+79123456789");
        Contact contact18 = new Contact("Екатерина Мартынова", "+79123456789");
        Contact contact19 = new Contact("Раиса Пожилая", "+79123456789");
        Contact contact20 = new Contact("Виктория Панкова", "+79123456789");

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put(contact1.getName(), contact1.getPhoneNumber());
        phoneBook.put(contact2.getName(), contact2.getPhoneNumber());
        phoneBook.put(contact3.getName(), contact3.getPhoneNumber());
        phoneBook.put(contact4.getName(), contact4.getPhoneNumber());
        phoneBook.put(contact5.getName(), contact5.getPhoneNumber());
        phoneBook.put(contact6.getName(), contact6.getPhoneNumber());
        phoneBook.put(contact7.getName(), contact7.getPhoneNumber());
        phoneBook.put(contact8.getName(), contact8.getPhoneNumber());
        phoneBook.put(contact9.getName(), contact9.getPhoneNumber());
        phoneBook.put(contact10.getName(), contact10.getPhoneNumber());
        phoneBook.put(contact11.getName(), contact11.getPhoneNumber());
        phoneBook.put(contact12.getName(), contact12.getPhoneNumber());
        phoneBook.put(contact13.getName(), contact13.getPhoneNumber());
        phoneBook.put(contact14.getName(), contact14.getPhoneNumber());
        phoneBook.put(contact15.getName(), contact15.getPhoneNumber());
        phoneBook.put(contact16.getName(), contact16.getPhoneNumber());
        phoneBook.put(contact17.getName(), contact17.getPhoneNumber());
        phoneBook.put(contact18.getName(), contact18.getPhoneNumber());
        phoneBook.put(contact19.getName(), contact19.getPhoneNumber());
        phoneBook.put(contact20.getName(), contact20.getPhoneNumber());
        phoneBook.entrySet().forEach(System.out::println);

    }
}