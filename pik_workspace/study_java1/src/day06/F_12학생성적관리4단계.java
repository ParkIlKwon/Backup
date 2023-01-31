package day06;

public class F_12학생성적관리4단계 {
	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 98, 98, 23 };
		int max = 0, k = 0, cnt = 0;
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)

		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
				k = i;
				cnt++;
			}
		}
			for (int i = 0; i < scores.length; i++) {
				if (max == scores[i]) {
					System.out.println("[학번] " + hakbuns[i]);
				}
			}
			System.out.println("[1등 점수] " + max);
		
	}
}
