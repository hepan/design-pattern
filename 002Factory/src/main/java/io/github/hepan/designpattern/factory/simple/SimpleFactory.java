package io.github.hepan.designpattern.factory.simple;

/**
 * 简单工厂，不是设计模式，而是一种习惯写法。
 * @author hp
 * @describe
 * @createTime 2020/12/11 11:17
 **/
public class SimpleFactory {
	public static Product create(String type) {
		if ("A".equals(type)) {
			return new ProductA();
		} else {
			return new ProductB();
		}
	}
}

abstract class Product {
	abstract void echo();
}


class ProductA extends Product {

	@Override
	void echo() {
		System.out.println("A");
	}
}


class ProductB extends Product {

	@Override
	void echo() {
		System.out.println("B");
	}
}



