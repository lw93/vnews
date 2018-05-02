package com.maven.ssm.util;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;

/**
 * @Project: vnews
 * @Class: MD5Util.java
 * @Description: md5加密
 * @Date: 2018年3月31日
 * @author liuwei5
 */

/*
MD5(Message Digest algorithm 5，信息摘要算法) 
通常我们不直接使用上述MD5加密。通常将MD5产生的字节数组交给BASE64再加密一把，得到相应的字符串
Digest:汇编
*/
public class MD5Util {
	
	private static final String KEY_MD5 = "MD5";
	private static final Logger LOGGER = LoggerFactory.getLogger(MD5Util.class);

	
	/**
	 * md5加密
	 * @param inputStr
	 * @return
	 */
	public static String encryptMD5(String inputStr) {
		LOGGER.debug("=======加密前的数据:" + inputStr);
		BigInteger bigInteger = null;
		try {
			MessageDigest md = MessageDigest.getInstance(KEY_MD5);
			byte[] inputData = inputStr.getBytes("utf-8");
			md.update(inputData);
			bigInteger = new BigInteger(md.digest());
		} catch (Exception e) {
			LOGGER.error("md5加密错误：" + e);
		}
		LOGGER.debug("MD5加密后:" + bigInteger.toString(16));
		return bigInteger.toString(16);
	}


	public static void main(String args[]) {
		try {
			String inputStr = "简单加密8888888888888888888";
			encryptMD5(inputStr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
