package com.tnz.test.io;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.CopyUtils;

public class CopyUtilsTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		CopyUtils.copy("hello", System.out);
	}

}
