package 콜렉션RPG;

public class StageTitle implements stage{

	@Override
	public void init() {
		System.out.println("==== 게임 타이틀 ====");
		
	}

	@Override
	public boolean update() {
		
		System.out.println(" - RPG 3단계 - ");
		System.out.println("[1]로비로 이동 [2]종료");
		
		int sel =  GameManager.instance.sc.nextInt();
		if (sel == 1) {
			GameManager.instance.changestage("Stagelobby");
			return true;
		}else if (sel == 2) {
			GameManager.instance.changestage("");
			return true;
		}
		
		return false;
	}

	

	
	
}
