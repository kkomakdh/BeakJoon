package Beak;

import java.util.Scanner;

public class while_1110 {

		public static void main(String[] args) {
				
			int n=0, cnt=0;
			
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
					
			int copy = n;

				while(true) {
						if(n < 10) {
							n = ((n % 10) * 10) + ((n / 10)+(n % 10));
						} else {
							n = ((n % 10)*10) + (( n / 10) + (n % 10)) % 10;
						}
						
					cnt++;
					
					if(copy == n) {
						break;
					}
				}
			System.out.println(cnt);
			sc.close();
		}
	}
		
