package array_test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class test2_2562_1 {

	// for 문 이용  
	// 배열 
	// 입력 받자마자 값 비교, 인덱스 번호 겡신 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		int arr [] = new int [9];
		int max = 0;
		int idx = 0;
		
		for(int i= 0; i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]>max) {
				max =arr[i];
				idx = i+1;
			}
		}
      System.out.println(max);
      System.out.println(idx);
	}

}
