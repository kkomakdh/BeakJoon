import java.util.Scanner;

public class F06 {
	
	// 10250��   ACMȣ�� 
	// ���簢�� ȣ��
	// ���������͸� Ÿ�� ���� �Ÿ��� �Ű�X
	// �ȴ� �Ÿ��� ������ �Ʒ����� ���� �� ��ȣ 
	// ex) 102ȣ���ٴ� 301ȣ�� �� ��ȣ   102 - �Ÿ� 2,  301 - �Ÿ� 1
	// �Ÿ��� ���� �켱    �Ÿ�  > �� �� 
	// N��°�� ������ �մԿ��� ������ �� ��ȣ ��� 
	// 1 - 101, 2-201 ... 
	
	// n�� ����� ���! �ذ��ϱ�
	
	static int hotel(int h, int w, int n) {
		int room;
		
		if(n > h) {
			if(n%h == 0)
				return room = (h*100)+(n/h);
			 else 
				return room = ((n%h)*100)+(n/h)+1;
		} else 
			return room = (n*100)+1;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(hotel(h, w, n));
		}
	}
}
