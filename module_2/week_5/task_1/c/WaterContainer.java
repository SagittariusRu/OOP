package module_2.week_5.task_1.c;

import java.util.ArrayList;
import java.util.Scanner;

public class WaterContainer {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String stringWithLineLengths = input.nextLine();
            ArrayList<Integer> lengthsList = stringConverter(stringWithLineLengths);
            System.out.println(maxSquare(lengthsList));
        }
    }

    public static int maxSquare(ArrayList<Integer> lengthsList) {
        int maxValue = 0;
        for (int i = 0; i < lengthsList.size(); i++) {
            for (int j = i + 1; j < lengthsList.size(); j++) {
                int value = (j - i) * Math.min(lengthsList.get(i), lengthsList.get(j));
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }

    public static ArrayList<Integer> stringConverter(String inputString) {
        String[] stringArray = inputString.split(",");

        ArrayList<Integer> inputList = new ArrayList<Integer>();
        for (int i = 0; i < stringArray.length; i++) {
            inputList.add(Integer.valueOf(stringArray[i]));
        }

        return inputList;
    }

}
