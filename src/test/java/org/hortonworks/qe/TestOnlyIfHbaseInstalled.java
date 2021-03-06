package org.hortonworks.qe;

import static org.junit.Assume.assumeTrue;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOnlyIfHbaseInstalled {

	// tests will run only if hbase is installed
	@Before
	public void skipTestIf() {
		System.out.println("TestSkipOneTestIfNoHbaseInstalled.skipTestIf()");
		assumeTrue("yes".equals(TestUtils.isHbaseInstalled()));
	}
	
	@Test
	public void test1() {
		System.out.println("TestSkipOneTestIfNoHbaseInstalled.test1");
		fail("Should not have run!");
	}

	@Test
	public void test2() {
		System.out.println("TestSkipOneTestIfNoHbaseInstalled.test2");
		fail("Should not have run!");
	}

}
