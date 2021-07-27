package func_test;


public class test2_4763_1 {

	public static void main(String[] args)  {
		
		boolean arr [] = new boolean [10001];
		
		for(int i=0; i<arr.length; i++) {
			int s = d(i);
			
			if(s<10001) {
				arr[s] = true;
			}
	    }
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length;i++) {
			if(!arr[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.print(sb);
		
 
} 	
	
	static int d(int n) {
		
		int num = n;
		
		while( n != 0) {
			num += n%10;
			n /= 10;
		}
		return num;
    }
}

