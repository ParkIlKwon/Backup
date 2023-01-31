package 추상클래스;

public class PotatoPizza extends Pizza{

	public PotatoPizza(int price, String brand) {
		super(price, brand);
		name="포테이토피자";
	}

	@Override
	void topping() {
		System.out.println("감자 토핑 추가");
	}

}
