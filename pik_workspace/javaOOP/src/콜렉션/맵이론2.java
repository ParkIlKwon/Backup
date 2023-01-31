package 콜렉션;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 맵이론2 {

	public static void main(String[] args) {
		
		Map<String , Integer>hmap = new HashMap<>();
		hmap.put("apple", 1000);
		hmap.put("orangee", 10000);
		hmap.put("kiwi", 12000);
		hmap.put("melon", 5000);
		
		System.out.println(hmap.size());;
		System.out.println(hmap.get("apple"));
		System.out.println(hmap.keySet());
		
		for (String key : hmap.keySet()) {
			System.out.println(hmap.get(key));
		}
		
		System.out.println("============================");
		
		Object [] mapkey = hmap.keySet().toArray();
		Arrays.sort(mapkey);
		System.out.println(Arrays.toString(mapkey));

		
	}
}
