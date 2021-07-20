package baekjoon_math2;

import java.io.*;
public class test_9020 {

	
	public static boolean [] arr = new boolean [10001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		get_prime();
		
		
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			
			int n = Integer.parseInt(br.readLine());
			int p1 = n/2;
			int p2 = n/2;
			
			while(true) {
				if(!arr[p1] && !arr[p2]) {
					sb.append(p1).append(" ").append(p2).append('\n');
					break;
				}
				p1 --;
				p2 ++;
			}		
		}
		System.out.print(sb);
	}
	
	 public static void get_prime() {
		 arr[0] = true;
		 arr[1] = true;
		 for(int i=2; i<=Math.sqrt(arr.length); i++) {
			 for(int j=i*i; j < arr.length; j += i) {
				 arr[j] = true;
			 }
		 }
	 }

}
