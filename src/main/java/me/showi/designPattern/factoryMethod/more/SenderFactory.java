package me.showi.designPattern.factoryMethod.more;
/**
 * @author seamus
 * @date 2016年3月9日 上午11:45:28
 * @description 多个工厂方法模式
 */
public class SenderFactory {

	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
