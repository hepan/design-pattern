package io.github.hepan.designpattern.factory.method;

/**
 * @author hp
 * @describe
 * @createTime 2020/12/11 11:54
 **/
public class APizzaStyle implements Pizza{

	@Override
	public String getName() {
		return "APizza";
	}

	@Override
	public String[] getToppingThings() {
		return new String[]{"水果","榴莲"};
	}
}
