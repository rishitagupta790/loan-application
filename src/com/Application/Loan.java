package com.Application;

import java.util.HashMap;

public class Loan {
    private double amount;
    private double rate;
    private double time;
    private static HashMap<String, String[]> map = new HashMap<>();
    public void showLoan(String username) {
    }

    public void takeLoan() {
    }
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public static String[] getMap(String username) {
		return map.get(username);
	}

	public static void setMap(String str,String[] values) {
		Loan.map.put(str, values);
	}
    
}
