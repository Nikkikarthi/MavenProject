package com.maven.testscript;

import org.junit.Assert;
import org.junit.Test;

public class JunitAssertion {
	
	@Test
	public void test1() {
		String s = "Hello";
		Assert.assertEquals("Hello", s);
		}
	
	@Test
	public void test2() {
		String expected = "Hello";
		String actual = "Hello";
		Assert.assertEquals(expected, actual);
		System.out.println("Test passed");
		}
	
	@Test
	public void test3() {
		String s = "Hello";
		Assert.assertTrue(s.equalsIgnoreCase("llo"));
		//Assert.assertFalse(s.equals("He"));
		}
	
	@Test
	public void test4() {
		String s = "Hello";
		Assert.assertNull(s);
		}
	
	@Test
	public void test5() {
		String s = "Hello";
		Assert.assertNotEquals("Hello", s);
		}
	
	@Test
	public void test6() {
		String s = "Hello";
		Assert.fail();
		}	

}
