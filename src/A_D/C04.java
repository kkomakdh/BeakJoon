package A_D;
import java.util.Scanner;

/*public class C04 {
	public static void main(String[] args) {
		
		int t = 1;
		int count = 0, combo = 0;
		
		System.out.println(t);
		
		Scanner sc = new Scanner(System.in);
				
		char[] arr = sc.nextLine().toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%c", arr[i]);
			if(arr[i] == 'O') {
				count += 1+combo;
				combo++;
			} else {
				combo = 0;
			}
		}
		System.out.printf("\t%d", count);
		sc.close();
	}
}*/


// 완벽한 정답
public class C04 {
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String[] cases = new String[N];
        
        for (int i = 0; i < N; i++) {
            cases[i] = sc.next();
            System.out.println(cases[i]);
        }
        sc.close();
         
        int count, total;
        for (String OXresult : cases) {
            count = 0;
            total = 0;
            for (int i = 0; i < OXresult.length(); ++i) {
                if (OXresult.charAt(i) == 'O') {
                    total += ++count;
                } else {
                    count = 0;
                }
            }
            System.out.println(total);
        }
    }
}
