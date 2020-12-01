package io.github.hepan.singleton5;

/**
 * 双重检查方式，推荐使用此方式
 *
 * @author hp
 * @describe
 * @createTime 2020/11/26 18:18
 **/
public class Singleton {
	private static volatile Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
