package A_D;

public class C02 {
	public static void main(String[] args) {
		
		// 2562��  9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
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
