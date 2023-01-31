package 콜렉션RPG;

import java.util.ArrayList;

public class UnitManager {
	
	static UnitManager instance = new UnitManager();
	
	ArrayList<Unit>plist = new ArrayList<Unit>();
	ArrayList<Unit>mlist = new ArrayList<Unit>();
	
	void setMonster(){
		Monster.instance.init();
		for (int i = 0; i < 3; i++) {
			mlist.add(Monster.instance.monArr.get(i));
		}
	}

	void setPlayer(){
		for (int i = 0; i < 3; i++) {
			plist.add(playerClass());
		}
	}
	
	Player playerClass(){
		String nameList[] = {"기사","힐러","궁수","마법사"};
		int index =  GameManager.rd.nextInt(nameList.length);
		int hp[] = {150,120,80,90};
		int power[] = {30,10,35,15};
		skill skills[] = {new skillpowerattack() ,new skillheal() ,new skillArrow() ,
				new meteor()};
		
		Player p = new Player(nameList[index], hp[index], power[index],skills[index]);
		
		return p;
	}
}
