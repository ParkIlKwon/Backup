package RPG2단계;

public abstract class player extends Unit{
	
	int itemcnt;
	int index = 0;
	int playerLevel = 1;

	public player(int hp, int mp,int power ,String name) {
		super(hp, mp, power ,name);
	}
	
	

}
