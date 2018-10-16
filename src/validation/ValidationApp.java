package validation;

import java.util.Scanner;

public class ValidationApp {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		String userName;
		boolean nameReturn = false;
		String userEmail;
		boolean emailReturn = false;
		String userPhone;
		boolean phoneReturn = false;
		String userDate;
		boolean dateReturn = false;
		
		System.out.println("Enter your first and last name:");
		while(nameReturn == false) {
			userName = scnr.nextLine();
			nameReturn = validateName(userName);
			if (nameReturn == false){
				System.out.println("Make sure your first and last name are capitalized.");
				System.out.println("Please enter your name again:");
			}
			else{
				System.out.println("The name you entered has been validated!");
			}
			
		}
		
		
		System.out.println("Please enter your email:");
		while (emailReturn == false) {
			userEmail = scnr.nextLine();
			emailReturn = validateEmail(userEmail);
			if (emailReturn == false){
				System.out.println("Make sure you entered your email correctly.");
				System.out.println("Please enter your email again:");
			}
			else{
				System.out.println("The email you entered has been validated!");
			}
		}
		
		
		System.out.println("Please enter your phone number (xxx-xxx-xxxx):");
		while (phoneReturn == false) {
			userPhone = scnr.nextLine();
			phoneReturn = validatePhone(userPhone);
			if (phoneReturn == false){
				System.out.println("Make sure you entered your phone number correctly.");
				System.out.println("Please enter your phone number again:");
			}
			else{
				System.out.println("The phone number you entered has been validated!");
			}
		}
		
		System.out.println("Please enter a date(mm/dd/yyyy):");
		while (dateReturn == false) {
			userDate = scnr.nextLine();
			dateReturn = validateDate(userDate);
			System.out.println(dateReturn);
			if (dateReturn == false){
				System.out.println("Make sure you entered a date correctly.");
				System.out.println("Please enter a date again:");
			}
			else{
				System.out.println("The date you entered has been validated!");
			}
		}
	}
	
	public static boolean validateName(String name){
		if (name.matches("[A-Z][a-z]+ [A-Z][a-z]+")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean validateEmail(String email){
		if (email.matches("[a-zA-Z\\d]*@[a-zA-Z]+.[a-z]+")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean validatePhone(String phone){
		if (phone.matches("[\\d]{3}-[\\d]{3}-[\\d]{4}")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean validateDate(String date){
		if (date.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}")) {
			return true;
		}
		else {
			return false;
		}
	}
}
