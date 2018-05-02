package com.maven.ssm.util;

import java.util.UUID;

/**
 * @Project: vnews
 * @Class: UUIDUtil.java
 * @Description: uuid
 * @Date: 2018年3月31日
 * @author liuwei5
 */
public class UUIDUtil {
	 /**
     * 获取uuid
     * @return 去除"-"后的uuid字符串
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
