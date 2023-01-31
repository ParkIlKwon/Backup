package RPG;

public class stoneman extends Unit implements sand{

	public stoneman() {
		super(50, 10, 1,"스톤맨");
	}

	@Override
	public void effect(Unit u) {
		if (u instanceof sand) {
			return;
		}else if (u instanceof water) {
			u.HP += 2;
		}else if (u instanceof fire) {
			u.HP -= 2;
		}
	}

	@Override
	void skill(Unit u) {
		System.out.println("돌맹이공격");
		u.HP -= 5;
	}

	
	
}
