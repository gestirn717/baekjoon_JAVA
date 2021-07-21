package baekjoon_math2;

import java.io.*;
public class test_3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// split 을 이용하여 입력 받아서 나눠주기 
	    // 대신 문자열로 처리해야함 
		String [] arr1 = br.readLine().split(" ");
		String [] arr2 = br.readLine().split(" ");
		String [] arr3 = br.readLine().split(" ");
		
		String x;
		String y;
		
		// 문자열은 equals 로 하는것이 좋음 
		if(arr1[0].equals(arr2[0])) {
			x = arr3[0];
		}
		else if(arr1[0].equals(arr3[0])) {
			x = arr2[0];
		}
		else {
			x = arr1[0];
		}
		if(arr1[1].equals(arr2[1])) {
			y = arr3[1];
		}
		else if(arr1[1].equals(arr3[1])) {
			y = arr2[1];
		}
		else {
			y = arr1[1];
		}
		System.out.println(x+" "+y);

	}

}
