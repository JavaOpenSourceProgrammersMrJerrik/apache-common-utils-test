package com.tnz.test.lang;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class ExceptionUtilsTest {

	public static void main(String[] args) {
		try {
			int i = 3 / 0;
		} catch (Exception e) {
			ExceptionUtils.wrapAndThrow(e);
			ExceptionUtils.rethrow(e);
		}
	}

}
