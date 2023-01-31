package 추상클래스;

import java.util.ArrayList;

public class PizzaService {

	void orderPizza(ArrayList<Pizza> pizzaOrderList) {
		for(Pizza p : pizzaOrderList) {
			p.makePizza();
			System.out.println("============");
		}
	}
	
}
