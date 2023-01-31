package 상속RPG;

abstract public class Unit {
	int hp;
	int maxHp;
	int power;
	String name;
	
	public Unit(int hp, int power, String name) {
		super();
		this.hp = hp;
		this.maxHp = hp;
		this.power = power;
		this.name = name;
	}
	
	void attack(Unit u) {
		u.hp -= power;
		System.out.printf("[%s]가 [%s]에게 [%d] 데미지 공격" , name , u.name, power);
	}
	
	boolean isDead() {
		if(hp <= 0) {
			System.out.printf("[%s]가 사망했습니다" , name);
			return true;
		}
		return false;
	}

	void healing(Unit u) {
		System.out.println("체력을 회복하였습니다.");
		if (u.hp + 10 > maxHp) {
			u.hp = maxHp;
		}else {
			u.hp += 10;
		}
	}
	
	
	public String UnitInfo() {
		return name + "["+hp+"/"+maxHp+"]";
	}
	
	abstract void skill(Unit u);
	
	
}
