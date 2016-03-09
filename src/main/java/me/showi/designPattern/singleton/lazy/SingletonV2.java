package me.showi.designPattern.singleton.lazy;
/**
 * @author seamus
 * @date 2016年3月9日 下午4:59:20
 * @description 懒汉式单例模式,通过同步和双重判断实现线程安全,但会牺牲掉一部分效率
 */
public class SingletonV2 {

	private static SingletonV2 single = null;

	private SingletonV2() {

	}

	public static SingletonV2 getInstance() {
		if (single == null) {
			synchronized (SingletonV2.class) {
				if (single == null) {
					single = new SingletonV2();
				}
			}
		}

		return single;

	}
}
