package A_D;

public class C02 {
	public static void main(String[] args) {
		
		// 2562번  9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		
		int[] arr = {3,29,43,65,34,79,72,86,50};
		
		int max = arr[0];
		int index=0;
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		for(int i=0; i<arr.length; i++) {
			if(max == arr[i]) {
				System.out.println(i+1);
			}
		}
	}
}	
