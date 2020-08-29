package A_D;
import java.util.Scanner;

public class B05 {
	public static void main(String[] args) {
		
		// 2439번  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 하지만, 오른쪽을 기준으로 정렬한 별을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=1; j--) {
				if(j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
