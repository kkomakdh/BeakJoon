import java.util.Scanner;

// �־��� �ܾ�� ���� ���� ���� ���ĺ��� ����ϴ� ����

public class E05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();   	
		String p = "";
		char[] c = new char[100];
		
			for(int k=0; k<t; k++) {
				int r = sc.nextInt();
				String s = sc.next();
					for(int i=0; i<s.length(); i++) {
						c[i] = s.charAt(i);
						for(int j=0; j<r; j++) {
							p = Character.toString(c[i]);	
							System.out.println(p);
				}
			}	
		System.out.println();
		sc.close();
		}
	}
}
