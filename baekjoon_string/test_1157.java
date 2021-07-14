package baekjoon_string;


import java.util.*;
import java.io.*;

public class test_1157 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] arr = new int[26];
		for(int i=0; i<str.length();i++) {
			arr[str.charAt(i)-'A'] += 1; //배열 선언시 0으로 초기화 되어 으니 문자 나오면 +1 해줘 
		}
		
        //배열중 가장 큰수 찾기
	    int max = 0;
	    for(int i=0; i < arr.length; i++) {
	    	if(arr[max] < arr[i]) {
	    		max = i;
	    	}
	    }
	    //배열 정렬해서 맨뒤와 그 앞에 숫자가 같다면 여러개 존재  
		Arrays.sort(arr);
		if(arr[arr.length-1]==arr[arr.length-2]) {
			System.out.println("?");
		}
		else {
			System.out.println((char)('A'+max));
		}
	}

}
