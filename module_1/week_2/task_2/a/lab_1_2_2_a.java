package module_1.week_2.task_2.a;

import java.util.Scanner;

public class lab_1_2_2_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите высоту пирамиды: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= i; n++) {
                System.out.print("#");
            }

            // Пробел между пирамидами
            System.out.print(" ");
            System.out.println("#".repeat(i));
        }
    }
}
