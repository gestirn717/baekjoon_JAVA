package baekjoon_string;


import java.io.*;
public class test_2941_2 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = str.length();
		
		for(int i=0; i<str.length();i++) {
			
			// 문자가 = 이면 카운터 - 해줌
			// 추가적으로 dz= 일경우를 고려해서 추가로 -
			
			if(str.charAt(i) == '=') {
				num --;
				if(i>1 && str.charAt(i-1)=='z' && str.charAt(i-2) == 'd') num--;
			}
			
			// lj, nj 일 경우 카운터 -
		    if(i>0 && str.charAt(i) == 'j' && (str.charAt(i-1) == 'n' || str.charAt(i-1) == 'l')) num--;
		    if(str.charAt(i) == '-') num--;	
		}
        System.out.println(num);

	}

}
