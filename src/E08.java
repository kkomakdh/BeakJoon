import java.util.Scanner;

//숫자를 뒤집어서 비교하는 문제

public class E08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();

		sb.append(a);
		sb1.append(b);
		
		a = sb.reverse().toString();
		b = sb1.reverse().toString();
	
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		if(a1 > b1) {
			System.out.println(a1);
		} else {
			System.out.println(b1);
		}
	}
}		
