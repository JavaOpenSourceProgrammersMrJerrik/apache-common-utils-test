package com.tnz.test.lang;

import org.apache.commons.lang3.ClassPathUtils;

public class ClassPathUtilsTest {

	public static void main(String[] args) {
		System.out.println(ClassPathUtils.toFullyQualifiedName(ClassPathUtilsTest.class, "demo.txt"));
	}

}
