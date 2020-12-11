package io.github.hepan.singleton4;

/**
 * 懒汉式第二种，线程安全但效率低
 *
 * @author hp
 * @describe
 * @createTime 2020/11/26 18:18
 **/
public class Singleton {
	private static Singleton instance;

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
