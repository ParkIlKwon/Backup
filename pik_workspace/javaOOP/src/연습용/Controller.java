package 연습용;

import java.util.HashMap;
import java.util.Map;


public class Controller {

	static private Controller instance = new Controller();
	
	private Controller(){
		init();
	}
	public static Controller getinstance() {
		return instance;
	}
	
	Map<String , Action> mapList;
	
	void init(){
		mapList = new HashMap<>();
		mapList.put("insert", new Action_insert());
		mapList.put("Print", new Action_print());
	}
	
	public Action getAction(String key) {
		return mapList.get(key);
	}
	
	
}
