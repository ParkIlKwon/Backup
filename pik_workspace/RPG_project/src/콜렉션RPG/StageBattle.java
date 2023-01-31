package 콜렉션RPG;

import java.util.ArrayList;

public class StageBattle implements stage{

	ArrayList<Unit>plist;
	static ArrayList<Unit>mlist;
	
	@Override
	public void init() {
		mlist = new ArrayList<Unit>();
		plist = new ArrayList<Unit>();
		
		System.out.println("==== 게임 배틀 ====");
		plist = UnitManager.instance.plist;
		int random = GameManager.rd.nextInt(4)+1;
		UnitManager.instance.setMonster();
		for (int i = 0; i < random; i++) {
			int ranidx = GameManager.rd.nextInt(3);
			mlist.add(UnitManager.instance.mlist.get(ranidx));
		}
	}

	void printStatus(){
		for (Unit m : mlist) {
			System.out.println(m);
		}
		System.out.println("=================================");
		
		for (Unit p : plist) {
			System.out.println(p);
		}
	}
	
	@Override
	public boolean update() {
		boolean turn = false;
		while (true) {
			printStatus();
			if (!turn) {
	
				for (int i = 0; i < plist.size(); i++) {
					System.out.println(plist.get(i).name + "의 턴");
					System.out.println("[1]공격 [2]스킬");
					int sel = GameManager.instance.sc.nextInt();
					if (sel == 1) {
						int rand = 0;
						while (true) {
							rand = GameManager.rd.nextInt(mlist.size());
							if (mlist.get(rand).life) {
								break;
							}
						}
						plist.get(i).attack(mlist.get(rand));
					} else if (sel == 2) {
						Player temp = (Player)plist.get(i);
						temp.userSkill.skills();
					} else {
						System.err.println("잘못된 입력.");
						i--;
					}
				}
	
				
			} else {
				for (int i = 0; i < mlist.size(); i++) {
					int rand = 0;
					while (true) {
						rand = GameManager.rd.nextInt(mlist.size());
						if (mlist.get(rand).life) {
							break;
						}
					}
				}
				if (mlist.get(0).life == false) {
					return false;
				}
			}
	
			if (allDead(mlist)) {
				GameManager.instance.changestage("Stagelobby");
				return true;
			}
		}
	}
	
	boolean allDead(ArrayList<Unit> list) {
		int cnt = list.size();
		for (Unit unit : list) {
			if (unit.life == false) {
				cnt --;
			}
		}
		
		System.out.println(cnt);
		return cnt <= 0 ? true : false ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
