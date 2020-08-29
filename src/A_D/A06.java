package A_D;
import java.util.Scanner;

public class A06 {
	public static void main(String[] args) {
		// 5543번 상근날드
		
		Scanner sc = new Scanner(System.in);
		int h_bugger = sc.nextInt();
		int m_bugger = sc.nextInt();
		int l_bugger = sc.nextInt();
		int coke = sc.nextInt();
		int soda = sc.nextInt();
		
		int set1 = h_bugger+coke-50;
		int set2 = m_bugger+coke-50;
		int set3 = l_bugger+coke-50;
		int set4 = h_bugger+soda-50;
		int set5 = m_bugger+soda-50;
		int set6 = l_bugger+soda-50;
		
		int[] arr = {set1, set2, set3, set4, set5, set6};
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}		
		System.out.println(min);
	}
}
