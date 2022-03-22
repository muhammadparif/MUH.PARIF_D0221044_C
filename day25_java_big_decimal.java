<<<<<<< HEAD
package com.tutorial;

import java.math.BigDecimal;
import java.util.*;

public class day25_java_big_decimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Comparator<String> komparator = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a);//membandingkan
            }
        };
        
        Arrays.sort(s, 0, n, komparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
=======
package com.tutorial;

import java.math.BigDecimal;
import java.util.*;

public class day25_java_big_decimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Comparator<String> komparator = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a);//membandingkan
            }
        };
        
        Arrays.sort(s, 0, n, komparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
>>>>>>> 13e09d91ec80fa0ffaef4d2dd219a846b7a253cc
