package A_D;

public class B06 {
	public static void main(String[] args) {
		
		// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
		// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

		int[] arr = {1, 3, 5, 7, 9, 8, 6, 4, 2, 0};
		
		int x = 5;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i]);
			}
		}

	}
}
