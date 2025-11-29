package com.mph.Maven29Junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({NumsUtility.class,StringUtil.class})
public class TestSuit {
	
}
