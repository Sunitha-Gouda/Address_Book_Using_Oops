package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMainTest {
	public static void main(String args[]) throws Throwable {
		//Object for two Implementation class
		AddressBookManagerImplementation addressBookManagerImplementation=new AddressBookManagerImplementation();
		AddressBookImplementation addressBookImplementation=new AddressBookImplementation();
		Scanner sc=new Scanner (System.in);
		ArrayList<Person> addressbook=new ArrayList<Person>();
		ReadWrite RW=new ReadWrite();
		System.out.println("******Welcome To Address Book Application*****");
		while(true) {
			System.out.println("\t\t1) Create New Address Book\n"
								+"\t\t2) Open New Address Book \n"
								+"\t\t3)  Save Address Book \n"
								+"\t\t4) Save As Address Book \n"
								+"\t\t5) Close The Addres Book \n"
								+"\t\t6) Quit");
					
			System.out.println("Please Enter Your Choice ::");
			
			int choiceOption=sc.nextInt();
			switch(choiceOption) {
			case 1:
				addressBookManagerImplementation.newAddressBook();
				break;
			case 2:
				addressBookManagerImplementation.openAddressBook();
				System.out.println("Which file do you need to open::");
				String Filename=sc.next();
				System.out.println("\t\t1.Add Data\n"
						+ "\t\t2.edit Data\n"
						+ "\t\t3.delete Data\n"
						+ "\t\t4.search Data\n"
						+ "\t\t5.sort by zip Data\n"
						+ "\t\t6.sort by name Data\n"
						+ "\t\t7.display Data\n");
						
				System.out.println("Enter your choice---");
				int OpenBook=sc.nextInt();
				switch(OpenBook) {
				case 1:
					addressbook=addressBookImplementation.addPerson(Filename);
					break;
				case 2:
					addressbook=addressBookImplementation.editPerson(Filename);
					break;
				case 3:
					addressbook=addressBookImplementation.deletePerson(Filename);
					break;
				case 4:
					addressbook=addressBookImplementation.searchPerson(Filename);
					break;
				case 5:
					addressbook=addressBookImplementation.sortByZip(Filename);
					break;
				case 6:
					addressbook=addressBookImplementation.sortByName(Filename);
					break;
				case 7:
					System.out.println("Seven");
					break;
				default :
					System.out.println("Enter choice correctly!!!");
					return;
				}
				break;
			case 3:
				System.out.println("Save  your file before adding details");
				System.out.println("Give filename  in which you need to save data");
				Filename=sc.next();
				addressBookManagerImplementation.saveAddressBook(Filename, addressbook);
				System.out.println("Your file has been saved ");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			default :
				System.out.println("Invalid choice!!!!!!!");
				return;
				}
			
         	}
		
	}
}
