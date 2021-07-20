package baekjoon_math2;

import java.io.*;
public class test_2581_2 {

	
	public static boolean [] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		arr = new boolean [n+1];
		get_prime();
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=m; i<=n; i++) {
			if(arr[i]==false) {
				sum += i;
				if(min>i) {
					min = i;
				}
			}
		}
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

	
	public static void  get_prime() {
		arr[0] = true;
		arr[1] = true;
		for(int i=2; i<=Math.sqrt(arr.length); i++) {
			for(int j = i*i; j< arr.length; j+=i ) {
				arr[j] = true;
			}
		}
	}
	
	
}
