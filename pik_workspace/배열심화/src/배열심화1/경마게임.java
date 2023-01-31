package 배열심화1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 경마게임 { 

	public static void main(String[] args) {
		/*
		 [경마 게임]
		 [1] 5 * 20 의 배열이 있다.
		 [2] 각 줄은 말이 달릴 트랙을 의미한다.
		 [3] 매 턴당 랜덤으로 1~4칸의 거리를 이동할수있다.
		 [4] 말이 전부 도착하면 게임은 끝난다. 각말들의 순위를 출력한다. 
		 [5] 단, 말이 동시에 도착하면 등수는 같다. 
		 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int horse[][] = new int[5][20];
		int phase = 1;                                               //등수. 
		int goal[] = new int [5];                                   //골인체크용도
		int size = horse[0].length;				//트랙길이
		int k = 0;
		int cnt = 0;
		int first[] = {4,4,4,4,3};         //ㅋㅋ 1등이 사용할 4칸거리만 이동
		int second[] = {4,4,4,4,2};       //ㅋㅋ 2등이 사용할 막판에 2칸 거리이동해서 일부러 2등시키기
		int idx =0;                                  						//위 배열에서 쓸 인덱스 1씩 증가
		int num2= 0;

		for (int i = 0; i < horse.length; i++) {
			horse[i][0] = 1;
		}

		System.out.println("승부조작할 말을 입력하시오.[0~4]까지 입력");
		int num = sc.nextInt();                                                  //승부조작할 말 

		for (int i = 0; i < 2; i++) {
			num2 = rd.nextInt(5);       
			if(num2 == num) {  
				//1등말 랜덤으로 받아옴(2등으로 고른말과 중복 X 처리)
				i --;
			}

		}

		System.out.println("승부조작 말번호"+num + " " + num2);											

		while (true) {
			boolean chk = false;

			for (int i = 0; i < horse.length; i++) {
				for ( k = 0; k < horse[i].length; k++) {
					if(horse[i][k] == 1 || horse[i][k] == 2) {
						System.out.print("[옷]");
					}else {
						System.out.print("[  ]");
					}
				}
				System.out.println();
			}

			if(cnt >=5) {
				break;
			}


			System.out.println("[1]진행 [2]종료");
			int sel = sc.nextInt();

			if(sel == 2) {
				break;
			}else if (sel == 1) {


				for (int i = 0; i < horse.length; i++) {

					int ran = rd.nextInt(4)+1;
					for (k = 0; k < horse[i].length; k++) {
						if(horse[i][k] == 1 ) {

							horse[i][k] =0;

							if(num == i && idx < 5) {
								horse[i][k+second[idx]] = 1;
							}
							if(num2 == i && idx < 5) {
								horse[i][k+first[idx]] = 1;
							}
							break;
						}

					}
					if ((k+ran >= size-1 && horse[i][size-1] !=2 && idx > 4) || horse[i][size-1] ==1) {
						horse[i][size-1] = 2;
						goal[i] = -1;
						cnt ++;
					}else if(k+ran <= size-1 && num != i && num2 !=i){
						horse[i][k+ran] = 1;
					}

				}
				System.out.println(Arrays.toString(goal));

				for (int j = 0; j < goal.length; j++) {
					if(goal[j] == -1) {
						goal[j] = phase;
						chk = true;
					}

				}

				if (chk== true) {
					phase++;
				}

				idx++;
			}else {
				System.err.println("잘못입력하였습니다.");
			}


		}
		for (int i = 0; i < goal.length; i++) {
			System.out.print(goal[i]+"등");
			if (i == num) {
				System.out.print(">>>사용자가 고른 말");
			}
			System.out.println();
		}


	}

}
