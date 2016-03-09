package me.showi.designPattern.singleton.lazy;
/**
 * @author seamus
 * @date 2016年3月9日 下午5:08:54
 * @description 懒汉式单例模式,通过静态内部类类实现线程安全的单例,此方法最优
 */
public class SingletonV3 {

	private int i = 0;

	/**
	 * 私有化构造函数
	 */
	private SingletonV3() {

	}

	public static final SingletonV3 getInstance() {
		return lazyHolder.INSTANCE;
	}

	/**
	 * @author seamus
	 * @date 2016年3月9日 下午5:15:24
	 * @description 静态内部类,
	 */
	private static class lazyHolder {
		private static final SingletonV3 INSTANCE = new SingletonV3();
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
