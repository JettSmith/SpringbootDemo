package com.zj.test.start;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

import com.zj.test.thread.LiftOff;

public class ZjTest {
	
	@Test
	public void test01() {
		int i = 10;
		System.out.println("-- i is:"+ (-- i));
		System.out.println("i is:"+i);
	}
	
	@Test
	public void test02() {
		 for(int i = 0;i < 5;i++) {
			 new Thread(new LiftOff()).start();
			//t.start();
			System.out.println("Waiting for LF");
		 }
		
	}
	
	@Test
	public void test03() {
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i = 0;i < 5; i++) {
			es.execute(new LiftOff());
		}
		es.shutdown();
	}
}
