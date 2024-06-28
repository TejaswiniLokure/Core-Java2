package com.te.Learnjava8.exception;

public class BankException {
	public static void main(String[] args) {
		int balance;
		try {
		checkBalance(100);	
		}
		catch(bankBalanceChecking e){
		System.out.println(e.getMessage());
			
		}
	}

	private static void checkBalance(int balance)  {
		// TODO Auto-generated method stub
		if(balance>200)
		{   
			int remainAmount=balance-200;
			System.out.println("balancing amount is "+remainAmount);
		}
		else {
			throw new bankBalanceChecking("bank balance is not sufficient");
		}
		
	}

}
