package array_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_8958_2 {
 
	// 배열 사용하지 않기
	// getBytes 사용하기
	// for each 문 사용하기  
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int run = Integer.parseInt(br.readLine());

	    for(int r =0; r<run; r++) {
	    	
	    	int cnt = 0;
	    	int sum = 0;
	    	
	    	for(byte v : br.readLine().getBytes()) {
	    		
	    		if(v=='O') {
	    			sum++;
	    			cnt += sum;
	    		}
	    		else sum=0;
	    	}
	    	
	    	sb.append(cnt).append('\n');
	    	
	    }
		System.out.print(sb);
	}
}
