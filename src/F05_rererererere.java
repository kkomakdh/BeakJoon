import java.util.Scanner;

public class F05_rererererere {
	
	// 2869��   �����̴� �ö󰡰� �ʹ�
	// �ð� �ʰ� -> �ݺ��� ���X


	static int snail(int a, int b, int v) {
		
		// ��) ���� = 5, �ö󰡴� = 2, �������� = 1
		// �Ϸ翡 �ö󰡴� ���� = 1 
		// ������ ���� 2 �ö�
		// 5-2 = 3
		
		// 1�� - 2�ö� -> 2 
		// 2�� - 1������ �� 2�ö� -> 3 
		// 3�� - 1������ �� 2�ö� -> 4
		// 4�� - 1������ �� 2�ö� -> 5
		
		int m1 = v-a;
		int m2 = a-b;
		
		int d = m1/m2;
		if(m1%m2 == 0)
			d++;
		return d;

	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // ���� �ö󰡴� ����
		int B = sc.nextInt(); // �㿡 �������� ����
		int V = sc.nextInt(); // ������ ����
		
		System.out.println(snail(A, B, V));
	}
}
