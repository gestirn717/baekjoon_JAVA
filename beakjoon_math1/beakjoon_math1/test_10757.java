package beakjoon_math1;

import java.math.BigInteger;
import java.io.*;
import java.util.*;
public class test_10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String m = st.nextToken();

        BigInteger bigNum1 = new BigInteger(n);
        BigInteger bigNum2 = new BigInteger(m);
        System.out.println(bigNum1.add(bigNum2));
	}

}
