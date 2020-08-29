import java.util.Scanner;

// 주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제

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
