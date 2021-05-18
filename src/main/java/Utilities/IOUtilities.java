package Utilities;

import java.util.Scanner;

public class IOUtilities {
    private static Scanner sc;

    public static void print(String str) {
        System.out.print(str);
    }

    public static String userData(String str) {
        print(str);
        sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void Nullpointer() {
        System.out.print("Please enter at least 2 characters!" + "\n");
    }

    public static void IllegalArgument() {
        System.out.print("The value you enter may not contain spaces!" + "\n");
    }
}
