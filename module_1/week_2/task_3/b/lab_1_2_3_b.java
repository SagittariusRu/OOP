package module_1.week_2.task_3.b;

import java.util.Scanner;

public class lab_1_2_3_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Размер массива: ");
        int len = scanner.nextInt();

        int[] array = new int[len];

        System.out.println("Введите массив: ");

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        mergeSort(array, array.length);

        System.out.println("Массив: ");
        for (int i: array) {
            System.out.println(i + " ");
        }
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }

        while (i < left) {
            a[k++] = l[i++];
        }

        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
