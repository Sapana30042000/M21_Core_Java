package com.cg.inter;
interface Mother
{
	void display();
}
interface Father
{
	void print();
}
class Daughter implements Mother,Father
{
	@Override
	public void print(){
		System.out.println("My Father name is suresh");
	}
	
	@Override
	public void display() {
		System.out.println("My mother name is vandana");
	}
		
	
}

public class MultipleInterfaceUsingInterface {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.display();
		d.print();

	}

}
