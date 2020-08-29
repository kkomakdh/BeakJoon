import java.util.Scanner;

// 단어의 개수를 구하는 문제

public class E07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		// trim() -> 맨 앞과 맨 뒤의 공백을 무시해주는 함수
		
		if(s.isEmpty()) {
			System.out.println("다시 입력");
		} else {
			System.out.println(s.split("\\s").length);
		}
		// 왜 공백일떄 0을 출력하게 하니까 정답이 됐을까 의문이다 
		
		
		// 첫번째 코드 (들어온 문자열이 공백인 경우를 고려하지 않았음...)
		/*for(int i=0; i<s1.length; i++) {
			cnt++;
		}
		System.out.println(cnt);*/
		
		
	}
}
