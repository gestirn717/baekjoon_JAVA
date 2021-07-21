package baekjoon_math2;


import java.io.*;
public class test_4948_2 {

	public static boolean arr[] = new boolean [246913];
	
	public static int cnt[] = new int [246913];
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		get_prime();
		get_count();

		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;
			
			// 2n 까지의 누적 갯수 - n 까지의 누적 갯수  
			sb.append(cnt[2*n]-cnt[n]).append('\n');
		}
		System.out.print(sb);
	}

	public static void get_prime() {
		arr[0] = true;
		arr[1] = true;
		for(int i=2; i<=Math.sqrt(arr.length);i++) {
			for(int j=i*i;j<arr.length;j+=i) {
				arr[j] = true;
			}
		}
	}
	
	//인덱스값에는 누적 갯수 쌓이도록   
	public static void get_count() {
		int count = 0;
		for(int i=2;i<arr.length;i++) {
			if(!arr[i]) count++;
			
			cnt[i] = count;
		}	
	}	
}
