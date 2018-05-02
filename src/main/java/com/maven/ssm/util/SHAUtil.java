package com.maven.ssm.util;

import java.math.BigInteger;
import java.security.MessageDigest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Project: vnews
 * @Class: SHAUtil.java
 * @Description: sha加密
 * @Date: 2018年3月31日
 * @author liuwei5
 */
/*
SHA(Secure Hash Algorithm，安全散列算法），数字签名等密码学应用中重要的工具，
被广泛地应用于电子商务等信息安全领域。虽然，SHA与MD5通过碰撞法都被破解了， 
但是SHA仍然是公认的安全加密算法，较之MD5更为安全*/
public class SHAUtil {
	private static final String KEY_SHA = "SHA";
	private static final Logger LOGGER = LoggerFactory.getLogger(SHAUtil.class);

	public static String getResult(String inputStr) {
		BigInteger sha = null;
		LOGGER.debug("=======加密前的数据:" + inputStr);
		byte[] inputData = inputStr.getBytes();
		try {
			MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
			messageDigest.update(inputData);
			sha = new BigInteger(messageDigest.digest());
			LOGGER.debug("SHA加密后:" + sha.toString(32));
		} catch (Exception e) {
			LOGGER.error("SHA加密错误：" + e);
		}
		return sha.toString(32);
	}

	public static void main(String args[]) {
		try {
			String inputStr = "简单加密";
			getResult(inputStr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
