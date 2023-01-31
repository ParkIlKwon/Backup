package 상속RPG;


abstract class Monster extends Unit{

//	String[] names= {"늑대","박쥐","좀비"};
//	String[] attack= {"할퀴기","음파공격","물어뜯기"};
	int idx;
	
	Monster(int hp, int power, String name) {
		super(hp, power, name);
	}
		
	
	
}
