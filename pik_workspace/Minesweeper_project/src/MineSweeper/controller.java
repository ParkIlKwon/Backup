package MineSweeper;

import java.util.Arrays;

public class controller {
	
	mineDAO DAO;
	Timer time;
	Saveload sl;
	long timelimit;
	
	controller(){
		sl = new Saveload();
	}

	void init() {
		DAO = new mineDAO();
		DAO.init();
		time = new Timer();
		timelimit = time.settime(mineDAO.game.length);
	}
	
	void run() {
		//System.out.println("[1]난이도 선택 [2] 게임 불러오기");
		
		
		
		
	
		while (true) {
			long afterTime = System.currentTimeMillis();
			System.out.println("남은시간: "+ (timelimit - afterTime)/1000);
			for (int i = 0; i < DAO.clone.length; i++) {
				System.out.println(Arrays.toString(DAO.clone[i]));
			} // 테스트용 출력
			
			System.out.println("---------------------------------");
			DAO.printmap();

			if (DAO.log == 1 ) { // 이겼을때
				break;
			}else if (timelimit - afterTime <= 0) {
				System.err.println("시간초과");
				break;
			}
			
			System.out.println("---------------------------------");
			
			System.out.println("[1]깃발모드 [2]찾기모드 [3]리셋 [4]게임 저장 [5]게임 로드");
			int sel = DAO.getNumber(1, 5, "메뉴 " , "메뉴번호");
			
			if (sel == 5) {
				//Saveload sl = new Saveload();
				timelimit  = sl.caltime(mineDAO.game.length);
				DAO.loadGame();
				System.out.println("불러오기완료.");
			}else if (sel == 4) {
				afterTime = System.currentTimeMillis();
				DAO.saveGame(timelimit - afterTime);
			}else if (sel == 3) {
				init();
			}else {
				int y = DAO.getNumber(0, mineDAO.game.length-1, "Y 좌표","Y좌표");
				int x = DAO.getNumber(0, mineDAO.game.length-1, "X 좌표","X좌표");
				DAO.playing2(y, x, sel);
				
				if (DAO.log == 2) { // 지뢰밟음
					break;
				}
			}
		}
	}
}
