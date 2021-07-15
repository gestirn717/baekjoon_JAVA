package baekjoon_string;

import java.util.Scanner;
public class test_2908_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int cnt = 0; // 인덱스 번
		char save[] = new char [7]; //숫자 담을 배열 
		String s1 =""; // 문자열 담아줄 변수
		
		for(int i=7;i>0;i--) {
			save[cnt] = num.charAt(i-1); // 배열[0], 문자열[6] 저장 / 배열[1], 문자열[5] 저장 
		    cnt ++;
		}
		for(int i=0; i < save.length; i++) {
			s1 += save[i];
		}
		
		String [] arr = s1.split(" ");  //split(" ") 을 통해서 숫자 구분해서 저장
		
		int n1 = Integer.parseInt(arr[0]);
		int n2 = Integer.parseInt(arr[1]);
		
		if(n1 > n2) {
			System.out.print(n1);
		}
		else {
			System.out.print(n2);
		}	
	}
}
