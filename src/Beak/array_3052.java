package Beak;

import java.util.Scanner;

public class array_3052 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[10];
		int[] x1 = new int[42];
		int idx=0;
		
		for(int i=0; i<10; i++) {
			int n = sc.nextInt();
			
			x[i] = n % 42;
		}
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x1.length; j++) {
				x1[x[i]] = 1;
			}
		}
		for(int i=0; i<x1.length; i++) {
			if(x1[i] == 1)
				idx++;
		}
		System.out.println(idx);
	}
}
