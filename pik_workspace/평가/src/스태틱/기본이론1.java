package 스태틱;

// stack : 메서드의 메모리방 : 메서드가 호출되면 메모리방 생성 , 호출이 종료하면 메모리방 삭제
// heap : new 키워드를 통해서 메모리방이 생성, 주소값이 참조가 되지 않으면 쓰레기값 인지=> GC 삭제
// static : 프로그램 시작하자 마자 staic이 붙은 키워드들 전부 메모리방에서 생성, 프로그램 종료 삭제 


// 멤버변수 = 전역변수 
// 인스턴스변수(non - static) => new heap 메모리방에서 변수 생성 
// 클래스변수(static ) => 미리 클래스이름.변수이름 등록되어있는 상태 => 객체를 생성하지 않고도 사용할 수 있다

class Player{
	static int cnt;
}

class Monster{
	String name;
	static int cnt;
	Monster(String name){
		this.name = name;
		cnt++;
	}
	
	static void getCount() {
		// 이름은 객체를 생성할때 heap 메모리방에서 생성되기때문에 static 메서드 안에서 접근 불가 
		System.out.println("현재 몬스터 갯수 :" + cnt );
	}
	
	void die() {
		System.out.println(name +" 사망 ");
		cnt--;
	}
}

public class 기본이론1 {

	public static void main(String[] args) {
		
		System.out.println(Monster.cnt);
		
		Monster.getCount();
		
		Monster bat = new Monster("박쥐");
		bat.die();
		System.out.println(bat.name);
		System.out.println(bat.cnt);
		
		Monster wolf = new Monster("늑대");
		Monster zombi = new Monster("좀비");
		
		System.out.println(bat.cnt);
	}

}