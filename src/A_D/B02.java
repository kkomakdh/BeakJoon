package A_D;
import java.util.Scanner;

public class B02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = 5;
		
		for(int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.printf("%d\n", a+b);
		}
		
		
	}
}
