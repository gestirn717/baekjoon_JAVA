package while_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_10952_2 {

	public static void main(String[] args)  throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String s = br.readLine();
			int a = s.charAt(0)-48;
			int b = s.charAt(2)-48;
			
			if(a==0 && b==0) {
				break;
			}
			sb.append(a+b).append("\n");
		}
     System.out.print(sb);
	}

}
