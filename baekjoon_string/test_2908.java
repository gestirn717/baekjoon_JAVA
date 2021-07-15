package baekjoon_string;

import java.util.*;
import java.io.*;

public class test_2908 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		s1 = sb1.reverse().toString();
		s2 = sb2.reverse().toString();
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		if(num1>num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
		

	}

}
