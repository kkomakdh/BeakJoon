package A_D;


// 다시 풀어보기!!!



public class D01_re {
	public static void main(String[] args) {
		
		boolean[] arr = new boolean[10001];
		
		for(int i=1; i<=10000; ++i) {
			int n1 = selfNum(i);
			if(n1 <= 10000)
				arr[n1] = true;
		}
		
		for(int i=1; i<arr.length; ++i) {
			if(!arr[i]) {
				System.out.println(arr[i]);
			}
		}
		
	}
	
	public static int selfNum(int n) {
		
		int n1 = n;
		while(n>0) {
			n1 += n%10;
			n /= 10;
		}
		return n1;
	}
}	


	

	
