package array_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_2577_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 받으면서 바로 곱셈  
	   int num = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
	    
	    // 배열 생성
	   int arr [] = new int [10];
	   
	   // 문자열로 변환하지 않고 숫자 그대로 사용 
	   // 숫자 뒤에서 부터 잘라서 체크 (나머지,나눗셈 이용)
	   // 해당 숫자 그대로 인덱스 번호로 이용  
	   while (num != 0) {
		   arr[num%10] ++;
		   num /= 10;
	   }
	   
	  for (int v : arr) {
		  System.out.println(v);
	  }
	}
}