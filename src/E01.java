import java.util.Scanner;

// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

public class E01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextLine().charAt(0);
		// 자바는 스캐너로 문자를 받아올 수 없음 nextLine()으로 문자열을 받은 뒤 
		// charAt()을 이용해 문자로 변환해 주어야 함
		System.out.println(n);
		// 자바에서는 char 타입의 값을 int 타입으로 변환하면 아스키 코드로 변환된다
	
	}
}
