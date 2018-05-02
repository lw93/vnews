package com.maven.ssm.util;

/**
 * @Project: vnews
 * @Class: StringUtil.java
 * @Description: 判空工具类
 * @Date: 2018年4月1日
 * @author liuwei5
 */
public class StringUtil {
	/**
	 * 字符串是否为空，包括blank
	 * @param str
	 * @return
	 */
	public static boolean isNullOrEmpty(String str){
		return null != str && 0 != str.trim().length() ? false : true;
	}
}
