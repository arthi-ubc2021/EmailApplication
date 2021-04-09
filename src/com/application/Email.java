package com.application;

import java.util.Scanner;

public class Email {
	public String firstName;
	public String lastName;
	public String department;
	public String company = "javatraining";
	public String password;
	public int mailBoxCapacity = 10;
	public String email;
	public String alternateEmail;
	
	//Constructor to set First Name and Last Name
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = this.setDepartment();
		this.email = this.setEmail();
		this.password = this.randomPassword(8);
	}
	
	//Method to setDepartment
	public String setDepartment() {
		System.out.println("New worker department codes:");
		System.out.println("1. Sales \n2. Development \n3. Accounting \n0. None");
		System.out.print("Enter department code: ");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice==1) {return "sales";}
		else if (choice==2) {return "development";}
		else if (choice==3) {return "accounting";}
		else if (choice==0) {return "";}
		else return "";
	}
	
	//Method to generate email
	public String setEmail()
	{
		return this.firstName.toLowerCase()+"." + this.lastName.toLowerCase() + "@" + this.department +"."+ this.company +".com";
	}
	//Generate random password
	public String randomPassword(int passwordLength) {
		String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@_#$";
		char[] password = new char[passwordLength];
		
		for(int i=0; i<passwordLength;i++) {
			int randomNumber = (int) (Math.random() * characterSet.length());
			password[i] = characterSet.charAt(randomNumber);
		}
		
		return new String(password);
	}
	
	//Method to change password
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}
	
	//Method to set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Method to set alternate mail id
	public void setAlternateEmail(String alternateEmail)
	{
		this.alternateEmail = alternateEmail;
	}
	
	//Method to display Name, Email and Mailbox capacity
	public void displayInfo() {
		System.out.println("Name: "+this.firstName +" "+this.lastName);
		System.out.println("Email: "+this.email);
		System.out.println("Mailbox capacity: " + this.mailBoxCapacity + "mb");
		System.out.println("Password: "+this.password);
	}
}
