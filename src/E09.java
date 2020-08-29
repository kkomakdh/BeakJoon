import java.util.Scanner;

public class E09 {
	public static void main(String[] args) {
		
		// ���̾� ���� 
		// ���� 1�� �ɷ��� 2�ʰ� �ʿ�, ū �� �ϼ��� �ð��� �� �ɸ�, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ�
		// ��ȭ��ȣ�� �� ���ڿ� �ش��ϴ� ����  (�� ���ĺ��� �ش��ϴ� ����)
		// UNUCIC -> 868242 (36��)
		// �ܾ �־������� ��ȭ�� �ɱ����� �ʿ��� �ð���?
		
		
		// �ð��� �� ��ȣ +1�� ex) 1->2�� ... 9->10��, 0->11�� 
		// ��ȣ�� �ش��ϴ� ���ĺ� 
		// 2-abc, 3-def, 4-ghi, 5-jkl, 6-mno, 7-pqrs, 8-tuv, 9-wxyz
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase().trim();
		char[] c = new char[word.length()];
		int[] second = new int[word.length()];
		int sum=0;
		
		for(int i=0; i<word.length(); i++) {
			switch(word.charAt(i)) {
			case 'A':
			case 'B':
			case 'C': c[i] = '2'; break;
			case 'D':
			case 'E':
			case 'F': c[i] = '3'; break;
			case 'G':
			case 'H':
			case 'I': c[i] = '4'; break;
			case 'J':
			case 'K':
			case 'L': c[i] = '5'; break;
			case 'M':
			case 'N':
			case 'O': c[i] = '6'; break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S': c[i] = '7'; break;
			case 'T':
			case 'U':
			case 'V': c[i] = '8'; break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z': c[i] = '9'; break;
			default : break;	
			}
		}
		
		for(int i=0; i<c.length; i++) {
			second[i] = c[i]-48;
			if(second[i] == 9) {
				second[i] = 9;
				sum += second[i]+1;
			} else if(second[i] == 8) {
				second[i] = 8;
				sum += second[i]+1;
			} else {
				second[i] +=1;
				sum+=second[i];
			}	
		}
		System.out.println(sum);

		
		

		
	}
}
