package module_1.week_4.task_2;

import java.util.Scanner;

public class lab_1_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        String message = scanner.nextLine();

        System.out.println("");
        String type = scanner.nextLine();

        System.out.printf("%s: %s -> %s: %s",
                message,
                message.getClass().getSimpleName(),
                calculation(message, type),
                calculation(message, type).getClass().getSimpleName()
        );
    }

    public static Object calculation(String message, String type) {
        switch (type) {
            case "Integer" -> {
                try {
                    return Integer.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Float" -> {
                try {
                    return Float.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Double" -> {
                try {
                    return Double.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Character" -> {
                try {
                    return new char[message.length()];
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Byte" -> {
                try {
                    return Byte.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Short" -> {
                try {
                    return Short.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Long" -> {
                try {
                    return Long.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            } case "Boolean" -> {
                try {
                    return Boolean.valueOf(message);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
            default -> {
                return message;
            }
        }
    }
}
