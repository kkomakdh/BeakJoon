package A_D;
import java.util.Scanner;

public class B08 {
	public static void main(String[] args) {
		
		// 1110�� ���ϱ� ����Ŭ
		/* 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
		���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, 
		�� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� 
		���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.
		26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. 
		���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
		���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
		N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
				
		int n=0, n1=0, n2=0, n3=0, n4=0, cnt=0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int res = n;
				
			while(res != n4) {
				n1 = n/10;
				System.out.println(n1);
				n2 = n%10;
				System.out.println(n2);
				n3 = n1+n2;
				System.out.println(n3);
					if(n3 < 10) {
						n4 = (n2*10)+n3;
					} else {
						n4 = (n2*10)+(n3%10);
					}
					System.out.println(n4);
				n = n4;
				cnt++;
			}
		System.out.println("����Ŭ Ƚ��  " + cnt);
		sc.close();
	}
}
	
