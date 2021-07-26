package beakjoon_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_8958_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int run = Integer.parseInt(br.readLine());
			
		String str [] = new String [run];
		
		for (int r=0; r<run; r++) {
			str[r] = br.readLine();
		}
		
		for (int i=0; i<run; i++) {
			int cnt =0; // 총 점수  
			int sum =0; // 누적 점수  
			
			// i번째 결과에 접근  
		    for(int j=0; j<str[i].length(); j++) {
		    	if(str[i].charAt(j)=='O') {
		    		sum ++;
		    	}else sum=0;
		    	cnt += sum;
		    }
		    sb.append(cnt).append("\n");
		}
    System.out.print(sb);
	}
}
