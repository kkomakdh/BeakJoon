import java.util.Scanner;

// �ܾ��� ������ ���ϴ� ����

public class E07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		// trim() -> �� �հ� �� ���� ������ �������ִ� �Լ�
		
		if(s.isEmpty()) {
			System.out.println("�ٽ� �Է�");
		} else {
			System.out.println(s.split("\\s").length);
		}
		// �� �����ϋ� 0�� ����ϰ� �ϴϱ� ������ ������ �ǹ��̴� 
		
		
		// ù��° �ڵ� (���� ���ڿ��� ������ ��츦 ������� �ʾ���...)
		/*for(int i=0; i<s1.length; i++) {
			cnt++;
		}
		System.out.println(cnt);*/
		
		
	}
}
