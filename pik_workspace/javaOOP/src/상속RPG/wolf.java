package 상속RPG;

public class wolf extends Monster{
	
	
	wolf() {
		super(35, 5, "늑대");
	}
	
	@Override
	void skill(Unit u) {
		System.out.println("햙퀴기 스킬을 맞았다.");
		u.hp -= 5;
	}
	
	

}
