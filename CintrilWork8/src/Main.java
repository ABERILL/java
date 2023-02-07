import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException,WrongPasswordException {

        CheckInfo("ilya321","WRGERHKBERLINEFEFSWEDFSDSDDE","ilya321");
    }

    static boolean CheckInfo (String password, String login, String confirmpassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Логин слишком длинный");

            }
            if (!login.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongLoginException("Логин не соответствует требованиям");
            }
            if (password.length() > 20) {
                throw new WrongPasswordException("Пароль слишком длинный");
            }
            if (!password.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongPasswordException("Пароль не соответствует требованиям");
            }
            if (!password.equals(confirmpassword)) {
                throw new WrongPasswordException("неправильное подтверждение пароля");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;


    }
}
