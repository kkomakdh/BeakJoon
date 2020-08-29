package A_D;
import java.util.Scanner;

public class B11 {
	public static void main(String[] args) {
		// 10871번  정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n]; 
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < x) {
				System.out.println(arr[i]);
			}
		}

	}
}
