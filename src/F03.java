import java.util.Scanner;

public class F03 {
	
	// 2292��  ���� ���� 
	// �� Ʋ�ȴٰ� �������� ������ �𸣰ڴ�.....
	
	static int Bee(int n) {

		int index = 1;
		int i = 1;
		int lev = 1;
		
		while(true) {
			index++;
			lev += i*6;
			if(n == 1) {
				return 1;
			} else if(n < lev) {
				break;
			}
			i++;
		}
		return index;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(Bee(n));
	}
}
