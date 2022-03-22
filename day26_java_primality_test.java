<<<<<<< HEAD
package com.tutorial;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class day26_java_primality_test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bilangan = new BigInteger(n);
        boolean prima = bilangan.isProbablePrime(1);
        if (prima){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
=======
package com.tutorial;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class day26_java_primality_test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bilangan = new BigInteger(n);
        boolean prima = bilangan.isProbablePrime(1);
        if (prima){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
>>>>>>> 13e09d91ec80fa0ffaef4d2dd219a846b7a253cc
