import java.util.Scanner;

//한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제

public class E03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		sc.close();
		int sum=0;
		
		for(int i=0; i<n; i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}


