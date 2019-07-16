package com.zj.test.thread;

public class ZJThread extends Thread {
	
	@Override
	public void run() {
		
		try {
			int secondValue = (int) (Math.random() * 3000);
			System.out.println(secondValue);
			Thread.sleep(secondValue);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
