package A_D;
import java.util.Scanner;

public class C01 {
	public static void main(String[] args) {
		
		// 10818�� N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];

		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);		
	}
}
