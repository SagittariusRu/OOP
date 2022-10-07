package module_1.week_2.task_1.a;

import java.util.Scanner;

public class lab_1_2_1_a {
    public static void main(String[] args) {
        System.out.println("Возраст: ");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age == 1) {
            System.out.println("Тебе " + age + " год");
        } else if (age >= 2 && age <= 4) {
            System.out.println("Тебе " + age + " года");
        } else if (age >= 11 && age <= 20) {
            System.out.println("Тебе " + age + " лет");
        } else if (age % 10 == 1) {
            System.out.println("Тебе " + age + " год");
        } else if (age % 10 >= 2 && age % 10 <= 4) {
            System.out.println("Тебе " + age + " года");
        }
        else
            System.out.println("Тебе " + age + " лет");
    }
}
// если оканчивается на 1, 2, 3, 4, то (год/года), а во всех остальных случаях лет
// если 1, то год, а если 2, 3, 4, то года -//-
