package day06;

import java.util.Scanner;

public class F_11학생성적관리3 {
	public static void main(String[] args) {
		// 문제) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		Scanner sc = new Scanner(System.in);
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		int idx=-1;
		System.out.print("학번을 입력하여주시오: ");
		int sel = sc.nextInt();
		
		for(int i=0;i<hakbuns.length;i++) {
			if(sel == hakbuns[i]) {
				idx=i;
				break;
			}
		}
		if(idx==-1) {
		System.out.println("학번을 잘못입력하였습니다.");
		}else {
		System.out.println(scores[idx]);
		}
		
	
	}

}
