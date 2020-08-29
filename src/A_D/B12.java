package A_D;
import java.io.*;

public class B12 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		String s1;
		
		while((s=br.readLine()) != null && (s1=br.readLine()) != null) {
			int a = Integer.parseInt(s);
			int b = Integer.parseInt(s1);
			System.out.println(a+b);
		}
		
	}
}
