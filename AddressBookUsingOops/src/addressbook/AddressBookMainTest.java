package addressbook;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMainTest {
	public static void main(String args[]) throws Throwable {
		//Object for two Implementation class
		AddressBookManagerImplementation addressBookManagerImplementation=new AddressBookManagerImplementation();
		AddressBookImplementation addressBookImplementation=new AddressBookImplementation();
		Scanner sc=new Scanner (System.in);
		ArrayList<Person> addressbook=new ArrayList<Person>();
		System.out.println("******     Welcome To Address Book Application     *****");
		while(true) {
			System.out.println("\t\t________________________________________\n"
							+"\t\t|\t1) Create New Address Book\t|\n"
							+"\t\t|\t2) Open Address Book\t\t|\n"
							+"\t\t|\t3) Save Address Book\t\t|\n"
							+"\t\t|\t4) Save As Address Book\t\t|\n"
							+"\t\t|\t5) Close The Addres Book\t|\n"
							+"\t\t|\t6) Quit Address Book\t\t|\n"
							+ "\t\t|_______________________________________|\n");
					
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
				System.out.println("\t\t_________________________________________\n"
						+ "\t\t|\t1.Add Data\t\t\t|\n"
						+ "\t\t|\t2.edit Data\t\t\t|\n"
						+ "\t\t|\t3.delete Data\t\t\t|\n"
						+ "\t\t|\t4.search Data\t\t\t|\n"
						+ "\t\t|\t5.sort by zip Data\t\t|\n"
						+ "\t\t|\t6.sort by name Data\t\t|\n"
						+ "\t\t|\t7.display Data\t\t\t|\n"
						+ "\t\t|_______________________________________|\n");
						
				System.out.println("Enter your choice---");
				int OpenBook=sc.nextInt();
				while(true) {
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
					addressBookImplementation.display(Filename);
					break;
				default :
					System.out.println("\t\t\tWrong data received");
					break;
					
				}
				break;
				}
			case 3:
				System.out.println("Save  your file before adding details");
				System.out.println("Give filename  in which you need to save data");
				String Filename1=sc.next();
				addressBookManagerImplementation.saveAddressBook(Filename1, addressbook);
				System.out.println("Your Data has been saved in file :"+Filename1);
				break;
			case 4:
				/*System.out.println("List of Files Present ");
				File f=new File("E:\\Newfolder\\AddressBook\\src\\");
				String[] s=f.list();
				for (String string1 : s) {
					System.out.println(string1);
				}
				System.out.println("old  file name");
				String oldFileName=sc.next();
				System.out.println("new file  name");
				String newFileName=sc.next();*/
				addressBookManagerImplementation.saveasAddressBook();
				break;
			case 5:
				addressBookManagerImplementation.closeAddressBook();
				break;
			case 6:
				addressBookManagerImplementation.quit();
				break;
			default :
				System.out.println("\t\t\tOops Something went wrong!!!!!!!");
				return;
				}
			
         	}
		
	}
}
