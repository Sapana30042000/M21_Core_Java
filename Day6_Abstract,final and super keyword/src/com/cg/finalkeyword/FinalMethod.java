package com.cg.finalkeyword;

class c
{
	void accept() 
	//final void accept()
	{
		System.out.println("Hey there,i wanna provide restrictions")
	}
}

class D extends c
{
	void accept()
	{
		System.out.println("Restriction provided");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		D d=new D();
		d.accept();

	}

}
