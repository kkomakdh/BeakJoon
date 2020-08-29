package A_D;
import java.util.Scanner;

public class C06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String s = Integer.toString(a*b*c);
		int[] arr = new int[11];
		
		for(int i=0; i<s.length(); i++){
			switch(s.charAt(i)-'0') {
				case 0 : arr[0]++; break;
				case 1 : arr[1]++; break;
				case 2 : arr[2]++; break;
				case 3 : arr[3]++; break;
				case 4 : arr[4]++; break;
				case 5 : arr[5]++; break;
				case 6 : arr[6]++; break;
				case 7 : arr[7]++; break;
				case 8 : arr[8]++; break;
				case 9 : arr[9]++; break;
				default : break;
				}
			}		
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
		}
	}
}
