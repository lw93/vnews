package com.maven.ssm.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Project: news-crawling
 * @Class: PropertiesUtils.java
 * @Description:
 * @Date: 2017年11月9日
 * @author liuwei5
 */
public class PropertiesUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesUtil.class);
	private static Properties properties;

	/**
	 * 加载属性文件
	 * 
	 * @param filePath
	 *            文件路径
	 * @return
	 */
	  static{
	        loadproperties();
	    }

	    synchronized static private void loadproperties(){
	        LOGGER.debug("开始加载properties文件内容......");
	        properties = new Properties();
	        InputStreamReader in = null;
	        try {
	        	BufferedInputStream buffer = new BufferedInputStream(new FileInputStream("config/vnews.properties"));
	        	in = new InputStreamReader(buffer, "utf-8");
	        	properties.load(in);

	        } catch (FileNotFoundException e) {
	            LOGGER.error("vnews.properties文件未找到");
	        } catch (IOException e) {
	            LOGGER.error(e.toString());
	        } finally {
	            try {
	                if(null != in) {
	                    in.close();
	                }
	            } catch (IOException e) {
	                LOGGER.error("vnews.properties文件流关闭出现异常");
	            }
	        }
	    }

	/**
	 * 读取配置文件
	 * @param key
	 * @return
	 */
	public static String getNewsType(String key) {
		if (properties ==null) {
			loadproperties();
		}
		return properties.getProperty(key);
	}

	public static void main(String args[]) {
		System.err.println(getNewsType(Constant.VNEWS_IDS[1]));
	}
}
