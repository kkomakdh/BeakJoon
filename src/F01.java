import java.util.Scanner;

public class F01 {
	public static void main(String[] args) {
		
		// 1712번
		// 고정 비용 - A만원 
		// 가변 비용 - B만원 
		// 노트북 판매가 - C만원 
		// ex) A-1000만원 , B-70만원인 경우, 
		// 노트북 1대 만드는 비용 - 1070만원, 10대 만드는 비용 - 1700만원  
		// 생산 대수를 늘려가다 보면 총 수입이 총 비용보다 많아지게 된다 
		// 최초로 총수입이 총비용 보다 많아져 이익이 발생하는 지점 - 손익분기점
		// C > A+B가 되는 지점 
		// 최초로 이익이 발생하는 판매량 출력
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt(); 		
		long c = sc.nextInt();
		long result = 0;
		
		if(c-b <= 0) {
			result = -1;
		} else {
			result = (a/(c-b))+1;
		}
		System.out.println(result);
	}
}
