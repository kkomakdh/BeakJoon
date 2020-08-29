package A_D;
import java.util.Scanner;

public class C05 {
	public static void main(String[] args) {			
		
			Scanner sc = new Scanner(System.in);
			int C = sc.nextInt();
			int N, sum, index;
			double avg, per;
			int[] arr = new int[1000];
			
			for(int i=0; i<C; i++) {
				sum = 0;
				index = 0;
				avg = 0;
				per = 0;
				
				N = sc.nextInt();     

				if(N >= 1 && N <= 1000) {
					for(int j=0; j<N; j++) { 
						arr[j] = sc.nextInt();
						
					if(arr[j]>=0 && arr[j] <= 100) {
						sum += arr[j];   
						}
					avg = (double)sum/N;
					}
				}
					for(int k=0; k<arr.length; k++) {
						if(sum/N < arr[k]) {   
							index++;	     
						}
					}
			per = (double)((100.0/N)*index);
			System.out.println((Math.round(per*1000)/1000.0)+"%");
		}
			sc.close();
	}
}
