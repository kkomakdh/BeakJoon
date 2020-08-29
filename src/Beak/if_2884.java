package Beak;
import java.util.Scanner;

public class if_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); // 0 ~ 23
		int M = sc.nextInt(); // 0 ~ 59
		
		 if(M < 45) {
				M = 60 - (45 - M);
				
				if(H-1 < 0) {
					H = 23;
				} else {
					H--;
				}
				System.out.println(H +" "+M);
		} else {
				System.out.println(H +" "+(M-45));
		}
	}
}

