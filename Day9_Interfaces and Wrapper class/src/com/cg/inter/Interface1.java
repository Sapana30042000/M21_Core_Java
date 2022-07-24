package com.cg.inter;

public interface Interface1 {
//by deafault its abstract method
	void display();
	
}
class demo1 implements Interface1
{
	//provided the implemention for abstract method inside the demo class
	
	@override
	public void display() {
		System.out.println("Interface");
	}	
	
}
class Main1
{
	public static void main(String args[])
	{
		Demo1 d=new Demo();
		d.display1();
	}
}