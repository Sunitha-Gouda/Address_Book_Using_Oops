package addressbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.nio.file.FileSystemNotFoundException;
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
	public void openAddressBook() throws FileNotFoundException {
		System.out.println("Following are the addressbook which are present in system");
		File file=new File("E:\\Newfolder\\AddressBook\\src\\");
		FilenameFilter  filter=new FilenameFilter() {
			@Override
			public boolean accept(File file ,String name) {
				return name.endsWith(".csv");
		}
		};
		File[] files=file.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println("\t\t"+files[i].getName());
		}
	}
     
	
	@Override
	public void saveAddressBook( String Filename, ArrayList<Person> saveaddressbook ) throws FileNotFoundException {
		try {
			RW .Writecsv(Filename, saveaddressbook);
			} catch (Throwable e ) {
			e.printStackTrace();
			}
		
	}

	@Override
	public void saveasAddressBook(String oldFileName,String newFileName) {
		// TODO Auto-generated method stub
	String file1="E:\\Newfolder\\AddressBook\\src\\"+oldFileName;
	String file2="E:\\Newfolder\\AddressBook\\src\\"+newFileName;
			File oldName=new File(file1);
			File newName=new File(file2);
			if(oldName.renameTo(newName))
			System.out.println("File renamed and content has been copied");
	}
	

	@Override
	public void closeAddressBook() {
			// TODO Auto-generated method stub
		try
		{
		String s="hello!!!!!!!";
		Scanner scanner=new Scanner(s);
		System.out.println("Scanner:"+scanner.nextLine());
		scanner.close();
		System.out.println("Closing the window!!!!!");
		System.out.println("Trying to use scanner"+"Aftr closing.");
		System.out.println(scanner.nextLine());
		}
		catch (Exception e) {
			System.out.println("Exception thrown:\n" + e);
		}
		return;
		
	}
	
	@Override
	public void quit() {
		// TODO Auto-generated method stub
		System.out.println("please confirm  do u want to exit(Yes/NO)");
		String exit=sc.next();
		if(exit.equalsIgnoreCase("Yes"))
			System.exit(0);
			return;
		
	}

}
