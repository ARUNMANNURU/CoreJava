package com.inheritance.main;

public class Child extends Parent{

	
	int c; 
	public void childDisplay(){
		
		System.out.println("disp Child");
		
	}
	public float sum(int a , float b){
		if(a==10)
			a=a+20;
		System.out.println("hii"+(a+b));
		return a+b;
		
	}
	
	
}
