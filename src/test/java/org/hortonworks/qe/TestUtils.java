package org.hortonworks.qe;

public class TestUtils {
	
	static final boolean runAll = false;
	static final boolean runOne = false;
	static String isMacOs() {
		return runAll ? "yes" : "no"; 
	}
	
	static String isHbaseInstalled() {
		return runOne ? "yes" : "no";
	}
}
