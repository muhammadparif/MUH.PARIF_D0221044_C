<<<<<<< HEAD
package com.tutorial;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day24_tag_content_extractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            boolean running = false;
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                running = true;
            }
            if (!running) {
                System.out.println("None");
            }
			
			testCases--;
		}
	}
}



=======
package com.tutorial;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day24_tag_content_extractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            boolean running = false;
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                running = true;
            }
            if (!running) {
                System.out.println("None");
            }
			
			testCases--;
		}
	}
}



>>>>>>> 13e09d91ec80fa0ffaef4d2dd219a846b7a253cc
