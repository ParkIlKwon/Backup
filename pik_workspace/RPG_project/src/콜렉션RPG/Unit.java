package 콜렉션RPG;

public class Unit {

	String name;
	int hp;
	int maxhp;
	int power;
	boolean life = true;
	
	public Unit() {};
	
	public Unit(String name, int hp, int power) {
		super();
		this.name = name;
		this.hp = hp;
		this.maxhp = hp;
		this.power = power;
	}

	@Override
	public String toString() {
		return "Unit [name=" + name + ", hp=" + hp + ", maxhp=" + maxhp
				+ ", power=" + power + "]" + life ;
	}
	
	void attack(Unit u){
		System.out.println(u.name + " 에게 " + power + " 만큼의 데미지를 입혔습니다.");
		u.hp -= power;
		
		if (u.hp <= 0) {
			System.out.println(u.name + " 가 사망했습니다."  );
			u.life = false;
		}
	}
	
	
	
	
	
	
	
}
