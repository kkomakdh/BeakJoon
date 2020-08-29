package A_D;
import java.util.Scanner;

public class B09 {
	
	public static void main(String[] args) {
		
		// 10952번  A+B -5 
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = 0;
		int b = 0;
		
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			sum = a+b;
			System.out.println(sum);
		}
	}
}
