package module_1.week_2.task_3.c;

import java.util.Scanner;

public class lab_1_2_3_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Размер массива: ");
        int len = scanner.nextInt();

        int[] array = new int[len];

        System.out.println("Введите массив: ");

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        //


        double median;
        if (array.length % 2 == 0) {
            median = ((double)array[array.length / 2] + (double)array[array.length / 2 - 1]) / 2;
        } else {
            median = array[array.length / 2];
        }

        System.out.println(median);
    }
}
