package com.maven.ssm.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @Project: vnews
 * @Class: BASE64.java
 * @Description: base64编码加密
 * @Date: 2018年3月31日
 * @author liuwei5
 */
@SuppressWarnings("restriction")
public class BASE64Util {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BASE64Util.class);

	/**
	 * BASE64解密
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String decryptBASE64(String key) {
		String result = null;
		try {
			byte[] array = new BASE64Decoder().decodeBuffer(key);
			result = new String(array, "utf-8");
		} catch (Exception e) {
			LOGGER.error(e.toString());
		}
		return result;
	}

	/**
	 * BASE64加密
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String encryptBASE64(String key){
		String result = null;
		try {
			byte[] array = key.getBytes("utf-8");
			result = new BASE64Encoder().encodeBuffer(array);
		} catch (Exception e) {
			LOGGER.error(e.toString());
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "vnews";
		try {
			String result1 = BASE64Util.encryptBASE64(str);
			LOGGER.debug("========加密数据==========" + result1);
			String str2 = BASE64Util.decryptBASE64(result1);
			LOGGER.debug("========解密数据========"+ str2);
		} catch (Exception e) {
			LOGGER.error("========BASE64Util加解密出错========"+ e);
		}
	}
}
