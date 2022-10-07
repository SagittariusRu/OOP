package module_1.week_2.task_3.a;

import java.util.Scanner;

public class lab_1_2_3_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Размер массива: ");
        int len = scanner.nextInt();

        int[] array = new  int[len];

        System.out.println("Введите массив: ");

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Максимум в массиве " + maximum(array));

        int count = 0;

        for (int j: array) {
            if (j == maximum(array)) {
                count++;
            }
        }

        System.out.println("Количество максимума " + count);
    }

    static int maximum(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
