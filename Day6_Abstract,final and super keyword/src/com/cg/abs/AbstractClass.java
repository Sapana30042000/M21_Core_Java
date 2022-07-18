package com.cg.abs;

abstract class Fruit

{
	//abstract method
	abstract void display();
}

class Apple
{
	//provide implementaion for abstract method
	void display()
	{
		System.out.println("Apple is good for our brain");
	}
}



public class AbstractClass {

	public static void main(String[] args) {
		//Friut f=new Fruit();
		Apple f=new Apple();
		f.display();
	}

}
