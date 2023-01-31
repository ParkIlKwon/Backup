package 메서드2;

import java.util.Arrays;
import java.util.Scanner;


class LadderGame {
	
		Scanner sc = new Scanner(System.in);
	
		int[][] ladder = { 
				{ 0, 0, 0, 0, 0 }, 
				{ 1, 1, 0, 1, 1 }, 
				{ 0, 1, 1, 0, 0 }, 
				{ 0, 0, 1, 1, 0 }, 
				{ 0, 1, 1, 0, 0 },
				{ 1, 1, 0, 0, 0 }, 
				{ 0, 0, 0, 1, 1 }, 
				{ 0, 0, 0, 0, 0 } 
		};
	
		int xIdx = 0;
		int yIdx = 0;
		void run() {
	
			showLadder();
	
			xIdx = 0;
			yIdx = 0;
	
			// 사다리 선택하기
			System.out.print("번호를 선택하세요(1~5) : ");
			xIdx = sc.nextInt() - 1;
			
			// 사다리 이동하기
			moveLadder();
			setMenu(); // 메뉴설정하기 : 메뉴는 본인이 먹고싶은걸로 정하세요
	
			//System.out.println("오늘의 점심 메뉴는 " + menu + " 입니다~!!!");
	
		}
		
		void setMenu(){
			String menu[] = {"중식","양식","일식","분식","정식"};
			for (int i = 0; i < xIdx; i++) 
				System.out.print("   ");
				
			System.out.println(""+menu[xIdx]);
		}
		
		
		void showLadder(){
			boolean width = true;
			for (int i = 0; i < ladder.length; i++) {
				for (int k = 0; k < ladder[i].length; k++) {
					
					if (ladder[i][k] == 1 && width) {
							System.out.print(" ├─");
							width = false;
					}else if (ladder[i][k] == 1 && !width) {
						System.out.print("─┤ ");
						width = true;
					}else if (ladder[i][k] == 0){
						System.out.print(" │ ");
					} 
					else {
						try {
							Thread.sleep(500);
						}catch(Exception e) {
							System.out.println(e);
						}
						System.out.print(" * ");
					}
				}
				System.out.println();
			}
		}
		
		void moveLadder(){
				
			for (int i = 0; i < ladder.length; i++) {
				
				if (ladder[i][xIdx] == 1 && xIdx == 0) {
					ladder[i][xIdx] = 2 ;
					xIdx ++;
				}else if (ladder[i][xIdx] == 1 && xIdx == ladder[i].length-1) {
					ladder[i][xIdx] = 2 ;
					xIdx --;
				}else if (ladder[i][xIdx] == 1 && ladder[i][xIdx+1] == 1) {
					ladder[i][xIdx] = 2 ;
					xIdx ++;
				}else if (ladder[i][xIdx] == 1 && ladder[i][xIdx-1] == 1){
					ladder[i][xIdx] = 2 ;
					xIdx --;
				}	
				ladder[i][xIdx] = 2 ;
			}
			showLadder();
		}
		
	}


public class 메서드사다리 {

	public static void main(String[] args) {

		LadderGame lg = new LadderGame();
		lg.run();
		
	}

}
