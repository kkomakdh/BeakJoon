import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {
		
		
		// 가장 깔끔한 코드
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toLowerCase().trim();
		
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(word.contains(arr[i])) {
				word = word.replaceAll(arr[i], " ");
			}
		}
		System.out.println(word.length());
		
		
		// 결과는 잘 나오는데 런타임에러가 발생
		// 실행시간, 메모리 용량 초과가 문제인듯 하다. 
		// 코드를 최대한 줄여보았지만 더 이상 줄이는거 무리다...
		/*Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase().trim();
		int cnt = 0;
		char[] c = new char[s.length()];
		sc.close();
		
		for(int i=0; i<c.length; i++) {
			c[i] = s.charAt(i);			
				if(c[i] == '=' || c[i] == '-') {
					if(c[i-1] == 'z' && c[i-2] == 'd') {
						cnt -= 1;
					} else {
						cnt += 0;
					}
				} else if(c[i] == 'j') {
					if(c[i-1] == 'l' || c[i-1] == 'n') {
						cnt += 0;
					} else {
						cnt++;
					}
				} else {
					cnt++;
				}
			}
		System.out.println(cnt);*/
	}
}
