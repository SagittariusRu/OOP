package module_1.week_2.task_1.c;

import java.util.Scanner;

public class lab_1_2_1_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Убедительная просьба вводить весь текст с маленькой буквы");
        System.out.println("Иначе я отказываюсь работать!");
        System.out.println();

        System.out.println("Хм...\n" + "Хочу ли играть в бадминтон...");

        System.out.println("Введите день недели: ");
        String weekDay = scanner.nextLine();

        if (weekDay.equals("воскресенье")) {
            System.out.println("Какая температура? (жарко/тепло/холодно): ");
            String theWeatherOutside = scanner.nextLine();
            if (theWeatherOutside.equals("тепло")) {
                System.out.println("Присуствоет ли осадки? (ясно, облачно, дождь, снег, град): ");
                String rainfall = scanner.nextLine();
                if (rainfall.equals("ясно") || rainfall.equals("облачно")) {
                    System.out.println("Есть ли ветер? (есть/нет): ");
                    String wind = scanner.nextLine();
                    if (wind.equals("нет")) {
                        System.out.println("Какая влажность? (высокая/низкая): ");
                        String airHumidity = scanner.nextLine();
                        if (airHumidity.equals("низкая")) {
                            System.out.println("\nДа");
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println("\nНет");
    }
}
