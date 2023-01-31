package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class F_06그림맞추기게임sol {

	public static void main(String[] args) {
		/*
		 * # 기억력 게임 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다. 2. 1 1 2 2 3 3 4 4 5 5 이 숫자들을
		 * 1000번 섞는다 (셔플 ) 3. 사용자가 인덱스 번호 2개를 입력해서 그 값을 비교한다 4. 두 인덱스 값이 맞으면 즉, 정답을 맞추면
		 * back에 해당 숫자를 저장해, back에 모든 수가 채워지면 게임은 종료된다. 예) front = [1, 1, 2, 2, 3, 3, 4,
		 * 4, 5, 5] back = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] 입력1 : 0 입력2 : 4
		 * 
		 * front = [1, 3, 2, 5, 1, 4, 3, 2, 4, 5] back = [1, 0, 0, 0, 1, 0, 0, 0, 0, 0]
		 */

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int size = 10; // front.length
		int[] back = new int[size];

		// 셔플
		for (int i = 0; i < 1000; i++) {
			int rdIdx = rd.nextInt(size); // 0
			int temp = front[0];
			front[0] = front[rdIdx];
			front[rdIdx] = temp;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println();

		System.out.println(Arrays.toString(front));

		// 게임 시작

		int cnt = 0;
		while (true) {
          // 게임출력 
			for (int i = 0; i < size; i++) {
				if (back[i] == 0) {
					System.out.print("[]");
				} else {
					System.out.printf("[%d]", back[i]);
				}
			}
            // 종료조건 
			if (cnt == 5) {
				break;
			}

			System.out.println();
			System.out.print("인덱스1 >> ");
			int idx1 = sc.nextInt();
			System.out.print("인덱스2 >> ");
			int idx2 = sc.nextInt();

			if (idx1 < 0 || idx2 < 0 || idx1 >= size || idx2 >= size) {
				System.err.println("인덱스 범위 오류 0 - 9 ");
				continue;
			}

			if (idx1 == idx2) {
				System.err.println("같은 인덱스입니다");
				continue;
			}

			if (back[idx1] != 0 || back[idx2] != 0) {
				System.err.println("이미 뒤집어진 카드가 존재합니다");
				continue;
			}

			for (int i = 0; i < size; i++) {
				if (i == idx1 || i == idx2) {
					System.out.printf("[%d]", front[i]);
				} else if (back[i] == 0) {
					System.out.print("[]");
				} else {
					System.out.printf("[%d]", back[i]);
				}
			}

			System.out.println();

			System.out.println("====");
			if (front[idx1] == front[idx2]) {
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];
				cnt++;
			}

		}
		System.out.println();
		System.out.println("[ 게임 종료 ]");
	}

}
