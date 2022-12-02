package course2.lesson6_exceptions;

public class Main {
    public static void main (String[] args) {
        boolean test1 = Data.check("Login 1", "Password", "Password");
        if (test1) {
            System.out.println("Все введено правильно");
        } else {
            System.out.println("Что-то не так");
        }
    }

}
