package 문자열;

import java.util.Scanner;

public class 기본이론2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name = "park";
		
		String str = sc.next();
		
		System.out.println(name==str);
		
		System.out.println(name.equals(str));							//스트링값비교
		
		System.out.println(Integer.parseInt(str)+22);		
		
		
		
		
	}

}
