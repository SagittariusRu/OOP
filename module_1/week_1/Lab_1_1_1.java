package module_1.week_1;

import java.util.Scanner;

public class Lab_1_1_1 {
    public static void main(String[] args) {
        System.out.println("Как твоё имя?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Привет, " + name);
    }
}
