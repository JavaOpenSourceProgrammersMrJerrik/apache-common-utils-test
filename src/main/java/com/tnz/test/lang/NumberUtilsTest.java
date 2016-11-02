package com.tnz.test.lang;

import org.apache.commons.lang3.math.NumberUtils;

public class NumberUtilsTest {

	public static void main(String[] args) {
		System.out.println(NumberUtils.FLOAT_ONE);
		
		System.out.println(NumberUtils.toInt("2") + 3);
		System.out.println(NumberUtils.isDigits("234234"));
		System.out.println(NumberUtils.isDigits("0x23423"));
		System.out.println(NumberUtils.LONG_ONE);
	}

}
