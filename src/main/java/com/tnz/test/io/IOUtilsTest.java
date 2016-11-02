package com.tnz.test.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class IOUtilsTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// 使用IOUtils
		InputStream in = new URL("https://www.baidu.com").openStream();
		try {
			System.out.println(IOUtils.toString(in));
		} finally {
			IOUtils.closeQuietly(in);
		}

		FileUtils.readLines(new File(""));
		FileUtils.cleanDirectory(null);
	}

}
