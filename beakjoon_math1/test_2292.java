package beakjoon_math1;



import java.io.*;
public class test_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		int plus = 6;
        int num = 1;
        
        while (n>num) {
        	cnt += 1;
            num += plus;
            plus += 6;
        }
		System.out.print(cnt);
		
		
	}

}
