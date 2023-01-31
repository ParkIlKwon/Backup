package 이동연습;

import java.util.ArrayList;

class vo{
	int hp = 10;
	String name;
	
	public vo(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "vo [hp=" + hp + ", name=" + name + "]";
	}
	
	
}

class info{
	
	ArrayList<vo>list = new ArrayList<>();
	
	
	void init(){
		vo v = new vo("a씨");
		list.add(v);
		vo x  = list.get(0);
		damage(x);
		System.out.println(list);
	}
	
	void damage(vo v){
		v.hp-=3;
		
	}
	
	
}

class Action{
	
	
	
}


public class 종합연승용 {

	public static void main(String[] args) {
		info ac = new info();
		ac.init();
		
	}

}
