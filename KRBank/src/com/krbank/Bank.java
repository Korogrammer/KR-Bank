package com.krbank;

import java.util.Scanner;

//Start Loan Parent Class
abstract class Loan {
	// Variable
	private float simpleinterest;
	
	// gatter for simpleinterest
	public float getSimpleinterest() {
		return simpleinterest;
	}
	
	// setter for simpleinterest
	public void setSimpleinterest(float simpleinterest) {
		this.simpleinterest = simpleinterest;
	}
	
	abstract void whichLoan(); // Shows the name of the Loan
	abstract void input(); // Gets the input
	abstract void calculateSimpleInterest();
	abstract void display(); // Display the Simple Interest Amount
}
//End Loan Parent Class

//Start Personal Loan Class
class Personal extends Loan {
	private float amount, time;
	static final float rateofinterest;
	
	static {
		rateofinterest = 8.15f; // Fixed Interest for Personal Loan
	}
	
	// Print Personal Loan
	void whichLoan() {
		System.out.println("Personal Loan!");
	}
	
	// Inputs for Personal Loan
	void input() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Amount: ");
		amount = scn.nextFloat(); // Amount Input Personal Loan
		
		System.out.print("Enter the Time: ");
		time = scn.nextFloat(); // Time Input Personal Loan
		scn.close();
	}
	
	// Calculate method for the Personal Loan's Simple Interest
	void calculateSimpleInterest() {
		// calculate the simple interest of Personal Loan & set it using setter method
		setSimpleinterest((amount * time * rateofinterest) / 100);
	}
	
	// Display method for the Personal Loan's Simple Interest
	void display() {
		// display the simple interest of Personal Loan using getter method
		System.out.println("Simple Interest: " + getSimpleinterest());
	}
}

//Start Home Loan Class
class Home extends Loan {
	private float amount, time;
	private int district;
	private static float rateofinterest;
	
	private String[] listofdistricts = {"('1' Alipurduar)", "('2' Bankura)", "('3' Asansol)", "('4' Bardhaman)", "('5' Suri)", "('6' Darjeeling)"}; // Array of the Districts
	
	// Print Home Loan
	void whichLoan() {
		System.out.println("Home Loan!");
	}
	
	// Inputs for Home Loan
	void input() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Amount: ");
		amount = scn.nextFloat(); // Amount Input Home Loan
		
		System.out.print("Enter the Time: ");
		time = scn.nextFloat(); // Time Input Home Loan 
		// Prints the degree
		for(int i = 0; i < listofdistricts.length; i++) {
			System.out.println(listofdistricts[i]);
		}
				
		System.out.print("Enter the District(eg: 1, 2, 3,...): ");
		district = scn.nextInt(); // District input Student Loan
				
		// Condition check for district & choose the rate of interest
		switch(district) {
		case 1:
			rateofinterest = 8.40f; // For Alipurduar
			break;
		case 2:
			rateofinterest = 8.37f; // For Bankura
			break;
		case 3:
			rateofinterest = 8f; // For Asansol
			break;
		case 4:
			rateofinterest = 9f; // For Bardhaman
			break;
		case 5:
			rateofinterest = 9.13f; // For Suri
			break;
		case 6:
			rateofinterest = 8.75f; // For Darjeeling
			break;
		default:
			rateofinterest = 8.40f; // For Default
		}
		
		scn.close();
	}
	
	// Calculate method for the Home Loan's Simple Interest 
	void calculateSimpleInterest() {
		// calculate the simple interest of Home loan & set is using setter method
		setSimpleinterest((amount * time * rateofinterest) / 100);
	}
	
	// Display method for the Home Loan's Simple Interest
	void display() {
		// display the simple interest of Home loan using getter method
		System.out.print("Simple Interest: " + getSimpleinterest());
	}
}

//Start Student Loan Class
class Student extends Loan {
	private float amount, time;
	private int degree;
	private static float rateofinterest;
	
	String[] listofdegree = {"('1' BTech)", "('2' MTech)", "('3' BCA)", "('4' MCA)"}; // Array of the Degrees
	
	// Print Student Loan
	void whichLoan() {
		System.out.println("Student Loan!");
	}
	
	// Inputs for Student Loan
	void input() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Amount: ");
		amount = scn.nextFloat(); // Amount Input Student Loan
		
		System.out.print("Enter the Time: ");
		time = scn.nextFloat(); // Time Input Student Loan
		
		// Prints the degree
		for(int i = 0; i < listofdegree.length; i++) {
			System.out.println(listofdegree[i]);
		}
		
		System.out.print("Enter the Degree(eg: 1, 2, 3,...): ");
		degree = scn.nextInt(); // Degree input Student Loan
		
		// Condition check for degrees & choose the rate of interest
		switch(degree) {
		case 1:
			rateofinterest = 8.37f; // For BTech
			break;
		case 2:
			rateofinterest = 9.37f; // For MTech
			break;
		case 3:
			rateofinterest = 7.37f; // For BCA
			break;
		case 4:
			rateofinterest = 7.67f; // For MCA
			break;
		default:
			rateofinterest = 8.37f; // Default
		}
		
		scn.close();
	}
	
	// Calculate method for the Student Loan's Simple Interest
	void calculateSimpleInterest() {
		// calculate the simple interest of Student loan & set it using setter method
		setSimpleinterest((amount * time * rateofinterest) / 100);
	}
	
	// Display method for the Student Loan's Simple Interest
	void display() {
		// display the simple interest of Student loan using getter method
		System.out.print("Simple Interest: " + getSimpleinterest());
	}
}

//Start Business Loan Class
class Business extends Loan {
	private float amount, time;
	static final float rateofinterest;
	
	static {
		rateofinterest = 7.20f; // Fixed interest for Business Loan
	}
	
	// Print Business Loan
	void whichLoan() {
		System.out.println("Business Loan!");
	}
	
	// Inputs for Business Loan
	void input() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Amount: ");
		amount = scn.nextFloat(); // Amount Input Business Loan
		
		System.out.print("Enter the Time: ");
		time = scn.nextFloat(); // Time Input Business Loan
		scn.close();
	}
	
	// Calculate method for the Business Loan's Simple Interest
	void calculateSimpleInterest() {
		// calculate the simple interest of Business loan & set is using setter method
		setSimpleinterest((amount * time * rateofinterest) / 100);
	}
	
	// Display method for the Business Loan's Simple Interest
	void display() {
		// display the simple interest of Business loan using getter method
		System.out.print("Simple Interest: " + getSimpleinterest());
	}
}

//Manager For all the loans
class Manager {
	Personal p = new Personal(); // Object for Personal Loan
	Home h = new Home(); // Object for Home Loan
	Student s = new Student(); // Object for Student Loan
	Business b = new Business(); // Object for Business Loan
	
	void permit(Loan L) {
		L.whichLoan();
		L.input();
		L.calculateSimpleInterest();
		L.display();
	}
	
	// Which loan to take (Option)
	void whichLoan() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to KR Bank!"); // Welcome Greetings 
		System.out.println();
		System.out.println("Which Loan would you like to take!");
		System.out.print("(1 for Personal, 2 for Home, 3 for Student, 4 for Business): ");
		int input = scn.nextInt(); // Get input for which type of lone
		System.out.println();
		
		switch(input) {
		case 1:
			permit(p); // Personal oan
			break;
		case 2:
			permit(h); // Home Loan
			break;
		case 3:
			permit(s); // Student Loan
			break;
		case 4:
			permit(b); // Business Loan
			break;
		default:
			System.out.println("Wrong Input!");
		}
		scn.close();
	}
}

public class Bank {
	public static void main(String[] args) {
		Manager m = new Manager(); // Object for Manager
		m.whichLoan();
	}
}
