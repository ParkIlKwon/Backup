package Level2;

import java.util.Random;

public class 반복문 {

	public static void main(String[] args) {
		/*
		 * [문제] 아래조건을 충족하는 식을 작석하시오. [조건1] 10~1까지 거꾸로 반복문을 실행한다. [조건2] 3의 배수일때는 "안녕" 을
		 * 출력한다. [조건3] 3의 배수가 아닐때는 숫자를 출력한다. [정답] 10 안녕 8 7 안녕 5 4 안녕 2 1
		 */
		for (int i = 10; i > 0; i--) {

			if (i % 3 == 0) {
				System.out.print(" 안녕 ");
			} else {
				System.out.print(i + "  ");
			}

		}
		// 3분

		/*
		 * [문제] [1] 숫자 50 ~ 150 사이의 범위에서 7의배수를 순차적으로 검색한다. [2] 반복문이 종료후 3번째 7의 배수를 출력한다.
		 * [정답] 3번째 7의 배수 : 70
		 */
		System.out.println();
		System.out.println("===문제 2===");
		int cnt = 0;

		for (int i = 50; i < 150; i++) {
			if (i % 7 == 0) {
				cnt++;
			}
			if (cnt == 3) {
				cnt = i;
				break;
			}

		}
		System.out.println(cnt);

		// 4분

		System.out.println();
		System.out.println("===문제 3===");

		/*
		 * [문제] 1~ 999 의 범위안의 숫자중에서 8의 배수를 큰수부터 차례대로 4개 출력하시오. [정답] 992 984 976 968
		 */
		cnt = 0;
		for (int i = 999; i > 0; i--) {
			if (i % 8 == 0) {
				System.out.println(i + " ");
				cnt++;
			}
			if (cnt == 4) {
				break;
			}

		}
		// 2분

		System.out.println();
		System.out.println("===문제 4===");

		/*
		 * [문제] 9의 배수중 100보다 큰수중에서 일의 자리가 6인 다섯번째 9의 배수 출력하시오. [정답] 486
		 */
		cnt = 0;
		for (int i = 101;; i++) {
			if (i % 9 == 0) {
				if (i % 10 == 6) {
					cnt++;
				}
			}
			if (cnt == 5) {
				System.out.println(i);
				break;
			}
		}
		// 5분

		System.out.println();
		System.out.println("===문제 5===");

		/*
		 * [문제] [1] 48의 약수중 일의자리가 2~6사이인 수를 출력하시오. [2] 위 조건의 약수의 개수도 출력하시오. [정답] 2 3 4 6
		 * 12 16 24 악수의 개수 : 7개
		 */

		cnt = 0;

		for (int i = 1; i <= 48; i++) {

			if (48 % i == 0) {
				if (i % 10 >= 2 && i % 10 <= 6) {
					System.out.print(i + " ");
					cnt++;
				}
			}

		}

		System.out.println("약수의 개수: " + cnt);
		// 5분

		System.out.println();
		System.out.println("===문제 6===");

		/*
		 * [문제] [1] 48의 약수중 일의자리가 3의배수인 수를 전부 출력하시오. [2] 위 조건의 약수의 합도 출력하시오. [정답] 3 6 16
		 * 악수의 합 : 25
		 */
		int sum = 0;
		for (int i = 1; i <= 48; i++) {

			if (48 % i == 0) {
				if (i % 10 % 3 == 0) {
					System.out.print(i + " ");
					sum += i;
				}
			}

		}
		System.out.println("약수의 합: " + sum);

		// 2분

		System.out.println();
		System.out.println("===문제 7===");

		/*
		 * [문제] 128의 5번째 약수에서 2번째 약수를 뺀값을 구하시오. [정답] 5번째 약수에서 2번째 약수를 뺀값 : 14
		 */

		cnt = 0;
		int a = 0, b = 0;
		for (int i = 1; i <= 128; i++) {
			if (128 % i == 0) {
				cnt++;
			}
			if (cnt == 2 && a == 0) {
				a = i;
			}
			if (cnt == 5) {
				b = i;
				break;
			}

		}
		System.out.print("5번째 약수에서 2번째 약수를 뺀값: ");
		System.out.println(b - a);

		System.out.println();
		System.out.println("===문제 8===");

		// 5분

		/*
		 * [문제] 10~100사이의 랜덤숫자를 저장하고, 그숫자의 약수의개수를 구한다. 약수의개수가 짝수이면 "짝수"를 출력하고, 약수의개수가
		 * 홀수이면 숫자를 전부 출력한다. [예시] 49 : 1, 7, 49 : 약수의개수가 홀수이므로 숫자를 전부 출력한다. 13 : 13, 1 :
		 * 13의 경우는 약수의개수가 짝수이므로 숫자를 출력하지말고 "짝수"를 출력한다. [힌트] 한번에 해결할수 없다.
		 */

		Random rd = new Random();
		// int num = rd.nextInt(91)+10;
		int num = 49;
		cnt = 0;
		System.out.print(num + ":  ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}

		}

		if (cnt % 2 == 0) {
			System.out.println("짝수");
		} else {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i + " ");
				}

			}
		}
		System.out.println();
		System.out.println("===문제 9===");

		// 8분

		/*
		 * [문제] 철수네 반 학생 25명이 체험학습을 하러 가기위해 버스를 탔는데 , 총요금이 19400원이였다. 교통카드를 사용하면 720원이고
		 * , 현금으로 지불하면 1000원일때, 교통카드를 사용한 학생수와 현금을 사용한 학생수를 출력하시오. [정답] 교통카드 학생수 : 20 현금
		 * 학생수 : 5
		 */
		int total = 19400;
		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 0; i < 25; i++) {
			if (total % 720 == 0) {
				total -= 720;
				cnt1++;
			} else {
				total -= 1000;
				cnt2++;
			}

		}

		System.out.println("교통카드 : " + cnt1 + " 현금: " + cnt2);

		// 15분동안 해맴;;

		System.out.println();
		System.out.println("===문제 10===");

		/*
		 * [문제] 철수는 13살 철수의 아버지는 45살이다. 몇년후에 철수의 아버지는 철수나이의 3배가되는지 구하시오. [답] 기간 : 3
		 */
		double 철수 = 13.0;
		int 아버지 = 45;
		cnt = 0;

		for (int i = 0; cnt <= 3; i++) {
			철수++;
			아버지++;
			cnt++;

			if (아버지 / 철수 == 3.0) {

				break;
			}

		}

		System.out.println("기간 : " + cnt);

		// 6분
		System.out.println();
		System.out.println("===문제 11===");

		/*
		 * [문제] 구호물품으로 소독약 120개와 붕대 72개를 환자 한명당 똑같은 양의 소독약과 붕대를 나눠줄려고한다. 최대한많은 환자에게 나눠줄때
		 * 몇명인지 구하시오. [정답] 24
		 */
		int 소독약 = 120;
		int 붕대 = 72;
		int max = 1;
		for (int i = 1; i < 붕대; i++) {
			if (소독약 % i == 0 && 붕대 % i == 0) {
				if (max < i) {
					max = i;
				}
			}

		}

		System.out.println("정답: " + max);

		// 8분

		System.out.println();
		System.out.println("===문제 12===");

		/*
		 * 반복문을 사용해서 아래와 같이 출력해보세요. [예시] 
		 * 0 12 
		 * 1  2 3
		 *   2 3 4
		 *    3 4 5
		 *    4 5 6
		 */

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < 3; k++) {
				System.out.print(k + i);

			}
	
			System.out.println();

		}

		// 4분

		/*
		 * 반복문을 사용해서 아래와 같이 출력해보세요. [예시] 0 0 1 
		 * 																							1 2 3 
		 * 																							2 4 5
		 * 																							 3 6 7
		 * 																							 4 8 9
		 */
		int idx = 0;
		System.out.println("======");
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
			for (int k = 0; k < 2; k++) {
				System.out.print(k + idx);

			}
			idx += 2;
			System.out.println();

		}
		// 4분

		/*
		 * 반복문을 사용해서 아래와 같이 출력해보세요. [예시] 0 0 1 1 2 3 3 6 4 10 5 15 6 21 7 28 8 36 9 45
		 */
		System.out.println("=============");
		idx = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
			idx += i;
			for (int k = 0; k < 1; k++) {

				System.out.print(idx);
			}

			System.out.println();
		}
		
		// 3분
		System.out.println();
		System.out.println("===문제 13===");

		/*
		 * 랜덤숫자 (1~9) 사이의 숫자 8개를 출력한다. 단 아래의 조건을 참고한다.
		 * 
		 * 예를 들어 숫자가 4 5 6 1 2 3 4 5 이라고 한다면 아래와 같이 출력한다.
		 * 
		 * [출력] 4 5 6 5 6 1 6 1 2 1 2 3 2 3 4 3 4 5
		 * 
		 */
		num = 0;
		for (int i = 0; i < 6; i++) {
			System.out.print(num = rd.nextInt(9) + 1);
			for (int k = 0; k < 2; k++) {
				System.out.print(num = rd.nextInt(9) + 1);

			}
			System.out.println();

		}

		// 잘 모르겠습니다.

		/*
		 * 반복문을 사용해서 아래와 같이 출력해보세요. [예시] 0 30 1 29 2 27 3 24 4 20 5 15 6 9 7 2 8 -6 9
		 * -15
		 */

		System.out.println("=============");
		idx = 30;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
			idx -= i;
			for (int k = 0; k < 1; k++) {

				System.out.print(idx);
			}

			System.out.println();
		}

		// 2분

	}

}
