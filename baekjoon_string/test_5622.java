package baekjoon_string;


import java.io.*;
public class test_5622 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
		for (int i = 0; i < str.length();i++) {
			if(str.charAt(i) <= 'C') sum +=3;
			else if (str.charAt(i) <= 'F') sum += 4;
			else if (str.charAt(i) <= 'I') sum += 5;
			else if (str.charAt(i) <= 'L') sum += 6;
			else if (str.charAt(i) <= 'O') sum += 7;
			else if (str.charAt(i) <= 'S') sum += 8;
			else if (str.charAt(i) <= 'V') sum += 9;
			else sum += 10;	
		}
		System.out.println(sum);
	}
}
