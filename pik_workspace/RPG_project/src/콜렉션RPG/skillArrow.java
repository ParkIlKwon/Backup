package 콜렉션RPG;

import java.util.ArrayList;

public class skillArrow implements skill{

	String msg = "연속 공격";

	@Override
	public void skills() {
		
		System.out.println(msg);
		ArrayList<Unit>montemp = StageBattle.mlist;
		System.out.println(montemp.get(0).hp);
		for (int i = 0; i < montemp.size() + 2; i++) {
			int idx = GameManager.rd.nextInt(montemp.size());
			if (montemp.get(idx).life == true) {
				System.out.println("공격.");
				montemp.get(idx).hp-=10;
				if (montemp.get(idx).hp <= 0) {
					System.out.println(montemp.get(idx).name + "를 물리쳤다." );
					montemp.get(idx).life = false;
				}
			}else {
				i--;
			}
			}
	}
	
}
