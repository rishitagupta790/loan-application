package com.Application;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Loan Rate\nCar Loan-13%\tEducation Loan-10%\tHome Loan-17%\tPersonal Loan-15%");
        System.out.println("--------------------------------------------------------------------------------");
        while (flag) {
        	Scanner sc = new Scanner(System.in);
            System.out.println("1. For Take Loan\t2. For Show Loan\t3.To Show Specific Detail\t4.For Exit");
            byte b=sc.nextByte();
            System.out.println("--------------------------------------------------------------------------------");
            switch (b) {
                case 1 :
                    System.out.println("1.Car Loan\t2.Educational Loan\t3.Home Loan\t4.Personal Loan\t5.EXIT");
                    int bl=sc.nextInt();
                    System.out.println("--------------------------------------------------------------------------------");
                    switch (bl) {
                        case 1:
                             new CarLoan(sc);
                             break;
                        case 2:
                            new EducationLoan(sc);
                            break;
                        case 3:
                            new HomeLoan(sc);
                            break;
                        case 4:
                            new PersonalLoan(sc);
                            break;
                        case 5:
                        	System.out.println("Exited...");
                            break;
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    break;
                case 2:
                	System.out.println("Enter user to show All Detail");
                    String str[]=Loan.getMap(sc.next());
                    System.out.println(Arrays.toString(str));
                    System.out.println("--------------------------------------------------------------------------------");
                    break;
                case 3:
                	System.out.println("Enter User Name....");
                    String st[]=Loan.getMap(sc.next());
                    //[Personal Loan, EMI:80.6674785371579, Time:10.0, Amount:5000.0, Rate:15.0]
                    if(!st.equals(null)) {
                    	System.out.println("--------------------------------------------------------------------------------");
                    	System.out.println("1.Loan Type\t2.EMI\t3.Time\t4.Total Amount\t5.Rate\t6.Extra Interest");
                    	byte option=sc.nextByte();
                    	System.out.println("--------------------------------------------------------------------------------");
                    	switch (option) {
						case 1:System.out.println(st[0]);
							break;
						case 2:System.out.println(st[1]);
						break;
						case 3:System.out.println(st[2]);
						break;
						case 4:System.out.println(st[3]);
						break;
						case 5:System.out.println(st[4]);
						break;
//						case 6:System.out.println(st[0]);
//						break;
						}
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    break;                    
                case 4:
                    System.out.println("Exiting....");
                    flag = false;
                    System.out.println("--------------------------------------------------------------------------------");
                    break;
            }
        }
    }

}
