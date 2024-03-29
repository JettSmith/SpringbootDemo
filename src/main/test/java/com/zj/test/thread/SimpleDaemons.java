package com.zj.test.thread;

import java.util.concurrent.TimeUnit;


public class SimpleDaemons implements Runnable {

	@Override
	public void run() {
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + "" + this);
			}
		}catch (Exception e) {
			System.out.println("sleep() interrupted");
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		for(int i=0; i< 10;i++) {
			Thread t = new Thread(new SimpleDaemons());
			t.setDaemon(true);
			t.start();
		}
		System.out.println("all t started");
		TimeUnit.MILLISECONDS.sleep(500);
	}
}
