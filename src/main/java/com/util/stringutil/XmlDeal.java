package com.util.stringutil;

public class XmlDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "<BRNO>281200</BRNO><OPKD>3</OPKD><CUSTOMID>111975225</CUSTOMID>"
				+ "<CURRYTYPE>01</CURRYTYPE><ACCNOTYPE>02</ACCNOTYPE><TRTY>01</TRTY>"
				+ "<OTTR>6229676188888005290</OTTR><CODE>HS000001</CODE><CLVL>1</CLVL>"
				+ "<IDTYPE>1</IDTYPE><IDNO>310101198604100012</IDNO><PHONENUM>13307078568</PHONENUM><ACCNONAME>ӣ��ζ</ACCNONAME>";
		String str1 = str.substring(str.indexOf("<BRNO>"),str.indexOf("</BRNO>")).substring(6);
		System.out.println(str1);
		new XmlDeal().deal(str1);
		System.out.println(str1);
		
		System.out.println("GW0907".indexOf("GW0907"));
		System.out.println("0907".equals("0907"));
		
		
	}

	public void deal(String str) {
		str = str + str;
		System.out.println(str);
	}
	

}
