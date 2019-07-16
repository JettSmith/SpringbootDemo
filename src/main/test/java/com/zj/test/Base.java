package com.zj.test;

public class Base {
	
	public static String baseStaticVar = "baseStaticVar";
	
	static {
		System.out.println("baseStaticVar is:"+baseStaticVar);
		String baseStatic = "baseStaticBlock";
		System.out.println("start baseStaticBlock");
	}
	
	public String baseVar = "baseVar";
	
	public static String baseStaticFun() {
		
		System.out.println("baseStaticFun");
		return "start baseStaticFun";
	}
	
	public Base() {
		System.out.println("baseVar is:"+baseVar);
		System.out.println("start Base");
	}
}
