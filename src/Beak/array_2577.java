package Beak;

import java.util.Scanner;

public class array_2577 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		char[] x = Integer.toString(a*b*c).toCharArray();
		
		char[] ch = new char[10];

		for(int i = 0; i < x.length; i++) {
			if(x[i] == '1')
				ch[1]++;
			else if(x[i] == '2')
				ch[2]++;
			else if(x[i] == '3')
				ch[3]++;
			else if(x[i] == '4')
				ch[4]++;
			else if(x[i] == '5')
				ch[5]++;
			else if(x[i] == '6')
				ch[6]++;
			else if(x[i] == '7')
				ch[7]++;
			else if(x[i] == '8')
				ch[8]++;
			else if(x[i] == '9')
				ch[9]++;
			else
				ch[0]++;
		}
		
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]+0);
		}
	}
}
