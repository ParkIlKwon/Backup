package RPG;

abstract class Unit {

	int maxHP;
	int HP;
	int power;
	int shield;
	String name;
	
	
	public Unit(int hP, int power, int shield, String name) {
		super();
		this.maxHP = hP;
		HP = hP;
		this.power = power;
		this.shield = shield;
		this.name = name;
	}

	boolean isdead() {
		if (HP <= 0) {
			return true;
		}
		return false;
	}
	
	void attackto(Unit u){
	}
	
	abstract void skill(Unit u);
		
	
		
	
	
	
	
	
}
