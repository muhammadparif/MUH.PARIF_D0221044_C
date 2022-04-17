package com.turorial;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day52_java_exception_handling_try_catch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        } 
        catch(InputMismatchException e) {
            // pastikan bahwa"java.util.InputMismatchException" hanya dicetak.
            System.out.println(e.getClass().toString().replaceFirst("class ", ""));
        }
        catch(ArithmeticException e) {
            // Print exception
            System.out.println(e);
        }
        scan.close();
    }
}
