package com.tnz.test.lang;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {

	public static void main(String[] args) {
		String str = null;
		String str1 = "";
		String str2 = "   I love you   ";
		String str3 = "what can i help you?";
		String str4 = "b";
		String str5 = "IBM \r\n";
		String str6 = "我爱你sdfsdf2342342";

		System.out.println(StringUtils.defaultString(str));

		System.out.println(StringUtils.defaultString(str, "helloWorld"));

		System.out.println(StringUtils.deleteWhitespace(str2));// 删除空白

		System.out.println("defaultIfBlank: " + StringUtils.defaultIfBlank(str, "world"));

		System.out.println("capitalize: " + StringUtils.capitalize(str3));// 首字符大写

		System.out.println("trim: " + StringUtils.trim(str2));

		System.out.println("trimToEmpty: " + StringUtils.trimToEmpty(str1));// 如果是空,显示""

		System.out.println("trimToNull: " + StringUtils.trimToNull(str1));// 如果是空,显示null

		System.out.println("center: " + StringUtils.center(str4, 15));// 补齐长度,居中显示。

		System.out.println("chomp: " + StringUtils.chomp(str5));// 去除换行符

		System.out.println("abbreviate: " + StringUtils.abbreviate(str6, 10));// 缩写

		System.out.println("isNumeric: " + StringUtils.isNumeric("234234"));

		System.out.println("EMPTY: " + StringUtils.EMPTY);
		
		System.out.println("joinWith: " + StringUtils.joinWith("#", new Object[]{"hello","world"}));
		
		String[] strs = StringUtils.splitByCharacterTypeCamelCase("extractOrderInfoFromRequest");//按照驼峰切割
		System.out.println("splitByCharacterTypeCamelCase: " + Arrays.toString(strs));
		
	}

}
