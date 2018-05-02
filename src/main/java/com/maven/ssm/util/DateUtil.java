package com.maven.ssm.util;

import java.util.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Project: vnews
 * @Class: DateUtil.java
 * @Description: 日期工具类
 * @Date: 2018年3月31日
 * @author liuwei5
 */
public class DateUtil {
	private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>();

	public static DateFormat getDateFormat() {
		DateFormat df = threadLocal.get();
		if (df == null) {
			df = new SimpleDateFormat(DATE_FORMAT);
			threadLocal.set(df);
		}
		return df;
	}

	public static String formatDate(Date date) throws ParseException {
		DateFormat dateFormat = getDateFormat();
		String dateStr = dateFormat.format(date);
		return dateStr;
	}

	public static Date parseDate(String strDate) throws ParseException {
		DateFormat dateFormat = getDateFormat();
		Date date = dateFormat.parse(strDate);
		return date;
	}
	
	public static String formatTimestamp(Timestamp timestamp) {
		DateFormat dateFormat = getDateFormat();
		String timeStamp = dateFormat.format(timestamp);
		return timeStamp;
	}

	public static Timestamp parseTimeStamp(String timestamp) {
		return Timestamp.valueOf(timestamp);
	}
}
