package A_D;
import java.util.Scanner;

public class B03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		if(n >= 1 && n <= 10000) {
			for(int i=1; i<=n; i++) {
				cnt += i;
			}
			System.out.println(cnt);
		}
	}
}
