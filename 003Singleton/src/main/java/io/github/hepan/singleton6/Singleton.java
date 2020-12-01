package io.github.hepan.singleton6;

/**
 * 双重检查方式，推荐使用此方式
 *
 * @author hp
 * @describe
 * @createTime 2020/11/26 18:18
 **/
public class Singleton {
//	private static volatile Singleton instance;

	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}
