package me.showi.designPattern.factoryMethod.general;

import org.junit.Before;
import org.junit.Test;

/**
 * @author seamus
 * @date 2016年3月9日 上午11:53:18
 * @description
 */
public class SenderFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SenderFactory sf = new SenderFactory();
		sf.produce("sms").send();
		sf.produce("mail").send();
	}

}
