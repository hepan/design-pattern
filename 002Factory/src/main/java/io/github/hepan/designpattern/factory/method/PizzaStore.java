package io.github.hepan.designpattern.factory.method;

/**
 * @author hp
 * @describe
 * @createTime 2020/12/11 11:47
 **/
public class PizzaStore {

	public static void main(String[] args) {
		Pizza pizzaA=new APizzaFactory().create();
		Pizza pizzaB=new BPizzaFactory().create();

		System.out.println(pizzaA.getName());
		System.out.println(pizzaB.getName());
	}
}
