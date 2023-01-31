package 메서드;

import java.util.Random;
import java.util.Scanner;

class ScoreMng{
	
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	
    
		int sum = 0; 
		int cnt =0;
		double avg = 0.0;
		
		void answerQ1(int scores[]) {
			System.out.println("학생1 2 3 4 5");
			for (int i = 0; i < scores.length; i++) {
				scores[i] = rd.nextInt(100)+1;
				System.out.print(scores[i]+" ");
			}
		}
		void answerQ2(int scores[],int hakbuns[]) {
			System.out.println("\n===================");
			for (int i = 0; i < hakbuns.length; i++) {
				sum += scores[i];
			}avg = sum / (double)hakbuns.length; 
			System.out.printf("총점 :(%d) 평균(%.1f)",sum,avg);
		}
		void answerQ3(int scores[],int hakbuns[]) {
			System.out.println("\n===================");
			for (int i = 0; i < hakbuns.length; i++) {
				if (scores[i] >= 60) {
					cnt++;
				}
			}
			System.out.print(cnt + " 명");
		}
		void answerQ4(int scores[]) {
			System.out.println("\n===================");
			System.out.println("인덱스를 입력받아 성적출력.");
			int idx = sc.nextInt();
			if (idx < 0 || idx > scores.length-1) {
				System.out.println("인덱스를 잘못입력하였습니다.");
			}else {
				System.out.print(scores[idx]);
			}
		}
		void answerQ5(int scores[]) {
			System.out.println("\n===================");
			System.out.println("성적을 입력받아 인덱스출력.");
			int score = sc.nextInt();
			int idx = -1;
			for (int i = 0; i < scores.length; i++) {
				if (score == scores[i]) {
					idx = i ;break;
				}
			}
			System.out.println(idx == -1 ?"잘못입력하였습니다" : idx);
		}
		void answerQ6(int scores[],int hakbuns[]) {
			System.out.println("\n===================");
			System.out.println("학번을 입력받아 인덱스출력.");
			int hak = sc.nextInt();
			int idx = -1;
			for (int i = 0; i < scores.length; i++) {
				if (hakbuns[i] == hak) {
					idx = i ;break;
				}
			} 
			System.out.println(idx == -1 ?"해당학번은 존재하지 않습니다." : scores[idx]);
		}
		void answerQ7(int scores[]) {
			System.out.println("\n===================");
			int max = scores[0];
			for (int i = 0; i < scores.length; i++) {
				if (max < scores[i]) {
					max = scores[i];
				}
			}
			System.out.println("1등점수: "+max);
		}
		
		
		
}



public class 스코어매니저 {

	public static void main(String[] args) {
		//------------ main --------------------------
		ScoreMng mng = new ScoreMng();
		Random rd = new Random();
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = rd.nextInt();
		}
		
		
		mng.answerQ1(scores);
		mng.answerQ2(scores,hakbuns);
		mng.answerQ3(scores,hakbuns);
		mng.answerQ4(scores);
		mng.answerQ5(scores);
		mng.answerQ6(scores,hakbuns);
		mng.answerQ7(scores);
		
				// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
				// 예 1) 87, 11, 92, 14, 47

				// 문제2) 전교생의 총점과 평균 출력
				// 예 2) 총점(251) 평균(50.2)

				// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
				// 예 3) 2명

				// 문제4) 인덱스를 입력받아 성적 출력
				// 정답4) 인덱스 입력 : 1 성적 : 11점

				// 문제5) 성적을 입력받아 인덱스 출력
				// 정답5) 성적 입력 : 11 인덱스 : 1

				// 문제6) 학번을 입력받아 성적 출력
			

				// 문제7) 학번을 입력받아 성적 출력
				// 단, 없는학번 입력 시 예외처리
				// 예 7)
				// 학번 입력 : 1002 성적 : 11점
				// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
				
				// 문제8) 1등학생의 학번과 성적 출력
			

	}

}
