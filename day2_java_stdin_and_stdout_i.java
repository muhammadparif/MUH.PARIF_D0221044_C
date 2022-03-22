package com.tutorial;

import java.util.*;



public class day3_java_stdin_and_stdout_i {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int nilai1 = scanner.nextInt();
        int nilai2 = scanner.nextInt();
        int nilai3 = scanner.nextInt();
        scanner.close();
        // output
        System.out.println(nilai1);
        System.out.println(nilai2);
        System.out.println(nilai3);
    }
}
