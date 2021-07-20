package baekjoon_math2;


import java.io.*;
public class test_2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		boolean [] arr = new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			for(int j =i*i;j<=n; j+=i) {
				arr[j] =true;
			}
		}
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i=m; i<=n; i++) {
			if (arr[i]==false) {
				if(min>i) min = i;
				sum += i;
			}
		}
		if (sum ==0) System.out.println(-1);
		 else {
		     System.out.println(sum);
		     System.out.println(min);
		  }
	}
}
