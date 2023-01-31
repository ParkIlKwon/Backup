package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

class input{
	Scanner sc;
	int num;
	void sample() throws Exception{
		sc = new Scanner(System.in);
		System.out.println("값을 입력하여주세요.");
		num = sc.nextInt();
	}
}

class test{
	Scanner sc;
	
	void run(){
		while (true) {
			input i = new input();
			try {
				i.sample();
			} catch (Exception e) {
				System.err.println("에러");
				continue;
			} break;
		}
	}
}



public class 기본이론1 {

	public static void main(String[] args) {
		test t = new test();
		t.run();
		
	}

}
