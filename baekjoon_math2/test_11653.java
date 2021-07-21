package baekjoon_math2;

import java.io.*;
public class test_11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		// 제곱근까지만 탐색해주면 됨, 나머지 처리는 따로  
		for(int i=2; i<=Math.sqrt(N);i++) {
			
			// while 문 써야 조건 만족하면 계속 한가지로 나눌 수 있음   
			while(N%i ==0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		
		// 나머지 처리  
		if(N != 1) {
			sb.append(N);
		}
		
		
		System.out.println(sb);

	
	}
}
