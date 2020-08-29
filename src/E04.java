import java.util.Scanner;

//각 문자를 반복하여 출력하는 문제

public class E04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(s.length() <= 100) {
			for(int i = 'a'; i<= 'z'; i++) {
				System.out.println(s.indexOf(i));
			}
		}
	}
}
