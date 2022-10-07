// Простое число — натуральное число, имеющее ровно два различных натуральных делителя.
// Другими словами, натуральное число x является простым,
// если оно отлично от 1 и делится без остатка только на 1 и на само x.

package module_1.week_2.task_2.c;

import java.util.Scanner;

public class lab_1_2_2_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапозон");
        int x = scanner.nextInt();

        System.out.println("Простые числа: ");
        System.out.println("<= " + x);
        sieve(x);
    }

    static void sieve(int range) {
        boolean[] primeNumber = new boolean[range + 1];

        // изначально число истино
        // если не простое, то наоборот
        for (int i = 0; i <= range; i++) {
            primeNumber[i] = true;
        }

        //
        for (int j = 2; j * j <= range; j++) {
            // если число не изменяется значит оно простое
            if (primeNumber[j]) {
                // кратные j
                for (int i = j * j; i<= range; i += j) {
                    primeNumber[i] = false;
                }
            }
        }

        // Вывод простых чисел
        for (int i = 2; i <= range; i++) {
            if (primeNumber[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
