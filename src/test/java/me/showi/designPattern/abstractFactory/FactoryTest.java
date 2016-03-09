package me.showi.designPattern.abstractFactory;

import org.junit.Before;
import org.junit.Test;

/**
 * @author seamus
 * @date 2016年3月9日 下午2:11:54
 * @description
 */
public class FactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		new MailSenderFactory().produce().send();
		new SmsSenderFactory().produce().send();
	}

}
