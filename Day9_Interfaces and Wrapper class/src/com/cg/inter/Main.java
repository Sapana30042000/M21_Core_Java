package com.cg.inter;
interface inf
{
//by deafault its abstract method
	void display();
	
}
class demo1 implements Inf
{
	//provided the implemention for abstract method inside the demo class
	
	@override
	public void display() {
		System.out.println("Interface");
	}	
	
}
public class Main
{
	public static void main(String args[])
	{
		Demo1 d=new Demo();
		d.display1();
	}
}