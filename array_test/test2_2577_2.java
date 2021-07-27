package array_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_2577_2 {

	public static void main(String[] args)  throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		// 입력 받으면서 바로 곱셈  
		int num = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		// 문자열로 바꿔주기  
		String str = String.valueOf(num);
		// 0~9 까지, 길이 10의 배열 생성 
		int arr [] = new int [10];
			
		for(int i=0; i<str.length(); i++) {
		    //i는 문자열 길이만큼 돌면서 문자열의 인덱스 0 부터 각 숫자 나오면
		    // 그 수를 인덱스 번호로 해서 해당 인덱스 ++
		    // 배열에서 인덱스 번호는 해당 숫자  
		    arr[(str.charAt(i)-48)]++;
		    }
		    
		    // 배열안에 값들출력 
	    for (int v : arr) {
		    	System.out.println(v);
		    }
		}
	}
