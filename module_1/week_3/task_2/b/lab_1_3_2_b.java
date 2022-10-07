package module_1.week_3.task_2.b;

import java.util.Scanner;
import java.util.regex.Pattern;

public class lab_1_3_2_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите IPv6 адресс: ");
        String ipv6 = scanner.nextLine();

        System.out.println(isValidIPv6(ipv6));
    }

    public static boolean isValidIPv6(String ipv6) {
        if ((ipv6 != null) && (!ipv6.isEmpty())) {
            return Pattern.matches("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$", ipv6);
        }
        return false;
    }
}
