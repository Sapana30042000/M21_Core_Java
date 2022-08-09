package com.cg.framework;

public abstract class CurrentAcc extends BankAcc
{
	//fields
    private final float creditLimit;
  //constructor
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	//providing implementation to abstract method of bank account here //current account
	public void withdraw(float accBal)
	{
		System.out.println("Account No is :"+this.getAccNo()+"Account Name is :"+this.getAccNm()+
				"  accBal is :"+(accBal+creditLimit));
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s, toString()=%s]", creditLimit, super.toString());
	}
    
	
}
