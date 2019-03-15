package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.SampleHello;

public class TestHello {

	@Test
	public void test() {
		SampleHello sh=new SampleHello();
		int actual=sh.add(4, 5);
		int expected=9;
		assertTrue(actual==expected);
	}

}
