package com.zj.test.thread;



public class TestThread {
	
	public static void main(String[] args) {
		
		try {
			ZJThread zjt = new ZJThread();
			zjt.start();
			//zjt.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("zjt is over");
	}
}
