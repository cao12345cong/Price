package com.ssy.price.commons.service;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import com.ssy.price.commons.PropertiesUtils;

/**
 * 数据获取接口
 * 
 * @author cofey
 */
public class BaseService {

	/**
	 * 获取服务器数据
	 * 
	 * @param rpc
	 * @return
	 */
	protected String getServerData(SoapObject rpc) {
		// soap协议版本必须用SoapEnvelope.VER11
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.bodyOut = rpc;
		// 设置请求参数
		envelope.dotNet = false;
		envelope.setOutputSoapObject(rpc);
		// 创建HttpTransportSE对象
		String url = PropertiesUtils.getValue("soap_address");
		HttpTransportSE ht = new HttpTransportSE(url);
		String data = "";
		try {
			ht.call(null, envelope);
			Object object = envelope.getResponse();
			if (null != object) {
				data = envelope.getResponse().toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	/**
	 * 根据接口名称获取SoapObject
	 * 
	 * @param name
	 * @return
	 */
	protected SoapObject getSoapObject(String name) {
		return new SoapObject(PropertiesUtils.getValue("target_namespace"),
				name);
	}
}
