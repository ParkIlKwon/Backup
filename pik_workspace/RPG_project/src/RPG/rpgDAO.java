package RPG;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class rpgDAO {

	static rpgVO map[][];
	final int home = 10;
	final int player = 2;
	ArrayList<Integer>indexNumber = new ArrayList<Integer>();
	ArrayList<Integer>expbar = new ArrayList<Integer>();
	int playerLevel = 1;
	Player p;
	void init() {
		p = new Player(100,5,5,"유저");
		for (int i = 0; i < 5; i++) {
				expbar.add(i,1);
		}
		
		Random rd = new Random();
		map = new rpgVO[10][10];
		for (int i = 0; i < map.length; i++) {
			for (int k = 0; k < map[i].length; k++) {
				map[i][k] = new rpgVO();
			}
		}

		map[0][0].status = home;

		for (int i = 0; i < 20; i++) {
			int x = rd.nextInt(100);
			boolean chk = true;
			for (int k = 0; k < indexNumber.size(); k++) {
				if (indexNumber.get(k) == x) {
					i--;
					chk = false;
					break;
				}
			}
			if (chk) {
				indexNumber.add(x);
			}
		}
		
		for (int i = 0; i <indexNumber.size(); i++) {
			int y = indexNumber.get(i)/10;
			int x = indexNumber.get(i)%10;		
			
			if (i < 10) {
				map[y][x].mop = true;
			}else {
				map[y][x].status = 1;
			}
		}
	}

	void printmap() {
		
		for (int i = 0; i < map.length; i++) {
			for (int k = 0; k < map[i].length; k++) {
				if (map[i][k].status == 1) {
					System.out.printf("%-5s","▦");
				}else if (map[i][k].status == home) {
					System.out.printf("%-5s","λ");
				}else if (map[i][k].player == true) {
					System.out.printf("%-5s","옷");
				}else if (map[i][k].mop == true) {
					System.out.printf("%-5s","+");
				}else{
					System.out.printf("%-5s","□");
				}
			}
			System.out.println();
		}
	}
	
	void mainmenu(){
		System.out.println("===========================================");
		System.out.println("현재레벨 : " + playerLevel);
		System.out.println("현재남은 체력 : " + p.HP + " / " + p.maxHP);
		System.out.print("EXP: ");
		for (int i = 0; i < expbar.size(); i++) {
				System.out.printf("%-2s" , "■■");
		}
		System.out.println("\n===========================================");
		System.out.println(" [1]왼쪽 [2]오른쪽 [3]위 [4]아래");
		
		p.playermove(getnumber("메뉴 ", 1, 4) - 1);
	}
	
	static void battle() {
		
		Scanner sc = new Scanner(System.in);
//		Random rd = new Random();
		Unit u = new stoneman();
		boolean turn = false;
		System.out.println("=========== 전 투 ===========");
		System.out.printf("[ %s ] 를 만났다.\n" , u.name);
		
		while (true) {
			if (turn) {
				int sel = getnumber("[전투메뉴] (1)공격 (2)물약 (3)도망",1,3);
				
			}else {
				u.attackto(u);
				
				
			}
			turn = turn == false ? true : false;
		}
		
		
		
	}
	
	
	void run() {
		init();
		while (true) {
			printmap();
			mainmenu();
		}
		
	}
	
	static int getnumber(String msg,int n , int m) {
		
		int sel = -1;
		
		while (sel == -1) {
			sel = Util.getValue(msg, n, m);
		}
		return sel;
	}
	
	
	
	
	
	
	
	
	
	

}
