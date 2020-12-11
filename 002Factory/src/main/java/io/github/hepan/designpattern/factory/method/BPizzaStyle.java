package io.github.hepan.designpattern.factory.method;

/**
 * @author hp
 * @describe
 * @createTime 2020/12/11 11:54
 **/
public class BPizzaStyle implements Pizza{


	@Override
	public String getName() {
		return "BPizza";
	}

	@Override
	public String[] getToppingThings() {
		return new String[]{"香肠","奶酪"};
	}
}
