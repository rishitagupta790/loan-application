package com.Application;

import java.util.Scanner;

public class EducationLoan extends Loan{
	String username;
	public EducationLoan(Scanner sc) {
		System.out.println("Enter username.....");
		username=sc.next();
		System.out.println("Please Enter Amount and Time(in year) respectively....");
		super.setAmount(sc.nextDouble());
		super.setRate(10);//10% Loan Rate
		super.setTime(sc.nextDouble());
        var karta=super.getRate()/(12*100.0);
        double interestAmount=karta*super.getAmount();
        karta=karta+1;
        var num=Math.pow(karta, super.getTime()*12);
        double deno=num-1;
        double emi=num/deno;
        //System.out.println(emi*interestAmount);
        String[] values= {"Educational Loan","EMI:"+emi*interestAmount,"Time:"+super.getTime(),"Amount:"+super.getAmount(),"Rate:"+super.getRate()};
        super.setMap(username,values);
	}
	
}
