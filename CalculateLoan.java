package com.bankLoan;

public class CalculateLoan {
	
	double doubleprincipal= 1000;
    double doublesimpInt;
	double compInt_amount, compInt;
	double doublerate = 12;
	int inttime = 2;
	int intNoYear = 2;
	
	
	public void calculateSimpleInterest()
	{
		doublesimpInt = (doubleprincipal*doublerate*inttime)/100;
		System.out.println("Simple Interest is: " +doublesimpInt);
	
	}
	
	public void calculatecompoundInterest()
	{
		compInt_amount = doubleprincipal*Math.pow(1+(doublerate/intNoYear), intNoYear*inttime);
		compInt = compInt_amount - doubleprincipal;
		
		System.out.println("Compound Interest is: " +compInt);
	}
}
