package me.showi.designPattern.singleton.lazy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.showi.designPattern.singleton.lazy.SingletonV1;

/**
* @author seamus
* @date 2016年3月9日 下午4:35:08
* @description
*/
public class SingletonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testV1() {
		SingletonV1.getInstance().doSomething();
	}
	
	@Test
	public void testV3() {
		SingletonV3 sg = SingletonV3.getInstance();
		System.out.println(sg.getI());
		sg.setI(3);
		System.out.println(sg.getI());
	}

}

