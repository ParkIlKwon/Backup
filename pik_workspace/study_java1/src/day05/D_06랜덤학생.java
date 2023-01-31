package day05;
import java.util.Random;

public class D_06랜덤학생 {
	public static void main(String[] args) {
		/*
		 * # 랜덤학생 1. 10회 반복을 한다. 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적) 3. 성적이 60점 이상이면
		 * 합격생이다. --------------------------------------- . 전교생(10명)의 총점과 평균을 출력한다. .
		 * 합격자 수를 출력한다. . 1등 학생의 번호와 성적을 출력한다.
		 */
		int i = 0, num, max = 0, cnt = 0, total = 0, first = 0;
		Random rd = new Random();

		while (i < 10) {
			i++;
			num = rd.nextInt(100) + 1;
			System.out.println(i + ")" + num);
			total += num;
			if (num >= 60) {
				System.out.println("->합격");
				cnt++;
			}
			if (num > max) {
				max = num;
				first = i;
			}

		}
		double avg = total / 10.0;
		System.out.println("==============");
		System.out.printf("[총점] %d [평균] %.2f\n", total, avg);
		System.out.println("합격자수: " + cnt);
		System.out.println("1등학생의 점수: " + max);
		System.out.println("1등학생의 번호: " + first);

	}

}
