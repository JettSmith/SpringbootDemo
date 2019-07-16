package com.zj.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * 测试java 基本原理
 * 
 * @author ZJ
 *
 */
public class JavaTest {

	public static void main(String[] args) {

		testException();
	}

	public static String testException() {

		try {
			System.out.println("1");
			int a = 1 / 0;
			System.out.println("2");
			// return "return 1";

		} catch (Exception e) {
			System.out.println("3");
			return "return 2";

		} finally {
			System.out.println("4");
			return "return 3";

		}
	}

	/**
	 * 测试异常return 顺序
	 */
	@Test
	public void testExceptionFun() {
		try {
			System.out.println("1");
			int a = 1 / 0;
			System.out.println("2");

		} catch (Exception e) {

			System.out.println("3");

		} finally {
			System.out.println("4");
		}

	}

	/**
	 * 测试基本语法
	 */
	@Test
	public void testFun() {

		System.out.println(2 % 0.1);
	}

//	class Base {
//
//		public static final int a = 1;
//
//		int b;
//
////		public static void afun() {
////			
////		}
//
//	}

//	@Test
//	public void testLum() {
//
//		LambdaTest sum = (a, b) -> {
//			return a + b;
//		};
//		System.out.println("5 + 2 =" + opera(5, 2, sum));
//	}
//
//	private int opera(int a, int b, LambdaTest lt) {
//		return lt.operation(a, b);
//	}

	@Test
	public void stream() {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("strings is:" + strings);
		long count = strings.stream().filter(string -> string.isEmpty()).count();

		System.out.println("Empty string is :" + count);

		List<String> result = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("not null list is" + result);

		String merString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(""));
		System.out.println(" merString is" + merString);
	}

	@Test
	public void stream_2() {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		System.out.println("列表: " + numbers);

		List<Integer> result = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println("result is:" + result);
		System.out.println("列表: " + numbers);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("列表中最大的数 : " + stats.getMax());
		System.out.println("列表中最小的数 : " + stats.getMin());
		System.out.println("所有数之和 : " + stats.getSum());
		System.out.println("平均数 : " + stats.getAverage());
		System.out.println("随机数: ");

	}

	@Test
	public void test05() {
		String a = "a";
		String s = new String("a");
		System.out.println("s == a = " + (s == a));
		System.out.println("s equals a = " + (s.equals(a)));
	}

	@Test
	public void test06() {
//		Base base = new Base();
//		A a = new A();
	}

	static class JoinThread implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void testThread() throws InterruptedException {
		Thread thread1 = new Thread(new JoinThread());
		Thread thread2 = new Thread(new JoinThread());
		// CachedThreadPool e = new CacheThreadPool();
		thread1.start();
		thread1.join();
		thread2.start();

		String s = new String("abc");
		String c = "c";
		c = c + "8";
		StringBuilder sb = new StringBuilder();
		StringBuffer sb1 = new StringBuffer();
		ConcurrentHashMap cm = new ConcurrentHashMap();
		Hashtable<String, String> ht = new Hashtable<String, String>();
	}
	
	@Test
	public void testClassLoader() {
		
	}
	
	class TestLoad{
		
		public void code() {
			System.out.println(" i am testLoad code run ");
		}
	}
	
	class MyClassLoader extends ClassLoader{
		
		public Class<?> defineMyClass( byte[] b, int off, int len)   
	    {  
	        return super.defineClass(b, off, len);  
	    }  
	}
	
	@Test
	public void testThread2() {
		List<String> list = new ArrayList<String>();
		List<String> lst = new LinkedList<String>();
		
	}
	
}
