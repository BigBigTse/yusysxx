package com.util.stringutil;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("2");
		list.add("1");
		System.out.print(list);
		String str;
		for(int i = 0;i<list.size();i++) {
			str = (String) list.get(i);
			if(str.equals("1")) {
				list.remove(i);
				System.out.print(list);
//				i--;
			}
		}

	}

}
