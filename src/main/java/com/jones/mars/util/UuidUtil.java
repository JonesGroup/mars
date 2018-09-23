package com.jones.mars.util;

import java.util.UUID;

public class UuidUtil {

	private UuidUtil() {
		// dummy
	}

	public static String generate() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
