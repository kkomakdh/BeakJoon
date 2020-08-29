package A_D;
import java.util.Scanner;

public class A01 {
	public static void main(String[] args) {	
	
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.print(">");
		} else if(A < B) {
			System.out.print("<");
		} else {
			System.out.println("==");
		}
	}
}
