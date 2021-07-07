package baekjoon_for;

import java.io.*;
public class test_10950_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			String string[] = br.readLine().split(" ");
			a = Integer.parseInt(string[0]);
			b = Integer.parseInt(string[1]);
			System.out.println(a+b);
		}

	}

}
