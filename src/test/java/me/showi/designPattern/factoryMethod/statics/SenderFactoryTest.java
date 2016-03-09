package me.showi.designPattern.factoryMethod.statics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
* @author seamus
* @date 2016年3月9日 下午12:19:20
* @description
*/
public class SenderFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SenderFactory.produceMail().send();
		SenderFactory.produceSms().send();
	}

}

