package me.showi.designPattern.abstractFactory;
/**
 * @author seamus
 * @date 2016年3月9日 下午1:58:59
 * @description 邮件发送器工厂,只生产邮件发送器
 */
public class MailSenderFactory implements Factory {

	public Sender produce() {
		return new MailSender();
	}

}
