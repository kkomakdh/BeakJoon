import java.util.Scanner;

public class F02 {
	// 2839¹ø  ¼³ÅÁ ¹è´Ş
	
	static int sugar(int n) {
		int index = 0;
		
		if(n%5==0) {
			return n/5;
		} else {
			while(n%5!=0) {
				n-=3;
				index++;
				if(n < 0) {
					return -1;
				} else if(n == 0) {
					return index;
				}
			}
		}
		return (n/5)+index;
	}
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(sugar(n));
	}
}
