package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.AddressBookManagerInterface;

public class AddressBookManagerImplementation implements AddressBookManagerInterface {
	String firstName;
	String lastName;
	String city;
	String state;
	int zipcode;
	String phoneNumber;
	Scanner sc=new Scanner(System.in);
	ArrayList<Person> personlist=new ArrayList<Person>();
	Person person;
	ReadWrite RW=new ReadWrite();

	@Override
	public void newAddressBook() {
		System.out.println("----Creating  a new file-----");
		System.out.println("Create a  new file with (.csv) extension");
		String Filename=sc.next();
		System.out.println("How many contancts you are gonna add to Addressbook????");
		
		int numberOfContacts=sc.nextInt();
		for(int i=0;i<=numberOfContacts;i++) {
			System.out.println("Enter your Firstname :");
			firstName=sc.next();
			System.out.println("Enter your Lastname :");
			lastName=sc.next();
			System.out.println("Enter your city:");
			city=sc.next();
			System.out.println("Enter your state:");
			state=sc.next();
			System.out.println("Enter area zipcode:");
			zipcode=sc.nextInt();
			System.out.println("Enter your mobilenumber");
			phoneNumber=sc.next();
			personlist.add(new Person(firstName,lastName,city,state,zipcode,phoneNumber));
			//Exception 
			try {
				RW.Writecsv(Filename, personlist);
			}
			catch (Throwable e) {
				e.printStackTrace();
			}
		}
			System.out.println("New AddressBook Created");
			}


	@Override
	public void openAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveasAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
