package day03;

import java.util.Scanner;

public class D_02학점계산기 {
	public static void main(String[] args) {
		/*
		 * [문제] 1. 시험점수를 입력받는다. 2. 시험점수에 해당하는 학점을 출력한다. 3. 아래는 점수표이다. 91 ~ 100점 A학점 90 ~
		 * 81점 B학점 80이하 재시험 4. 단, 만점이거나 A학점과 B학점의 일의 자리가 7점 이상이면, +를 추가한다. A학점과 B학점의 일의
		 * 자리가 3점 이하이면, -를 추가한다.
		 * 
		 * 예) 100 => A+ 87 => B+ 82 => B- 23 => 재시험
		 */
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("시험점수를 입력하여 주시오.");
		score = sc.nextInt();
		sc.close();
		if (score > 100) {
			System.out.println("잘못입력");
			return;
		}
		if (score >= 91) {
			System.out.print(" A ");

		} else if (score >= 81) {
			System.out.print(" B ");

		} else

			System.out.println("재시험.");
		if (score % 10 > 7 || score % 10 == 0) {
			System.out.print(" + ");
		}
		if (score % 10 <= 3 && score % 10 != 0) {
			System.out.print(" - ");
		}

	} // 4분

}
