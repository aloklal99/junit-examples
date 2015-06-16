package org.hortonworks.qe;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assume.assumeThat;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRunOnlyIfMacOs {

	// Ensures that tests will run only if on mac os
	@BeforeClass
	static public void skipClassIf() {
		System.out.println("TestRunOnlyIfMacOs.skipClassIf()");
		assumeThat("yes", is(TestUtils.isMacOs()));
	}
	
	@Test
	public void test1() {
		System.out.println("TestRunOnlyIfMacOs.test1()");
	}

	@Test
	public void test2() {
		System.out.println("TestRunOnlyIfMacOs.test2()");
	}

}
