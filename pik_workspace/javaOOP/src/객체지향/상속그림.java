package 객체지향;

class Super {
	int x;

	void test() {
		System.out.println("부모 메서드 호출!");
	}
}

class Sub extends Super {
	int y;

	void test() {
		System.out.println("자식 메서드 호출!");
	}

	void subMethod(int x, int y) {
		x = 3;
		super.x = x;
		this.y = y;
	}

	void play() {
		this.test();
		super.test();

	}
}

public class 상속그림 {

	public static void main(String[] args) {

		Sub s = new Sub();
		s.subMethod(10, 20);

		System.out.println("x = " + s.x);
		System.out.println("y = " + s.y);
		
		s.play();

	}

}