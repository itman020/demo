package com.ava.cmp.gdbj001.maven;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HelloMavenTest {

	@Test
	public void testHello() {
		//fail("Not yet implemented");
		HelloMaven hm=new HelloMaven();
		String name=hm.Hello("Tom");
		Assert.assertEquals("Tom",name);
		
	}

}
