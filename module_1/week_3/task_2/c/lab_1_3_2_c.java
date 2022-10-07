package module_1.week_3.task_2.c;

import java.util.Scanner;
import java.util.SortedMap;

public class lab_1_3_2_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String repeat = scanner.nextLine();

        System.out.println("Вывод: " + funcRepeat(repeat));
    }

    public static String funcRepeat(String str) {
        str = str.replaceAll("([а-яa-z])\\1{2,}", "$1");
        return str;
    }
}
