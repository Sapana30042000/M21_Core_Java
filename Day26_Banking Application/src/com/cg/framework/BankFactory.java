package com.cg.framework;

public abstract class BankFactory 
{
	//abstract method
	  abstract public SavingAcc getNewSavingAcc(int AccNo,String accNm,float Bal,boolean isSalaried);
	  abstract public CurrentAcc getNewCurrentAcc(int AccNo,String accNm,float Bal,float creditLimt);
	  
}
