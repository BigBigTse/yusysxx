package com.util.dateutil;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DatePractice {

	public static void main(String[] args) {
		System.out.println(getPerDays());
		File file = new File("d:/test/");
//		file.mkdirs();
		System.out.println(file.exists());
		file.deleteOnExit();
		List<String> list = new ArrayList<>();
		list.add("123");
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
	}

	public static List<String> getPerDays() {
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date eDate = new Date();
		Date sDate = new Date();
		Calendar can = Calendar.getInstance();
		can.setTime(eDate);
		can.add(Calendar.DAY_OF_MONTH, -30);
		sDate = can.getTime();

		long start = sDate.getTime();
		long end = eDate.getTime();
		can.setTime(eDate);
		List<String> res = new ArrayList<String>();
		while (end >= start) {
			res.add(format.format(can.getTime()));
			can.add(Calendar.DAY_OF_MONTH, -1);
			end = can.getTimeInMillis();
		}
		return res;
	}
}
