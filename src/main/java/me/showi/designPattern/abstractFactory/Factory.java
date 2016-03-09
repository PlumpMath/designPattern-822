package me.showi.designPattern.abstractFactory;
/**
 * @author seamus
 * @date 2016年3月9日 下午1:56:58
 * @description 工厂接口,提供返回发送器的方法
 */
public interface Factory {

	public Sender produce();
}
