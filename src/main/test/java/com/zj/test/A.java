package com.zj.test;

import com.zj.test.Base;

public class A extends Base {
	
public static String aStaticVar = "aStaticVar";
	
	static {
		System.out.println("aStaticVar is:"+aStaticVar);
		
		System.out.println("start aStatic");
	}
	
	public String aVar = "aVar";
	
	public static String aStaticFun() {
		System.out.println("aStaticFun");
		return "start aStaticFun";
	}
	
	public A() {
		
		System.out.println("start a const");
		
	}
}
