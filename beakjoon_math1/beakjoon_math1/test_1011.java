package beakjoon_math1;

import java.lang.Math;
import java.io.*;
import java.util.*;
public class test_1011 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int run = Integer.parseInt(br.readLine());
		
		for(int r=0; r<run; r++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int d = b-a;
			double k = Math.sqrt((double)d);
			k = Math.ceil(k);
			if(d > k*(k-1)) {
				System.out.println((int)(k*2-1));
			}
			else {
				System.out.println((int)(k*2-2));
			}
			
		}
		

	}

}
