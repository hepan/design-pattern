package io.github.hepan.singleton1;

/**
 * 饿汉式写法第一种，此种写法初始化时就会创建instance，线程安全，但是比较重会占用内存。
 * @author hp
 * @describe
 * @createTime 2020/11/26 18:18
 **/
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton (){
	}
	public static Singleton getInstance(){
		return instance;
	}
}
