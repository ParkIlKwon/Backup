package 배열심화1;

import java.util.Random;
import java.util.Scanner;

public class 경마문제2 {

	public static void main(String[] args) {
	

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int horse[][] = new int[5][20];
		int phase = 1;                                               //등수. 
		int goal[] = new int [5];                                   //골인체크용도
		int size = horse[0].length;				//트랙길이
		int k = 0;
		int cnt = 0;
		
		for (int i = 0; i < horse.length; i++) {
			horse[i][0] = 1;
		}
		
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
						if(horse[i][k] == 1) {
	
							horse[i][k] =0;
							break;
						}
						
					}
					if (k+ran >= size-1 && horse[i][size-1] !=2) {
						horse[i][size-1] = 2;
						goal[i] = -1;
						cnt ++;
					}else if(k+ran <= size-1){
						horse[i][k+ran] = 1;
					}
					
				}
			
				for (int j = 0; j < goal.length; j++) {
					if(goal[j] == -1) {
						goal[j] = phase;
						chk = true;
					}
					
				}
				
				if (chk== true) {
					phase++;
				}
				
				
			}else {
				System.err.println("잘못입력하였습니다.");
			}
			
			
		}
		for (int i = 0; i < goal.length; i++) {
			System.out.println(goal[i]+"등");
		}
			}
	


}
