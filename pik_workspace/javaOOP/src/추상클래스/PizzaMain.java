package 추상클래스;

import java.util.ArrayList;

public class PizzaMain {
	public static void main(String[] args) {
		
		PizzaService ps = new PizzaService();
		ArrayList<Pizza> orderPizzas = new ArrayList<Pizza>();
		
		orderPizzas.add( new PotatoPizza(12000,"pizza Hut"));
		orderPizzas.add( new BlugogiPizza(11000,"Domino Pizza"));
		orderPizzas.add( new PineApplePizza(22000,"Mr,Pizza"));
		orderPizzas.add( new BlugogiPizza(12000,"Domino Pizza"));
		orderPizzas.add( new BlugogiPizza(12000,"Domino Pizza"));
		
		ps.orderPizza(orderPizzas);
		
	}
}
