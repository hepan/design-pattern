package io.github.hepan.designpattern.factory.method;

/**
 * @author hp
 * @describe
 * @createTime 2020/12/11 13:40
 **/
public class BPizzaFactory extends PizzaFactory{

	@Override
	public Pizza create() {
		return new BPizzaStyle();
	}
}
