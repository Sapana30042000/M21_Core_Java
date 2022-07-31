package com.cg.instanceofoperator;
class A
{
	
}
public class Childinstance extends A {

	public static void main(String[] args) {
		
		Childinstance c=new Childinstance();
		//c is the obj of parent class"A" because "Childinstance"class accessing the
		System.out.println(c instanceof A);
		System.out.println(c instanceof Childinstance);

	}

}
