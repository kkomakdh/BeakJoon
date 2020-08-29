import java.util.Scanner;

public class F05_rererererere {
	
	// 2869번   달팽이는 올라가고 싶다
	// 시간 초과 -> 반복문 사용X


	static int snail(int a, int b, int v) {
		
		// 예) 높이 = 5, 올라가는 = 2, 떨어지는 = 1
		// 하루에 올라가는 높이 = 1 
		// 마지막 날은 2 올라감
		// 5-2 = 3
		
		// 1일 - 2올라감 -> 2 
		// 2일 - 1떨어진 후 2올라감 -> 3 
		// 3일 - 1떨어진 후 2올라감 -> 4
		// 4일 - 1떨어진 후 2올라감 -> 5
		
		int m1 = v-a;
		int m2 = a-b;
		
		int d = m1/m2;
		if(m1%m2 == 0)
			d++;
		return d;

	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 낮에 올라가는 높이
		int B = sc.nextInt(); // 밤에 떨어지는 높이
		int V = sc.nextInt(); // 나무의 높이
		
		System.out.println(snail(A, B, V));
	}
}
