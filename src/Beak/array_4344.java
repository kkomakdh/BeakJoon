package Beak;
import java.util.Scanner;

public class array_4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int[] arr = new int[1000];	
		
		for(int i=0; i<C; i++) {
			
			int sum = 0, idx = 0;
			double per = 0;
			
			int N = sc.nextInt();
			
			for(int j=0; j<N; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			for(int j=0; j<N; j++) {
				if((double)sum/N < arr[j]) {
					idx++;
				}
			}
			per = (double)((100.0 / N) * idx);
			System.out.printf("%.3f", per);
			System.out.println("%");
		}
	
	}
}
