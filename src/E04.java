import java.util.Scanner;

//�� ���ڸ� �ݺ��Ͽ� ����ϴ� ����

public class E04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(s.length() <= 100) {
			for(int i = 'a'; i<= 'z'; i++) {
				System.out.println(s.indexOf(i));
			}
		}
	}
}
