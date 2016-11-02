package com.tnz.test.lang;

import org.apache.commons.lang3.StringEscapeUtils;

public class StringEscapeUtilsTest {

	public static void main(String[] args) {
		String javaSegment = " int a = 3;public static Integer counter = 0;";
		System.out.println(StringEscapeUtils.escapeJava(javaSegment) + "-" + javaSegment);

		System.out.println(StringEscapeUtils.escapeHtml4("中国<a href='#'>jump</a>"));// 对html元素进行转义 输出:中国&lt;a href='#'&gt;jump&lt;/a&gt;
		String escapeHtml = StringEscapeUtils.escapeHtml4("中国<a href='#'>jump</a>");
		System.out.println("unescapeHtml: " + StringEscapeUtils.unescapeHtml4(escapeHtml));//unescapeHtml: 中国<a href='#'>jump</a>
		
		
		String json = "{\"ok\":\"123\"}";
		System.out.println(StringEscapeUtils.escapeJson(json));
		
		
	}

}
