package 이동연습;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Classes>classlist = new HashMap<>();
		classlist.put("cl_a", new cl_a());
		classlist.put("cl_b", new cl_b());
		Classes cla = classlist.get("cl_a");
		
		while (true) {
			String str = sc.next();
			int sel = sc.nextInt();
			
			
				
				cla.print();
				
		}
		
	}
}
