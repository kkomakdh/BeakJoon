package A_D;
import java.util.Scanner;

public class B09 {
	
	public static void main(String[] args) {
		
		// 10952��  A+B -5 
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = 0;
		int b = 0;
		
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			sum = a+b;
			System.out.println(sum);
		}
	}
}
