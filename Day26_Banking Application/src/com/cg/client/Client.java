package com.cg.client;

import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.application.MMBankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;
import com.cg.framework.BankFactory;

public class Client {

	public static void main(String[] args) {
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(112231,"sapana",1500,true);
		CurrentAcc n=new MMCurrentAcc(112232,"janvi",5000,00);
		//for Saving account output
		System.out.println("Saving Accout :");
		p.withdraw(p.getAccBal());
		//for current account output
		System.out.println("Current Account :");
		n.withdraw(n.getAccBal());
		System.out.println(p);
		System.out.println(n);
		
		
	}

}