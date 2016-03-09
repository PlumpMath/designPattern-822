package me.showi.designPattern.abstractFactory;
/**
 * @author seamus
 * @date 2016年3月9日 下午2:01:18
 * @description 短信发送器工厂,只生产短信发送器
 */
public class SmsSenderFactory implements Factory {

	public Sender produce() {
		return new SmsSender();
	}

}
