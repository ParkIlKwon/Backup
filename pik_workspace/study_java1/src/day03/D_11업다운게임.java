package day03;

import java.util.Random;
import java.util.Scanner;

public class D_11업다운게임 {

	public static void main(String[] args) {
		/*
		 * [문제] 1. 10-60 사이의 랜덤값을 com에 저장 2. 사용자에게 값 입력 받기 3. 사용자가 입력한 값이 com 보다 크면 down
		 * 사용자가 입력한 값이 com 보다 작으면 up 맞추면 bingo!
		 */
		int com, in,ex;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		
		com = rd.nextInt(51) + 10;
		System.out.println("나온값" + com);
		in = sc.nextInt();
		
		boolean err = in > 60 || in < 10, logic = com > in;
		if (err) {
			System.out.println("잘못입력");
			return;
		}
		if (in == com) {
			System.out.println("bingo!");
		}
		if (logic) {
			System.out.println("UP");
		}
		if (!logic && in != com) {
			System.out.println("DOWN");
		}
	}

}
