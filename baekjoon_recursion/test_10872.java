package baekjoon_recursion;

import java.io.*;
public class test_10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int n= factorial(N);
		System.out.println(n);

	}
	
	public static int factorial(int N) {
		if (N<=1) return 1;
		return N * factorial(N-1);
	}
}
