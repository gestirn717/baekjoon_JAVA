package baekjoon_string;

import java.io.*;
public class test_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0; i<num;i++) {
			
			String str = br.readLine();
			if(group(str)) cnt ++;	
		}
		System.out.print(cnt);

	}
  
	static boolean group(String str) {
		
		boolean arr [] = new boolean[26];
		for(int i=0; i<str.length();i++) {
			
			if(arr[str.charAt(i)-'a'] == false) arr[str.charAt(i)-'a'] = true;
			
			else {
				if(str.charAt(i) != str.charAt(i-1)) return false;
			}
		}
		return true;
		
	}
	
}

 // boolean 배열 기본값은 false
 // 문자열 각 인덱스 별로 for문 돌면서 false면 트루로 바꿈 
 // 이미 true 일 경우 else문 돌면서 바로전 문자와 다르다면 false 반환