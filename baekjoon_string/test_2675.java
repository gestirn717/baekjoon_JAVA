package baekjoon_string;


import java.util.*;
import java.io.*;
public class test_2675 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i=0; i<tc; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			String rpt = " ";
			for(int j=0; j < str.length(); j ++) {
				for(int k=0; k<num; k++) {
					rpt += str.charAt(j);
				}
			}
			System.out.println(rpt);
		}

	}

}
