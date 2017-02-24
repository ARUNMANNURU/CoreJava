package com.inheritance.test;

import com.inheritance.main.Child;
import com.inheritance.main.Parent;

public class InheritenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pa = new Parent();
		int a;
		////pa.parentDisplay();
		Child ca = new Child();
		//System.out.println(a);
		ca.childDisplay();
		ca.parentDisplay();
	Parent pc = new Child();
	Child c= (Child)pc;
	c.parentDisplay();
	c.childDisplay();
pa.sum(7, 9);
	pc.sum(7, 9);
	}

}
