package day03;

import java.util.Random;
import java.util.Scanner;

import day01.b_00문제;

public class D_16연산자기호 {
	public static void main(String[] args) {
		/*
		 * [문제] 1. 10~20 사이의 랜덤 숫자 2개를 x, y 변수에 각각 저장한다. 예) x = 3, y = 4 2. 1~3 사이의 랜덤
		 * 숫자 1개를 op 변수에 저장한다. 예) op = 3 3. op의 값은 연산자 기호에 해당된다. 1. + 2. - 3. * 예) op의
		 * 값이 3이면 곱하기이다. 4. 화면에 숫자 2개와 답을 출력한다. 단, 기호는 출력하면 안된다. 예) 3 ? 4 = 12 1. + 2. -
		 * 3. * 5. 사용자는 기호를 맞추면 된다. 예) 3 ==> 정답
		 */
		int x = 0, solution=0, total = 0;
		int y = 0;
		int op = 0;
		boolean check = true ;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		x = rd.nextInt(11) + 10;
		y = rd.nextInt(11) + 10;
		op = rd.nextInt(3) + 1;
		if (op == 1) {
			total = x + y;
			
		}
		if (op == 2) {
			total = x - y;
		}
		if (op == 3) {
			total = x * y;
			}
		if(op!=solution)check = false;
		System.out.printf("%d ? %d = %d 답을입력하시오 : 1.+,2.-,3.*\n", x, y, total);
		solution = sc.nextInt();
		System.out.println(check?"정답":"오답");
		}
	}

