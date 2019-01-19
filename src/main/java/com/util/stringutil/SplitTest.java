package com.util.stringutil;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "04F00047623976,4E+12,1��,1��1128��,2017/12/6 16:56,";
		String[] strList = str.split(",");
		System.out.println(strList.length);
	}

}
