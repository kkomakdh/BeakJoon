package Beak;
import java.util.Scanner;

public class array_2562 {
	public static void main(String[] args) {
		
		int[] arr = new int[9];
		int max = arr[0];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
				
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
				if(max < arr[i]) {
					max = arr[i];
					index = i;
				}
			}
		sc.close();
		System.out.println(max);
		System.out.println(index);
	}
}