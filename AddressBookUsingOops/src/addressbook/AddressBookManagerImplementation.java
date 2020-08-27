package addressbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
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
		try {
			RW.Writecsv(Filename, personlist);
			}
		catch (Throwable e) {
				e.printStackTrace();
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
	public void saveasAddressBook() {
		// TODO Auto-generated method stub
		String path="E:\\Newfolder\\AddressBook\\src\\";
		System.out.println("List of AddressBook Present in your system");
		File f=new File(path);
		String[] s=f.list();
		for (String string1 : s) {
			System.out.println(string1);
		}
		System.out.println("Enter the AddressBook name which need to be rename ");
		String  filename=sc.next();
		System.out.println("Enter the new Name for your AddressBook");
		String  newname=sc.next();
	    File oldFile=new File((path+filename));
	    File newFile=new File((path+newname));
			boolean b=oldFile.renameTo(newFile);
			if (b==true) {
				System.out.println("File renamed "+filename+" to the "  +newname);
			}
			else {
				System.out.println("File has not Renamed!!!!!Try again !!!!");
			}
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
		}
		catch ( Exception e) {
		e.printStackTrace();
		}
		System.out.println("AddressBook closed");
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
