package module_1.week_1;

import java.util.Scanner;

public class Lab_1_1_3 {
    public static void main(String[] args) {
        System.out.println("Введите длину ребра икосаэдра: ");

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double volume = 5.0/12.0 * Math.pow(x, 3) * (3 + Math.sqrt(5));

        System.out.println("Объём икосаэдра равен: " + volume);
    }
}
