package A_D;
import java.util.Scanner;

public class B07 {
	public static void main(String[] args) {
		
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է��� ���������� 0 �� ���� ���´�.
		
		int n = 5;
		int a=0, b=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(a==0 && b==0) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.printf("%d", a+b);
		}
	}
}	
