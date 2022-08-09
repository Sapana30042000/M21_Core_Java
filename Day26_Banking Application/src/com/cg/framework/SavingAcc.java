package com.cg.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalaried;
    static final private float MINBAL=0.0f;
  //constructor
    public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
    	super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
    }
  //method
  	public void withdraw(float Bal) 
  	{
  		System.out.println("Account No is :"+this.getAccNo()+"Account Name is :"+this.getAccNm()+
  				"  accBal is :"+Bal);
  	}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}
  	
}