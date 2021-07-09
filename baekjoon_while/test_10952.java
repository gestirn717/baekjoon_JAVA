package baekjoon_while;

import java.io.*;
import java.util.*;

public class test_10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a+b;
			
			if(a==0 && b==0) {
				break;
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		
	}

}
