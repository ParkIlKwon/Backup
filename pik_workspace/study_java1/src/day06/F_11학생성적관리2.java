package day06;

import java.util.Scanner;

public class F_11학생성적관리2 {
	public static void main(String[] args) {
		// 인덱스 0 1 2 3 4
		Scanner sc = new Scanner(System.in);
		int[] arr = { 87, 11, 45, 98, 23 };
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		int idx, num, score, hak;
		
		while(true) {
		System.out.print("인덱스 입력: ");
		idx = sc.nextInt();
		if(idx>0&&idx<5) {break;}
		}
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1 성적 : 11점

		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1
		System.out.println(arr[idx] + "점");

		System.out.print("성적 입력: ");
		score = sc.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			num = scores[i];
			if (num == score) {
				System.out.println("인덱스: " + i);
			}
		}

		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점

		System.out.print("학번 입력: ");
		hak = sc.nextInt();

		for (int i = 0; i < hakbuns.length; i++) {
			if (hak == hakbuns[i]) {
				hak = i;
				
			}
		}
		System.out.println(scores[hak] + "점");

	}

}
