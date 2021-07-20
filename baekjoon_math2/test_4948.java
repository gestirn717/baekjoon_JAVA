package baekjoon_math2;

import java.io.*;
public class test_4948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean [] arr = new boolean [246913];
		arr[0] = true;
		arr[1] = true;
		
		for(int i=2; i<=Math.sqrt(arr.length);i++) {
			if(arr[i]) continue;
			for(int j=i*i; j<=arr.length; j+=i) {
				arr[j] =true;
			}
		}

		
		
	
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;
			int cnt =0;
			for(int i=n+1;i<=2*n;i++) {
				if(!arr[i])cnt++;
			}
			sb.append(cnt).append('\n');
			
		}
        System.out.println(sb);
	}

}
