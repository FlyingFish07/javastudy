package com.zyh.javastudy;

import org.junit.Assert;
import org.junit.Test;

public class Test2 {
	@Test
	public void test1(){
		System.out.println("hello world.");
		Assert.assertEquals("123", "123");
	}
}
