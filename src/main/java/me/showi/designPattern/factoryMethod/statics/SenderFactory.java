package me.showi.designPattern.factoryMethod.statics;
/**
 * @author seamus
 * @date 2016年3月9日 上午11:45:28
 * @description 静态工厂方法模式
 */
public class SenderFactory {

	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
