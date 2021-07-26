package beakjoon_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_2562_2 {

	// 배열 만들지 않고 들어온 숫자 바로 비교 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int idx = 0;
		
		for(int i=0;i<9;i++) {
			
			int num = Integer.parseInt(br.readLine());
			if(num>max) {
				max = num;
				idx = i+1;
			}
		}
		 System.out.println(max);
	     System.out.println(idx);
	}
}
