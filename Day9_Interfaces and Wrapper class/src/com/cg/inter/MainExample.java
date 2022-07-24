package com.cg.inter;
interface Vehicle
{
	void speed();
}
interface Car extends Vehicle
{
	void engine();
}
class Bus implements Car
{
	public void engine()
	{
		System.out.println("Petrol");
	}


  @Override
  public void speed() {
	 System.out.println("Speed is 40km/hr");  
  }
  
}
public class MainExample {

	public static void main(String[] args) {
		Bus b=new Bus();
		b.engine();
		b.speed();

	}

}
