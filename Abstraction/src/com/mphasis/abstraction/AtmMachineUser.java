package com.mphasis.abstraction;

import java.util.Scanner;

public class AtmMachineUser {

	public static void main(String[] args) {
		
		Ibank bank = BankUtil.getObj();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
		System.out.println("$$$$ WELCOME TO ATM $$$$");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Exit");
		
		
		
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1: 
			
			bank.deposit();
			
			break;
			
		case 2:   //withdraw
			
			bank.withdraw();
			
			break;
		
		case 3:    //exit
			
			flag  = false;
			System.out.println("Thank You . Visit Again.");
			
			break;

		default:
			break;
		}
		
		}

	}

}