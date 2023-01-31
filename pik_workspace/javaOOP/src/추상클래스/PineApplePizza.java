package 추상클래스;

public class PineApplePizza extends Pizza{

	public PineApplePizza(int price, String brand) {
		super(price, brand);
		name="파인애플피자";
	}

	@Override
	void topping() {
		System.out.println("파인애플 토핑 추가 ");
	}

}
