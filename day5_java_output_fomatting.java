package com.tutorial;

import java.io.*;
import java.util.*;

public class day5_java_output_fomatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String nama = scanner.next(); int nilai = scanner.nextInt();
            String nama1 = scanner.next(); int nilai1 = scanner.nextInt();
            String nama2 = scanner.next(); int nilai2 = scanner.nextInt();

            System.out.println("==========================");
            System.out.printf("%-15s%03d%n", nama, nilai);
            System.out.printf("%-15s%03d%n", nama1, nilai1);
            System.out.printf("%-15s%03d%n", nama2, nilai2);
            System.out.println("==========================");
            
        
        
    }
}
