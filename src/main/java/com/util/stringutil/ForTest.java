package com.util.stringutil;

public class ForTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			if(i == 3) {
				throw new Exception("����");
			}
			System.out.println(i);
		}
	}

}
