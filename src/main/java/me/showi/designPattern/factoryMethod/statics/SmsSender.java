package me.showi.designPattern.factoryMethod.statics;
/**
* @author seamus
* @date 2016年3月9日 上午11:41:21
* @description 短信发送
*/
public class SmsSender implements Sender {

	public void send() {
		System.out.println("send a sms !");
	}

}

