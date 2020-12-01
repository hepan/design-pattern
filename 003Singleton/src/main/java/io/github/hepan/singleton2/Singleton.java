package io.github.hepan.singleton2;

/**
 * 饿汉式写法第二种，此种写法与第一种相似
 *
 * @author hp
 * @describe
 * @createTime 2020/11/26 18:18
 **/
public class Singleton {
	private static Singleton instance;

	static {
		instance = new Singleton();
	}

	private Singleton() {
	}

	public Singleton getInstance() {
		return instance;
	}
}
