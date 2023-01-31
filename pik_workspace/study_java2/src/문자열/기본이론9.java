package 문자열;

import java.util.Scanner;

public class 기본이론9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name1 = "박연미";
		String name2 = new String("박연미");
		System.out.println("박연미 입력>> ");
		String input = sc.next(); // 공백 전까지만 입력 버퍼에서 가져옴 
		System.out.println(input);
		System.out.println("박연미 입력>> ");
		String next = sc.next();
		System.out.println(next);
		
		// next() 에서 '박연미 바보' 입력 했을때 "바보"는
		// 아직 입력버퍼에 존재하기 때문에 
		// 그다음 호출한 next() 기존에 존재하는 "바보"가 있기때문에
		// 사용자에게 입력를 기다리지않고 그 다음 값을 바로 저장 
		// 그래서 사진과 같은 출력이 나옴
		
	}

}
