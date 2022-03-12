package com.mphasis.abstraction;

public class BankUtil {
	
	public static Ibank getObj() {
		
		return new BankImp2();
		
	}

}
