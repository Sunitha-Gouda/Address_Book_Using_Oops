package addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		ArrayList<Person> addressBookList=new ArrayList<Person>();
		Person person;
		ReadWrite RW=new ReadWrite();
		public String patternPhoneNumber = "^[0-9]{10}";
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
				
				boolean flag = phoneNumber.matches(patternPhoneNumber);

				while (flag == false) {
					System.out.println("Enter Phone Number with 10 digit between 0-9 :");
					phoneNumber = sc.next();
					flag = phoneNumber.matches(patternPhoneNumber);
				}
		
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
		String searchNumber =sc.next();
		System.out.println("edit Number::"+searchNumber);
		
		for(int i=0; i<editpersondetails.size();i++) {
		String Number=editpersondetails.get(i).getPhoneNumber();

		if(searchNumber.equalsIgnoreCase(Number)) {
		
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
	public ArrayList<Person> deletePerson(String Filename) {
		ArrayList<Person> delPerson=null;
		try {
			delPerson = RW.Readcsv(Filename);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		System.out.println("size of addreebook before deleting a user = "+delPerson.size());
		System.out.println("Enter the  phoneNumber to delete person ");
		String PhoneNumber=sc.next();
		System.out.println("PhoneNumber=" +PhoneNumber);
		for(int i=0;i<delPerson.size();i++) {
			if(PhoneNumber.equalsIgnoreCase(delPerson.get(i).getPhoneNumber())) {
				System.out.println(delPerson.get(i));
				delPerson.remove(i);
			}
		}
		System.out.println("size of addreebook after deleting a user = "+delPerson.size());
		System.out.println("Entered Phonenumber along with data has been Deleted!!!!");
		return delPerson;
	}
	

	@Override
	public ArrayList<Person> searchPerson(String Filename)throws Throwable {
		ArrayList<Person> person=null;
		try {
			person=RW.Readcsv(Filename);

			} catch (Throwable e) {
			e.printStackTrace();
			}
		System.out.println("Enter search person details");
		String search=sc.next();
		System.out.println("search" +search);
			for(int i=0;i<person.size();i++) {
				if(search.equalsIgnoreCase(person.get(i).getPhoneNumber())) {
					System.out.println(person.get(i));
				}
			}
		return person;
	}

	
	@Override
	public ArrayList<Person> sortByZip(String Filename) {
		// TODO Auto-generated method stub
		ArrayList<Person> addressBookList=null;
		try {
			addressBookList=RW.Readcsv(Filename);

			} catch (Throwable e) {
			e.printStackTrace();
			}
		     Comparator<Person> personzipComparator=Comparator.comparingInt(Person :: getZipcode);
			 Collections.sort(addressBookList,personzipComparator);
			 	for(Person sortbyzipcode:addressBookList) {
			        System.out.println(sortbyzipcode.toString());
			 	}
			 	System.out.println("!!!!Sorted According to ZipCode!!!!");
			 	return addressBookList;
	}

	
	@Override
	public ArrayList<Person> sortByName(String Filename) {
		ArrayList<Person> sortByName=null;
		try {
			sortByName = RW.Readcsv(Filename);
		} catch (Throwable e) {
		e.printStackTrace();
		}
		System.out.println("!!!!!!Sorted According to Alphabetical Order!!!!!");
		Collections.sort(sortByName,(o1,o2) ->o1.getFirstName().compareToIgnoreCase(o2.getFirstName()));
			for(Person sortname:sortByName) {
				System.out.println(sortname.toString());
			}
			return sortByName;
	}
	

	@Override
	public void display(String Filename) {
		// TODO Auto-generated method stub
		ArrayList<Person> addressbook = null;
		try {
		addressbook = RW.Readcsv(Filename);
		} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		        for(Person displayaddressbook:addressbook) {
		        System.out.println(displayaddressbook.toString());
		        }


		}
		
	}
	
