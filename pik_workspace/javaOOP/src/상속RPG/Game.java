package 상속RPG;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {

	Scanner sc = new Scanner(System.in);
	
	final int BOSS = 9;
	final int MONSTER =8;
	final int SIZE = 10;
	
	int map[];
	Player player;
	int px = 1;
	void init() {
		map = new int[SIZE];
		player= new Player(100, 10, "전사");
		map[0] = px;
		map[3] = MONSTER;
		map[5] = MONSTER;
		map[7] = MONSTER;
		map[SIZE-1] = BOSS;
	}
	
	void printGameMap() {
		for(int game : map) {
			if(game == px) {
				System.out.print("[옷]");
			}
			else if(game == 0) {
				System.out.print("[ ]");
			}else if(game == MONSTER) {
				System.out.print("[M]");
			}else {
				System.out.print("[B]");
			}
		}
	}
	
	void movePlayer() {
		player.movePlayer(map.length);
	}
	void mainMenu() {
		System.out.println("[0]종료[1]한칸이동[2]체력회복");
	}
	
	Monster setmonster() {
		Random rd = new Random();
		int ran = rd.nextInt(1)+1;
		if (ran == 1) {
			wolf w = new wolf();
			return w;
		}
		return null;
	}
	
	void battleMonster() {
		
		System.out.println("========= [ 전투 ]==========");
		Unit u = setmonster();
		System.out.println(u.name + "를 만났다.");
		boolean turn = false;
		
		while (true) {
			System.out.println(player.UnitInfo());
			
			if(turn) {
				System.out.println("[플레이어 차례]");
				int sel = getValue("[1]공격 [2]스킬", 1, 2);
				
			}else {
				System.out.println("[몬스터 차례]");
				u.skill(player);
			}
			turn = turn == false ? true : false;
		}
		
		
		
	}
	
	void run() {
		init();
		
		while (true) {
			printGameMap();
			mainMenu();
			int sel = getValue("메뉴를 입력하여주세요.", 0, 2);
			if (sel == 0) {
				break;
			}else if (sel == 1) {
				map[player.position] = 0 ;
				movePlayer();
				if (map[player.position] != 0) {
					battleMonster();
				}
				map[player.position] = 1;
			}else if (sel == 2) {
				System.out.printf("\n현재 남은 회복아이템 수 : %d\n" , player.item);
				sel = getValue("아이템을 사용하시겠습니까? [1]yes [2]no", 1, 2);
				if (sel == 1) {
					player.healing(player);
				}
			}
			
			
			
			

		}
		
		
		
		
		
	}
	
	int getValue(String msg , int n , int m) {
		Scanner sc = new Scanner(System.in);
		int sel = -1;
		try {
			sel = sc.nextInt();
			if (sel < n || sel > m) {
				throw new Exception("범위 초과 에러");
			}
		}catch (InputMismatchException e) {
			System.err.println("문자열은 입력될수 없습니다.");
			sel = -1;
		}catch (Exception e) {
			e.getMessage();
		}
		sc.nextLine();
		return sel;
	}
	
	
	
	
}
