package module_1.week_4.task_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class lab_1_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к файлу: ");
        String file = scanner.nextLine();
        System.out.println(getLines(file));
    }

    public static String getLines(String pathName) {
        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader(pathName));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        }

        StringBuilder stringBuilder = new StringBuilder();
        String readLine;
        while (true) {
            try {
                if ((readLine = bufferedReader.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stringBuilder.append(readLine).append("\n");
        }
        return stringBuilder.toString();
    }
}
