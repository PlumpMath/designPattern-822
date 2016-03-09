package me.showi.designPattern.factoryMethod.general;
/**
 * @author seamus
 * @date 2016年3月9日 上午11:45:28
 * @description 普通工厂方法模式
 */
public class SenderFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型");
			return null;
		}
	}
}
