package me.showi.designPattern.singleton.lazy;
/**
 * @author seamus
 * @date 2016年3月9日 下午4:26:10
 * @description 懒汉单例模式,版本1,此版本是线程不安全的
 */
public class SingletonV1 {

	private static SingletonV1 single = null;

	/**
	 * 私有化构造方法,禁止外部创建实例
	 */
	private SingletonV1() {

	}
	
	/**
	 * 提供静态的公共方法,返回单例对象
	 * @return
	 */
	public static SingletonV1 getInstance(){
		if(null == single){
			single =  new SingletonV1();
		}
		return single;
	}
	
	public void doSomething(){
		System.out.println("do something");
	}
}
