package com.mphasis.abstraction;

public abstract class BankImp1 implements Ibank {

	@Override
	public void deposit() {
		
		System.out.println("Deposit successfully done");

	}
	
	public abstract void withdraw(); 

}
