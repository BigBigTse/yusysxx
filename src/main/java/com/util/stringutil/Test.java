package com.util.stringutil;

import com.alibaba.fastjson.JSONObject;

public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*		String receivedMessage = "{\"returnType\":400,\"reason\":\"��ѯ��Ϣʧ��\",\"data\":{\"qzh\":123}}";
		JSONObject ReJson = null;
		try {
			//ReJson = JSONObject.parseObject(deData);
			ReJson = JSONObject.parseObject(receivedMessage);
		} catch (Exception e) {
			throw new Exception("json��ʽ��ʧ�ܣ����ĸ�ʽ����");
		}
		JSONObject dataJson = ReJson.getJSONObject("data");
		System.out.println(dataJson);*/
		String receivedMessage = "ERROR:�޷�������ѯ�����JSON��:{\"queryString\":\"?qlr=С��&bdcqzh=1232315&zjhm=13216516\",\"querytime\":\"41518\",\"queryresult\":\"{\\\"returnType\\\":" +
				"400,\\\"reason\\\":\\\"��ѯ�쳣\\\",\\\"data\\\":\\\"����֤�Ƿ�Ϊ����֤��\\\"}\",\"responsetime\":\"1851541\"}";
		String errJsonStr = receivedMessage.substring(receivedMessage.indexOf("\"queryresult\":\""), 
				receivedMessage.indexOf("\",\"responsetime")).substring(15);
		errJsonStr = errJsonStr.replace("\\", "");
		JSONObject errJson = null;
		try {
			errJson = JSONObject.parseObject(errJsonStr);
		} catch (Exception e) {
			throw new Exception("json��ʽ��ʧ�ܣ����ĸ�ʽ����");
		}
		String errCode = errJson.getString("returnType");
		String errMessage = errJson.getString("reason");
		String errData = errJson.getString("data");
		System.out.println(errCode + errMessage + errData);
	}

}
