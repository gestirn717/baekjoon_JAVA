package beakjoon_math1;

import java.io.*;
public class test_28839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = -1;
		
		for(int i=0; i<=(n/3); i++) {
			for(int j =0; j<=(n/5);j++) {
				if(3*i + 5*j == n && j>i ) {
					num = i+j;
				}
			}
		}
		System.out.println(num);

	}

}
