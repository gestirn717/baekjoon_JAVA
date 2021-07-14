package baekjoon_string;

import java.io.*;
public class test_10809 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for(char i =97;i<123;i++) {
			System.out.printf("%d ",str.indexOf(i));
		}
	 

	}

}
