package A_D;
import java.util.Scanner;

public class B01 {
	public static void main(String[] args) {
		
		// 2739�� ������
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			for(int i=1; i<=9; i++) {
				System.out.println(num+ " * " +i+ " = " + num*i);
		}
	}
}
