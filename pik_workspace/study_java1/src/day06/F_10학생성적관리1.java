package day06;

import java.util.Arrays;
import java.util.Random;

public class F_10학생성적관리1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0, cnt = 0;
		double avg = 0;
		Random rd = new Random();
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47

		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
			System.out.println(arr[i]);
						if (arr[i] >= 60) {
				System.out.println(">>합격");
				cnt++;
			}
		}
		//avg = sum / (float) arr.length;
		sum=Arrays.stream(arr).sum();
		avg=Arrays.stream(arr).average().orElse(0);
		System.out.printf("[총점] %d\t[평균]%.2f\t[합격생수]%d", sum, avg, cnt);
	}

}
