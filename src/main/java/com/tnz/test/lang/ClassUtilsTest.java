package com.tnz.test.lang;

import java.util.HashMap;

import org.apache.commons.lang3.ClassUtils;

public class ClassUtilsTest {

	public static void main(String[] args) {
		System.out.println(ClassUtils.getPackageCanonicalName(ClassUtilsTest.class.getName()));//com.tnz.test.lang
		
		System.out.println(ClassUtils.INNER_CLASS_SEPARATOR);
		
		System.out.println(ClassUtils.getAllInterfaces(String.class));
		
		System.out.println(ClassUtils.getAllSuperclasses(HashMap.class));
		
	}

}
