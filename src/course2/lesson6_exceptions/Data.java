package course2.lesson6_exceptions;

public class Data {
    private static final String VALID_CHARACTERS =
            "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_";
    private Data() {
    }

    public static boolean check(String login, String password, String confirmPassword) {
        try {
            checkLocal(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }


    private static void checkLocal(String login, String password, String confirmPassword)
    throws WrongLoginException, WrongPasswordException {
        if (!validate(login)){
            throw new WrongLoginException("Ошибка в логине");
        }
        if (!validate(password)) {
            throw new WrongPasswordException("Ошибка в пароле");
        }
        if ( !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
    private static boolean validate(String a) {
        if (a.length() > 20){
            return false;
        }
        for(int i=0; i<a.length(); i++){
            if(!VALID_CHARACTERS.contains(String.valueOf(a.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}


