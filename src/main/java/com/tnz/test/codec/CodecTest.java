package com.tnz.test.codec;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class CodecTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Base64 base64 = new Base64();
		String str = "I love you,中国.";
		try {
			str = base64.encodeToString(str.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("Base64 编码后：" + str);
		
		System.out.println("==========解码===========");
		System.out.println(new String(base64.decode(str)));
	}

}
