package me.showi.designPattern.factoryMethod.more;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
* @author seamus
* @date 2016年3月9日 下午12:17:19
* @description
*/
public class SenderFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		new SenderFactory().produceMail().send();
		new SenderFactory().produceSms().send();
	}

}

