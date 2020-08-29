package A_D;
import java.util.Scanner;

public class B07 {
	public static void main(String[] args) {
		
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 입력의 마지막에는 0 두 개가 들어온다.
		
		int n = 5;
		int a=0, b=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(a==0 && b==0) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.printf("%d", a+b);
		}
	}
}	
