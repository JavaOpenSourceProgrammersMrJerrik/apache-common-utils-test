package com.tnz.test.lang;

import org.apache.commons.lang3.ObjectUtils;

public class ObjectUtilsTest {

	public static void main(String[] args) {
		System.out.println(ObjectUtils.defaultIfNull(null, "hello"));
	}

}
