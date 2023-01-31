package 클래스;
//3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
//* 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
//* 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
//* 예) 
//*  0 0 0 0 0 0 0 2 
//*  왼쪽(1) 오른쪽(2) : 2
//*  
//*  2 0 0 0 0 0 0 0 
//*/

import java.util.Arrays;
import java.util.Scanner;

class MovingGame{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 1};
}


public class 클래스03_캐릭터이동 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovingGame mg = new MovingGame();
		int pos = 0;
		
		while (true) {
			System.out.println(Arrays.toString(mg.game));
			for (int i = 0; i < mg.game.length; i++) {
				if (mg.game[i] == 2) {
					pos = i;
					break;
				}
			}
			
			System.out.println("(1)왼쪽 (2)오른쪽");
			int sel = sc.nextInt();
			int tx = pos;
			
			if (sel == 1) {
				tx--;
				
			}else if (sel == 2) {
				tx++;
				
				
			}else {
				System.err.println("잘못된 입력 ㅎ");
			}
			
			if (tx < 0) {
				tx = mg.game.length-1;
			}else if (tx > mg.game.length-1) {
				tx = 0;
			}
			
			if (mg.game[tx] == 1) {
				System.out.println("벽을 격파하려면 3 입력 아니면 아무숫자.");
				sel = sc.nextInt();
				if (sel == 3) {
					System.out.println("격파");
				}else {
					continue;
				}
			}
			
			
			mg.game[pos] = 0;
			pos = tx;
			mg.game[pos] = 2;
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}














