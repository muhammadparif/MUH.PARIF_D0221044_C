package com.tutorial;

import java.util.Scanner;

public class day4_java_stdin_and_stdout_ii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        scanner.nextLine();
        String c = scanner.nextLine();

        System.out.println("String: "+ c);
        System.out.println("Double: "+ b);
        System.out.println("Int: "+ a);

    }
}
