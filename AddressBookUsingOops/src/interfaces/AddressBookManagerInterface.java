package interfaces;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import addressbook.Person;

public interface AddressBookManagerInterface {
	public void newAddressBook();
	public void openAddressBook() throws FileNotFoundException;
	public void saveAddressBook(String Filename, ArrayList<Person> saveaddressbook) throws FileNotFoundException;
	public void saveasAddressBook(String oldFileName,String newFileName);
	public void closeAddressBook();
	public void quit();
}  
