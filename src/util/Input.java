package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public static void setScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }

    public Input() {
        scanner = new Scanner(System.in);
        System.out.println("hi from constructor");
    }

    public String getString(String prompt) {
        if (prompt == null) {
            System.out.println("Enter a string: ");
        } else {
            System.out.println(prompt);
        }
        String s = scanner.nextLine();
        if (s.trim().length() == 0) {
            getString(prompt);
        }
        return s;
    }

//    public int getInt(){
//        return
//    }

    public boolean yesNo(String prompt) {
        System.out.println(Objects.requireNonNullElse(prompt, "Enter a boolean: "));
        boolean b = scanner.nextLine().toLowerCase().contains("y");
        if (!b)
            yesNo(prompt);
        return b;
    }

    public int getInt() {
        int num = 0;

        System.out.println("Enter an integet: ");

        try {
            num = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            num = getInt();
        }
        return num;
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d - %d.", min, max);
        int num;
        do {
            num = getInt();
        } while (num > max || num < min);
        return num;
    }

//    double getDouble(double min, double max) {
//
//    }
//
//    double getDouble() {
//
//    }
}
