package 배열심화메서드;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


	class map{				//각각의 좌표 하나하나에 뭐가 존재하고 지뢰유무 깃발 그런거 저장해줌.
		boolean mine;
		boolean flag;
		boolean chk;
		int cnt;
	}
	
	class controller{ // 메뉴 출력 키보드 입력 받아옴.
		
		void init(){
			
		}
	}
	
	
	
	
	
	class clone{
		
		int clone[][];
		
		void init(){
			
		}
		
	}

	class mineDAO{
			//          v    v   v   v
		int y [] = {-1,-1,-1,0,0,0,1,1,1};
		int x [] = {-1,0,1,-1,0,1,-1,0,1};
		
		map game[][];
		int clone[][];
		int counter ;
		int unlock ;
		
		//초기화
		void init(){
			int size = earlyset();
			game = new map[size][size];      
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					game[i][k] = new map();
				}
			}
			clone = new int [size][size];
			insertmine(size);
			
			// 
		}
	
		//지뢰 찾기 게임
		void run(){
			
			init();
	
			playing();
			if(unlock != counter)
			printmap();
		}
		
		//지뢰찾기 게임부
		void playing() {
			
			while (true) {
				
				for (int i = 0; i < clone.length; i++) {
					System.out.println(Arrays.toString(clone[i]));
				} // 테스트용 출력
				
				printmap();
				if (unlock == counter) {
					System.out.println("이겻습니다 ");
					return;
				}
				System.out.println("[1]깃발모드 [2]찾기모드");
				int sel = getNumber(0, 3);

				System.out.println("[ Y ] 좌표값을 입력하시오 . ");
				int y = getNumber(-1, game.length);

				System.out.println("[ X ] 좌표값을 입력하시오 . ");
				int x = getNumber(-1, game.length);
				if (!chk(y, x)) {
					err("(이미 선택된 좌표) 좌표값");
					continue;
				} else if (game[y][x].mine && sel != 1) {
					System.out.println("지뢰밟았습니다.");
					for (int i = 0; i < game.length; i++) {
						for (int k = 0; k < game[i].length; k++) {
							if (game[i][k].mine)
								game[i][k].chk = true;
						}
					}
					return;
				}
				if (sel == 2) {
					game[y][x].chk = true;
					clone[y][x] = 2;
					if (wayexpore(y, x)) {
						search();
					}
				} else {
					game[y][x].flag = game[y][x].flag ? false : true;
				}
			}
		}
		
		//맵출력
		void printmap() {
			unlock = 0;
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					
					if (game[i][k].chk && game[i][k].mine) {
						System.out.print(" [ ※ ] ");
					}else	
					if (game[i][k].flag) {
						System.out.print(" [ ¶ ] ");
						if (game[i][k].mine) {
							unlock++;
						}
					}else
					if (!game[i][k].chk ) {
					System.out.print(" [ ■ ] ");
					} 
					else if (game[i][k].cnt != 0) {
						System.out.printf(" [ %d ] ",game[i][k].cnt);
					}
					else if (game[i][k].chk) {
						System.out.print(" [ □ ] ");
					}
				}
				System.out.println();
			}
		}
		
		//지뢰탐색
		void search() {
			while (true) {
				boolean chk = false;
				for (int i = 0; i < clone.length; i++) {
					for (int k = 0; k < clone[i].length; k++) {
						if (clone[i][k] == 2 &&  wayexpore(i, k)) {
							i=0;k=0;
						}
					}
				}
				if (!chk) {
					break;
				}
			}
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					if (clone[i][k] == 2) {
						for (int j = 0; j < x.length; j++) {
							int ty = i + this.y[j];
							int tx = k + this.x[j];
							if (ty < 0 || tx < 0 || ty > game.length-1 || tx > game.length-1) {
								continue;
							}else if(!game[ty][tx].mine ){
								game[ty][tx].chk = true;
							}
						}
					}
				}
			}
		}
		
		//주변탐색 (4방향)
		boolean wayexpore(int y , int x){
			 
			for (int i = 0; i < this.y.length; i++) {
				int ty = y + this.y[i];
				int tx = x + this.x[i];
				if (ty < 0 || tx < 0 || ty > game.length-1 || tx > game.length-1) {
					continue;
				}else if(clone[ty][tx]==0){
					clone[ty][tx] = 2;
					return true;
				}
			}
			return false;
		}
		
		//주변탐색 (8방향)
		int cnt(int y , int x){
			int total = 0;
			for (int i = 0; i < this.y.length; i+=1) {
				int ty = y + this.y[i];
				int tx = x + this.x[i];
				if (ty < 0 || tx < 0 || ty > game.length-1 || tx > game.length-1) {
					continue;
				}else if(game[ty][tx].mine){
					total++;
				}
			}
			return total;
		}
		
		//선택한 위치인지 체크
		boolean chk(int y, int x) {
			if (game[y][x].chk ) {
				return false;
			}
			return true;
		}
		
		//초기세팅입력
		int earlyset() {
			Scanner sc  = new Scanner(System.in);
			int arr[] = {5,8,10};
			System.out.println("난이도를 설정하세요 [1]easy [2]hard [3]extreme ");
			System.out.println("맵         크기:  5 x 5   8 x 8    10 x 10 ");
			return arr[getNumber(0,4)-1]; 
			
		}
		
		//지뢰매설
		void insertmine(int size) {
				Random rd = new Random();
				for (int i = 0; i < size-2; i++) {
					int y = rd.nextInt(size);
					int x = rd.nextInt(size);
					if (game[y][x].mine) {
						i--;
					}else {
						game[y][x].mine = true;
						counter ++;
					}
				}
				//그 지역 근처에 지뢰갯수 세어서 저장시킴
				for (int i = 0; i < game.length; i++) {
					for (int k = 0; k < game[i].length; k++) {
					game[i][k].cnt	 = cnt(i, k);
					}
				}
				//복사 2차원배열 생성 (체크 범위 뚫어줄 용도로 쓸거) 
				for (int i = 0; i < clone.length; i++) {
					for (int k = 0; k < clone[i].length; k++) {
						if (game[i][k].cnt != 0 || game[i][k].mine) {
							clone[i][k] = 1;
						}
					}
				}
			}
		
		//숫자입력(제대로 입력 받을 때까지)
		int getNumber(int n,int m) {
			Scanner sc  = new Scanner(System.in);
			while (true) {
				int num = sc.nextInt();
				if ( num > n && num < m) {
					return num;
				}
				err("번호");
			}
		}
		
		//에러메세지 출력.
		void err(String str) {
			System.err.println(str +"를 잘못입력하셨습니다.");
		}
		
	}



public class 메서드지뢰찾기 {
	public static void main(String[] args) {

		mineDAO mine = new mineDAO();
		mine.run();
		
		
	}

}