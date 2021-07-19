package beakjoon_math1;


import java.io.*;
import java.util.*;
public class test_10250 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num;i++) {
			
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int floor = n%h, room = n/h;
			if (floor == 0) {
				System.out.println(h*100+room);
			}
			else {
				System.out.println(floor*100 +room+1);
			}		
		}	
	}
}
