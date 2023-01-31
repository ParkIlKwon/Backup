package 추상클래스;

public class BlugogiPizza extends Pizza{

	
	public BlugogiPizza(int price, String brand) {
		super(price, brand);
		name ="불고기피자";
	}

	@Override
	void topping() {
		System.out.println("불고기 슬라이스 추가");
	}

}
