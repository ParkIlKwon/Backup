package day03;

import java.util.Random;
import java.util.Scanner;

public class D_10홀짝게임 {
	public static void main(String[] args) {
		/*
		 * [문제] 1. 1~10 사이의 숫자 중 랜덤으로 한 개의 숫자를 저장한다. 2. 랜덤 숫자가 홀수인지 짝수인지 맞추는 게임이다.
		 */
		int a, b,in;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		a = rd.nextInt(10) + 1;
		System.out.printf("나온수: %d\n", a);
		System.out.print("홀짝입력:");
		in = sc.nextInt();
		sc.close();
		
		a=a%2;
		b=in%2;
		
		boolean win = a == b, err = in <= 0||in>2 ;
		if (err) {
			System.out.println("오류");
			return;	//이중중첩써도 되지만 이게 더 간단한것 같아서 사용했습니다.
		}
		if (win) {
			System.out.println("맞췄다.");
		}
		if (!win) {
			System.out.println("틀렸다.");
		}

	}

}
