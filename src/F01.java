import java.util.Scanner;

public class F01 {
	public static void main(String[] args) {
		
		// 1712��
		// ���� ��� - A���� 
		// ���� ��� - B���� 
		// ��Ʈ�� �ǸŰ� - C���� 
		// ex) A-1000���� , B-70������ ���, 
		// ��Ʈ�� 1�� ����� ��� - 1070����, 10�� ����� ��� - 1700����  
		// ���� ����� �÷����� ���� �� ������ �� ��뺸�� �������� �ȴ� 
		// ���ʷ� �Ѽ����� �Ѻ�� ���� ������ ������ �߻��ϴ� ���� - ���ͺб���
		// C > A+B�� �Ǵ� ���� 
		// ���ʷ� ������ �߻��ϴ� �Ǹŷ� ���
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt(); 		
		long c = sc.nextInt();
		long result = 0;
		
		if(c-b <= 0) {
			result = -1;
		} else {
			result = (a/(c-b))+1;
		}
		System.out.println(result);
	}
}
