// lab 2 5 1 a

package module_2.week_5.task_1.a;

import java.util.Scanner;
import java.util.ArrayList;

public class permutationOfNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ввод: ");

            String userString = input.nextLine();
            int [] customList = stringConverter(userString);

            System.out.println(perms(customList));
        }
    }

    public static int[] stringConverter(String userString) {
        String[] stringArray = userString.split(",");

        int convertedArray[] = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            convertedArray[i] = Integer.parseInt(stringArray[i]);
        }

        return convertedArray;
    }

    public static ArrayList<ArrayList<Integer>> perms(int[] arr) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        permsSupport(output, new ArrayList<>(), arr);
        return output;
    }

    public static void permsSupport(ArrayList<ArrayList<Integer>> output, ArrayList<Integer> list, int[] arr) {
        if (list.size() == arr.length) {
            output.add(new ArrayList<Integer>(list));
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (list.contains(arr[i])) {
                    continue;
                }

                list.add(arr[i]);
                permsSupport(output, list, arr);
                list.remove(list.size() - 1);
            }
        }
    }
}
