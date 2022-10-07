package module_1.week_3.task_1.a;

import java.util.Scanner;

public class lab_1_3_1_a {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("Что ищем: ");
        String findStr = scannerString.nextLine();

        System.out.println("Введите количество строк: ");
        int stringCount = scannerInt.nextInt();

        StringBuilder str = new StringBuilder();
        System.out.println("Где ищем: ");

        for (int i = 0; i < stringCount; i++) {
            String stringForSearch = scannerString.nextLine();
            str.append(stringForSearch);
        }

        int count = countSubstring(str.toString(), findStr);
        System.out.println("Вывод: " + count);
    }

    public static int countSubstring(String str, String target) {
        return (str.split(target, -1).length) -1;
    }
}
