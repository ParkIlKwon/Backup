package 콜렉션RPG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GameManager {

	static Random rd = new Random();
	static GameManager instance = new GameManager();
	Scanner sc = new Scanner(System.in);
	Map<String, stage>stageList = new HashMap<String, stage>();
	String currentname = "";
	String nextStagename = "";
	
	void init(){
		stageList.put("title", new StageTitle());
		stageList.put("Stagelobby", new Stagelobby());
		stageList.put("Stagebattle", new StageBattle());
		 
		nextStagename = "title";
		UnitManager.instance.setPlayer();
		System.out.println("랜덤으로 직업 생성완료.");
		update();
	}
	
	void update(){
		while (!changestage(nextStagename)) {
		}
		System.out.println("게임종료");
	}
	
	boolean changestage(String nextstagename) {
		if (nextstagename.equals("")) {
			return false;
		}else if (nextstagename.equals(currentname)) {
			return true;
		}
		currentname = nextstagename;
		stage sg = stageList.get(currentname);
		sg.init();
		
		while (!sg.update()) {
		}
		
		
		return true;
	}
	
	
	
	
}
