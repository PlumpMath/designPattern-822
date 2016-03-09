package me.showi.designPattern.abstractFactory;
/**
* @author seamus
* @date 2016年3月9日 上午11:38:45
* @description 邮件发送
*/
public class MailSender implements Sender {

	public void send() {
		System.out.println("send a email !");
	}

}

