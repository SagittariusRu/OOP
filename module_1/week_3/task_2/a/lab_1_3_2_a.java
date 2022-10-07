package module_1.week_3.task_2.a;

import java.util.Scanner;
import java.util.regex.Pattern;

public class lab_1_3_2_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой email: ");
        String email = scanner.nextLine();

        System.out.println(isValidEmail(email));
    }

    public static boolean isValidEmail(String email) {
        if ((email != null) && (!email.isEmpty())) {
            return Pattern.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$", email);
        }
        return false;
    }
}
