package PlayerWeapon;

import Longvinter.Player;
import Longvinter.Unit;

public class Axe extends Player{

	public Axe() {
		super();
		attackDamage = 5;
		distance = 1;
	}
	
	@Override
	public void skill() {
		
	}

	public void attackAction(Unit u) {
		stamina -=10;
		Unit.attack(u, attackDamage);
	}

	





	

	
}
