package RPG;

public class Player extends Unit implements sand{
	
	public Player(int HP, int power, int shield, String name) {
		super(HP, power, shield,name);
	}
	
	@Override
	void skill(Unit u) {
		
	}

	@Override
	public void effect(Unit u) {
		
	}
	
	
	void playermove(int selection){
		int idy[] = {0,0,-1,1};
		int idx[] = {-1,1,0,0};
		int ty = 0 , tx = 0 ;
		
		for (int i = 0; i < rpgDAO.map.length; i++) {
			for (int k = 0; k < rpgDAO.map[i].length; k++) {
				if (rpgDAO.map[i][k].player) {
					ty = i ;
					tx = k;
				}
			}
		}
		
		ty += idy[selection];
		tx += idx[selection];
		
		if (checkindex(ty, tx)) {
			rpgDAO.map[ty][tx].player = true;
			if (rpgDAO.map[ty][tx].mop) {
				rpgDAO.battle();
			}
			ty -= idy[selection];
			tx -= idx[selection];
			rpgDAO.map[ty][tx].player = false;
			
		}
		
		
		
	}
	
	boolean checkindex(int y , int x){
		if (y < 0 || x < 0 || y > rpgDAO.map.length-1 || x > rpgDAO.map.length-1 
				|| rpgDAO.map[y][x].status == 1) {
			System.err.println("그 위치로는 이동하실 수 없습니다.");
			return false;
		}
		return true;
	}
}
