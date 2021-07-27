package while_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_10951_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str=br.readLine()) !=null) {
			int a = str.charAt(0);
			int b = str.charAt(0);
			sb.append(a+b).append("\n");		
		}		
		 System.out.print(sb);
	}
}
