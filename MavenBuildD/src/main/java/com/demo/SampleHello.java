package com.demo;

public class SampleHello {

	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public static void main(String[] args) {
		SampleHello sh=new SampleHello();
		
		System.out.println(sh.add(3,4));

	}

}
