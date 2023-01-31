package 콜렉션RPG;

public class Player extends Unit{
	skill userSkill;
	
	public Player(String name, int hp,int power,skill sk) {
		super(name, hp, power);
		userSkill = sk;
	}
	
	
}
