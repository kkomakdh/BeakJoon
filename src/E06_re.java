import java.util.Scanner;

// 단어의 개수를 구하는 문제

public class E06_re {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[26];
		int max = 0;
		char answer = '?';
		
		String word = sc.next().toUpperCase();
		
		for(int i=0; i<word.length(); i++) {
			cnt[word.charAt(i)-65]++;
			if(max < cnt[word.charAt(i)-65]) {
				answer = word.charAt(i);
				max = cnt[word.charAt(i)-65];
			}
			else if(max == cnt[word.charAt(i)-65]) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}


