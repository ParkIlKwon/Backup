package 콜렉션RPG;

public class Stagelobby implements stage{

	@Override
	public void init() {
		System.out.println("==== 게임 로비 ====");
	}

	@Override
	public boolean update() {
		System.out.println("[1]던전으로 이동 [2]타이틀로");
		int sel =  GameManager.instance.sc.nextInt();
		
		if (sel == 1) {
			GameManager.instance.changestage("Stagebattle");
			return true;
		}else if (sel == 2) {
			GameManager.instance.changestage("title");
			return true;
		}
		
		return false;
	}

	
	
}
