package module_1.week_2.task_1.b;

import java.util.Scanner;

public class lab_1_2_1_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDaysInMonth = 0;
        String monthOfName = "NULL";

        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        switch (month) {
            case 1 -> {
                monthOfName = "Январь";
                numberOfDaysInMonth = 31;
            }
            case 2 -> {
                monthOfName = "Февраль";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
            }
            case 3 -> {
                monthOfName = "Март";
                numberOfDaysInMonth = 31;
            }
            case 4 -> {
                monthOfName = "Апрель";
                numberOfDaysInMonth = 30;
            }
            case 5 -> {
                monthOfName = "Май";
                numberOfDaysInMonth = 31;
            }
            case 6 -> {
                monthOfName = "Июнь";
                numberOfDaysInMonth = 30;
            }
            case 7 -> {
                monthOfName = "Июль";
                numberOfDaysInMonth = 31;
            }
            case 8 -> {
                monthOfName = "Август";
                numberOfDaysInMonth = 31;
            }
            case 9 -> {
                monthOfName = "Сентябрь";
                numberOfDaysInMonth = 30;
            }
            case 10 -> {
                monthOfName = "Октябрь";
                numberOfDaysInMonth = 31;
            }
            case 11 -> {
                monthOfName = "Ноябрь";
                numberOfDaysInMonth = 30;
            }
            case 12 -> {
                monthOfName = "Декабрь";
                numberOfDaysInMonth = 31;
            }
        }
        System.out.println(monthOfName + " " + year + " года было " + numberOfDaysInMonth + " дней");
    }
}
