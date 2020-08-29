import java.util.Scanner;

public class F07 {
	
	// 2775번  부녀회장이 될테야
	// a층의 b호에 살려면 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야함
	// k층의 n호에는 몇명이 살고 있는지 
	// 0층부터 존재, 각 층은 1호부터 시작 
	// 0층의 i호에는 i명이 거주
	
	// 3호까지 존재 
	// 0층 -> 1호-1, 2호-2, 3호-3, 	 4호-4	     
	// 1층 -> 1호-1, 2호-3, 3호-6,  4호-10	  2,3,4...   p+=1
	// 2층 -> 1호-1, 2호-4, 3호-10, 4호-20	  3,6,10...  p 
	// 3층 -> 1호-1, 2호-5, 3호-15, 4호-35	  4,10,20...
	// 4층 -> 1호-1, 2호-6, 3호-21, 4호-56	  5,15,35...
	// 5층 -> 1호-1. 2호-7, 3호-28, 4호-84	  6,21,56...
	
	// k=1, n=2 -> p=3
	// k=1, n=3 -> p=6
	// k=1, n=4 -> p=10
	
	// k=2, n=2 -> p=4
	// k=2, n=3 -> p=10
	// k=2, n=4 -> p=20
	
	
	static int apart(int k, int n) {
		int p = 1;

		if(k == 0) {
			for(int i=0; i<n; i++)
				p++;
			return p;
		} else {
			for(int j=0; j<k; j++) {
				for(int h=0; h<n; h++) {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int k = sc.nextInt();  // 층 수 
			int n = sc.nextInt();  // 호 수 
			apart(k, n);
		}
	}
}
