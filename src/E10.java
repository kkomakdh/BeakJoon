import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {
		
		
		// ���� ����� �ڵ�
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toLowerCase().trim();
		
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(word.contains(arr[i])) {
				word = word.replaceAll(arr[i], " ");
			}
		}
		System.out.println(word.length());
		
		
		// ����� �� �����µ� ��Ÿ�ӿ����� �߻�
		// ����ð�, �޸� �뷮 �ʰ��� �����ε� �ϴ�. 
		// �ڵ带 �ִ��� �ٿ��������� �� �̻� ���̴°� ������...
		/*Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase().trim();
		int cnt = 0;
		char[] c = new char[s.length()];
		sc.close();
		
		for(int i=0; i<c.length; i++) {
			c[i] = s.charAt(i);			
				if(c[i] == '=' || c[i] == '-') {
					if(c[i-1] == 'z' && c[i-2] == 'd') {
						cnt -= 1;
					} else {
						cnt += 0;
					}
				} else if(c[i] == 'j') {
					if(c[i-1] == 'l' || c[i-1] == 'n') {
						cnt += 0;
					} else {
						cnt++;
					}
				} else {
					cnt++;
				}
			}
		System.out.println(cnt);*/
	}
}
