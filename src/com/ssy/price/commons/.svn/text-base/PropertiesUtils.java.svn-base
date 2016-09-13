package com.ssy.price.commons;

import java.io.InputStream;
import java.util.Properties;

/**
 * 该类主要作用为读取本地propertie文件
 * 
 * @author Administrator
 */
public class PropertiesUtils {

	private static Properties propertie;
	private static String fileName = "/assets/app.properties";

	/**
	 * 返回要获取的值
	 * 
	 * @return key
	 */
	public static String getValue(String key) {
		propertie = new Properties();
		try {
			InputStream is = PropertiesUtils.class.getResourceAsStream(fileName);
			propertie.load(is);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (propertie.containsKey(key)) {
			String value = propertie.getProperty(key); // 得到某属性的值
			propertie.clear();
			return value;
		} else {
			return "";
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(PropertiesUtils.getValue("interface_url"));
	}
}
