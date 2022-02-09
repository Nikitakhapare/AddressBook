package com.oops.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddMultipleAddBook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CreateAddBook a=new CreateAddBook();
		int choice;
		int ans;
		do {
			System.out.println("Enetr Name of address book you want to create");
			String name=sc.next();
			System.out.println("Enter Choice \n 1:Add contact \n 2: Edit Contact \n "
					+ "3: Delate Contact \n 4: Add Multiple Contact \n Display Details");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
				a.addContact();
				break;
			case 2: 
				a.editContact();
				break;
			case 3: 
				a.deleteContact();
				break;
			case 4:
				a.addMultipleContact();
				break;
			case 5:
				a.displayContact();
				break;
			default:	
			}
			System.out.println("Enter 1 if you want to continue");
			ans=sc.nextInt();
		}while(ans==1);
	}	

}


