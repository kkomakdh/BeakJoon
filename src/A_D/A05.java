package A_D;
import java.util.Scanner;

public class A05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int res = 0;
		
		for(int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j=0; j<2; j++) {
				res = a+b;
			}
			System.out.println(res);
		}
	}
}
