package 콜렉션RPG;

import java.util.ArrayList;

public class Monster extends Unit{
	static Monster instance = new Monster();
	Monster() {};
	ArrayList<Monster>monArr = new ArrayList<Monster>();
	
	void init(){
		monArr.add(new 슬라임());
		monArr.add(new 초록버섯());
		monArr.add(new 나무());
	}
	
	boolean isDead(Unit u) {
		return u.hp <= 0 ? true : false ;
	}
	
}

class 슬라임 extends Monster{

	public 슬라임() {
		name = "슬라임";
		hp = GameManager.rd.nextInt(40)+30;
		maxhp = hp;
		power = GameManager.rd.nextInt(5)+1;
	}
}

class 초록버섯 extends Monster{

	public 초록버섯() {
		name = "초록버섯";
		hp = GameManager.rd.nextInt(50)+40;
		maxhp = hp;
		power = GameManager.rd.nextInt(9)+4;
	}
}

class 나무 extends Monster{

	public 나무() {
		name = "나무";
		hp = GameManager.rd.nextInt(100)+40;
		maxhp = hp;
		power = GameManager.rd.nextInt(20)+5;
	}
	
	
}