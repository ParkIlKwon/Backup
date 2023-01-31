package 클래스;

import java.util.Arrays;
import java.util.Scanner;

class Sample13 {
				int[] hakbun = {1001, 1002, 1003, 1004, 1005};
				int[] score  = {  92,   38,   87,  100,   11};
			}

public class 기본예제2 {

	public static void main(String[] args) {

		Sample13 sp = new Sample13();
		
		
		// 문제1) 전교생의 총점과 평균 출력
				// 예 1) 총점(328) 평균(65.60) 
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		int idx = 0;
		Scanner sc = new Scanner(System.in);
		for (int i  : sp.score) {
			sum+=i;
		}
		avg = sum / (double)sp.score.length;
		System.out.printf("총점(%d) 평균(%.1f)\n",sum,avg);
		
		// 문제2) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 2) 3명
	
		
		for (int i  : sp.score) {
			if (i >= 60) {
				cnt++;
			}
		}
		System.out.println(cnt+"명");

		// 문제3) 인덱스를 입력받아 성적 출력
		// 정답3) 인덱스 입력 : 1 성적 : 38점
		
		System.out.print("인덱스 입력 :"); idx = sc.nextInt();
		System.out.println(sp.score[idx]);
		// 문제4) 성적을 입력받아 인덱스 출력
				// 정답5) 성적 입력 : 38 인덱스 : 1
		System.out.print("성적입력");
		idx = sc.nextInt();
		for (int i = 0; i < sp.score.length; i++) {
			if (idx == sp.score[i]) {
				System.out.println("인덱스 : " + i);
			}
			
		}
		// 문제5) 학번을 입력받아 성적 출력
		// 정답5) 학번 입력 : 1003 성적 : 87점
		System.out.print("학번입력 : ");
		idx = sc.nextInt();
		int chk = -1;
		for (int i = 0; i < sp.hakbun.length; i++) {
			if (idx == sp.hakbun[i]) {
				chk = i;
				break;
			}
		}
		if (chk == -1) {
			System.err.println("잘못된학번입력 :(");
		}else {
			System.out.println(sp.score[chk]);
		}
		
				// 문제7) 1등학생의 학번과 성적 출력
				// 정답7) 1004번(100점)
				
		idx = 0;
		int max = sp.score[0];
		for (int i = 0; i < sp.score.length; i++) {
			if (max < sp.score[i]) {
				max = sp.score[i];
				break;
			}
		}
		for (int i = 0; i < sp.score.length; i++) {
			if (max == sp.score[i]) {
				idx = i;
				break;
			}
		}
		System.out.println(sp.hakbun[idx] + "번 (" +sp.score[idx]+"점)");
		
		
		
		
	}

}
