package 추상클래스;

public abstract class Pizza {
	protected int price;
	protected String brand;
	protected String name;
	//Pizza(){};
	public Pizza(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	void makePizza() {
		dough();
		topping();
		bake();
		cut();
		box();
		System.out.println("["+name+" 완성]");
	}
	
	void dough() {
		System.out.println("피자 도우 만들기");
	}
	abstract void topping();
	
	void bake() {
		System.out.println("피자 굽기 ");
	}
	void cut() {
		System.out.println("피자 꺼내서 자르기");
	}
	void box() {
		System.out.println("피자 포장하기 ");
	}
	
}
