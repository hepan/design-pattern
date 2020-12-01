package io.github.hepan.singleton3;

/**
 * 懒汉式第一种，线程不安全，不推荐使用
 *
 * @author hp
 * @describe
 * @createTime 2020/11/26 18:18
 **/
public class Singleton {
	private static Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
