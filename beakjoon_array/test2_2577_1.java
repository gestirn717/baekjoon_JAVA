package beakjoon_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_2577_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받으면서 바로 곱셈  
		int num = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		
		// String.valueOf(num) 사용시 컴파일 에러뜸  
		String str = Integer.toString(num);
		
		// 0~9까지 
	    for(int i=0; i<=9; i++) {
	    	int cnt = 0; // 카운터 생성
	    	for(int j=0; j<str.length(); j++) {
	    		
	    		// 문자열 처음 부터 끝까지 돌면서 i 가 나오면 카운터 증가  
	    		if(str.charAt(j) ==i) cnt ++;  
	    	}
	     System.out.println(cnt);
	    	
	    }
	}
}
