package A_D;

public class B06 {
	public static void main(String[] args) {
		
		// ���� N���� �̷���� ���� A�� ���� X�� �־�����. 
		// �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		int[] arr = {1, 3, 5, 7, 9, 8, 6, 4, 2, 0};
		
		int x = 5;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i]);
			}
		}

	}
}
