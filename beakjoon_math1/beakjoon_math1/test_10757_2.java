package beakjoon_math1;

import java.io.*;
import java.util.*;

public class test_10757_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		
		int big_num = Math.max(s1.length(), s2.length());
		
		int[] a = new int[big_num +1];
		int[] b = new int[big_num +1];
		
		for(int i =s1.length()-1, idx=0; i>=0; i-- , idx++) {
			a[idx] = s1.charAt(i) - '0';
		}
		
		for(int i =s2.length()-1, idx=0; i>=0; i-- , idx++) {
			b[idx] = s2.charAt(i) - '0';
		}
		for (int i =0; i < big_num; i++) {
			int value =a[i] + b[i];
			a[i] = value%10;
			a[i+1] += (value / 10);
		}
		
		StringBuilder sb = new StringBuilder();
		if(a[big_num] != 0) {
			sb.append(a[big_num]);
		}
		
		for(int i = big_num-1; i>=0; i--) {
			sb.append(a[i]);
		}
		System.out.println(sb);
		
		

	}

}
