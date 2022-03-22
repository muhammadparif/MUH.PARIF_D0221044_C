package com.tutorial;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class day9_java_end_of_file {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i = 1;
        do {
            String n = input.nextLine();
            System.out.println(i +" "+ n);
            i++;
        } while (input.hasNext());
    }
}
