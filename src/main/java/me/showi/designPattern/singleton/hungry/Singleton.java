package me.showi.designPattern.singleton.hungry;
/**
 * @author seamus
 * @date 2016年3月9日 下午5:28:10
 * @description 饿汉式单例模式,线程安全的
 */
public class Singleton {

	private static final Singleton INSTANCE = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return INSTANCE;
	}
}
