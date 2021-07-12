package beakjoon_array;

import java.io.*;
public class test_2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] num = new int [3];
		int mul = 1;
		
		for (int i=0;  i<num.length;i++) {
			num[i] = Integer.parseInt(br.readLine());
			mul *= num[i];
		}
		
		String str = Integer.toString(mul);
		
       // 1~9까지
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<str.length();j++) {
				if(str.charAt(j)-48 == i) {
					count++;
				}
				
			}
			System.out.println(count);
		}
	}
}

