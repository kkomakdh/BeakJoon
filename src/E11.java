import java.util.Scanner;

public class E11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<T; ++i) {
			String s = sc.next();
			char[] c = new char[s.length()];
			char[] c1 = new char[s.length()];
			for(int j=0; j<s.length(); ++j) {
				c[j] = s.charAt(j);
				c1[j] = c[j];
				if(c[j] == c1[j]) {
					
				}
			}
		}
		System.out.println(cnt);
	}
}
