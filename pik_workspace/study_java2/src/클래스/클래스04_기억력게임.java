package 클래스;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

			class MemoryGame{
				String[] front = {"O", "O","□", "□", "■", "■", "☎", "☎", "♠", "♠"};
				String[] back = new String[10];
				
				int cnt ;		// 정답을 맞춘 횟수
			}

	public class 클래스04_기억력게임 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			MemoryGame mg = new MemoryGame();

			for (int i = 0; i < mg.back.length; i++) {
				mg.back[i] = "[]";
			}
			
			for (int i = 0; i < 500; i++) {
				int ran = rd.nextInt(mg.front.length-1)+1;
				String stemp = mg.front[0];
				mg.front[0] = mg.front[ran];
				mg.front[ran]=stemp;
				
			}
			System.out.println(Arrays.toString(mg.front) );
			
			while (true) {
				if (mg.cnt >= mg.front.length/2) {
					break;
				}
				System.out.println(Arrays.toString(mg.back));
				
				System.out.println("왼쪽부터 1 번입니다.");
				System.out.println("[선택]첫번째 인덱스 입력");
				int sel = sc.nextInt()-1;
				System.out.println("[선택]두번째 인덱스 입력");
				int sel2 = sc.nextInt()-1;
				
				if (	sel <0 || sel > mg.front.length-1 ||
						sel2 <0 || sel2 > mg.front.length-1) {
					System.err.println("입력에러 :U");
					continue;
				}
				
				if (mg.back[sel].equals("ok") || mg.back[sel2].equals("ok") 
					) {
					System.err.println("입력에러 :(");
				}
				
				
				if (mg.front[sel].equals(mg.front[sel2])) {
					mg.back[sel] = "ok";
					mg.back[sel2] = "ok";
					mg.cnt++;
				}else {
					System.err.println("틀렸습니다 : (");
				}
				
			}
			
			
			System.out.println("게임종료");
			
			
		

	}

}
