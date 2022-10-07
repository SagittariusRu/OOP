package module_1.week_2.task_2.b;

import java.util.Scanner;

public class lab_1_2_2_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        double x = scanner.nextDouble();

        sqrt(x);
    }

    static void sqrt(double x) {
        double myDouble = x;
        int myInt = 0;

        while ((myDouble * myDouble > x) && (myInt < 200)) {
            myDouble  = (myDouble + x / myDouble) / 2;
            myInt++;
        }
        System.out.println("Значение квадратного корня: " + myDouble);
    }
}
