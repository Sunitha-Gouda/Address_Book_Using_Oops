package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.AddressBookInterface;

public class AddressBookImplementation  implements AddressBookInterface {
		String firstName;
		String lastName;
		String city;
		String state;
		int  zipcode;
		String phoneNumber;
		Scanner sc=new Scanner(System.in);
		ArrayList<Person> personarraylist=new ArrayList<Person>();
		Person person;
		ReadWrite RW=new ReadWrite();

		@Override
		public ArrayList<Person> addPerson(String Filename) {
			ArrayList<Person> person=null;
			try {
				person = RW.Readcsv(Filename);
			} catch (Throwable e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("How many person's data you want to add???");
			int numOfPerson=sc.nextInt();
			for (int i = 0; i < numOfPerson; i++) {
				System.out.println("Enter Firstname :");
				firstName=sc.next();
				System.out.println("Enter Lastname :");
				lastName=sc.next();
				System.out.println("Enter city:");
				city=sc.next();
				System.out.println("Enter state:");
				state=sc.next();
				System.out.println("Enter zipcode:");
				zipcode=sc.nextInt();
				System.out.println("Enter mobilenumber");
				phoneNumber=sc.next();
				person.add(new Person(firstName, lastName , city, state,zipcode, phoneNumber));
				System.out.println(person.size());
			}
			System.out.println("Person details  are added");
			System.out.println(" Do you want to save your data ??? ");
			System.out.println("Press 3  to save ur data ");
			return person;
		}
		
	@Override
	public ArrayList<Person> editPerson(String Filename) {
		ArrayList<Person> editpersondetails=null;
		try {
			editpersondetails = RW.Readcsv(Filename);
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Enter PhoneNumber to  edit person details");
		String search =sc.next();
		System.out.println("search number::"+search);
		for(int i=0; i<editpersondetails.size();i++) {
		String Number=editpersondetails.get(i).getPhoneNumber();
		System.out.println("search number::"+Number);
		if(search.equalsIgnoreCase(Number)) {
			System.out.println("Enter firstname: ");
			firstName=sc.next();
			System.out.println("Enter lastname:");
			lastName=sc.next();
			System.out.println("Enter city:");
			city=sc.next();
			System.out.println("Enter state");
			state=sc.next();
			System.out.println("Enter zipcode:");
			zipcode=sc.nextInt();
			System.out.println("Enter phoneNumber:");
			phoneNumber=sc.next();
			Person edit=editpersondetails.set(i, (new Person(firstName,lastName,city,state,zipcode,phoneNumber)));
		    System.out.println(edit);
		    System.out.println(editpersondetails.get(i));
			}
		}
		return editpersondetails;
	}
	
	
	@Override
	public void deletePerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByZip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}