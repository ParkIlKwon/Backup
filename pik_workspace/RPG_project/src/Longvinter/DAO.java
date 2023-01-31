package Longvinter;

import java.util.ArrayList;
import java.util.Random;

import PlayerWeapon.*;
import RPG.rpgVO;

public class DAO {

	final int home = 10;
	static final int size = 10;
	static VO [][] map = new VO[size][size];
	ArrayList<Integer>indexNumber = new ArrayList<Integer>();
	private static DAO instance = new DAO(); 
	
	public static DAO dao(){
		return instance;
	}
	
	void init(){
		Player p = new hand();
		for (int i = 0; i < map.length; i++) {
			for (int k = 0; k < map[i].length; k++) {
				map[i][k] = new VO();
			}
		}
		
		map[0][0].object=home;
		
		Random rd = new Random();

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
				map[y][x].enemy = true;
			}else {
				map[y][x].object = 1;
			}
		}
	}
	
	
	
	
}




















































