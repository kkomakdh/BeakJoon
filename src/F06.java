import java.util.Scanner;

public class F06 {
	
	// 10250번   ACM호텔 
	// 직사각형 호텔
	// 엘리베이터를 타고 가는 거리는 신경X
	// 걷는 거리가 같으면 아래층의 방을 더 선호 
	// ex) 102호보다는 301호를 더 선호   102 - 거리 2,  301 - 거리 1
	// 거리가 절대 우선    거리  > 층 수 
	// N번째로 도착한 손님에게 배정될 방 번호 계산 
	// 1 - 101, 2-201 ... 
	
	// n의 배수인 경우! 해결하기
	
	static int hotel(int h, int w, int n) {
		int room;
		
		if(n > h) {
			if(n%h == 0)
				return room = (h*100)+(n/h);
			 else 
				return room = ((n%h)*100)+(n/h)+1;
		} else 
			return room = (n*100)+1;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(hotel(h, w, n));
		}
	}
}
