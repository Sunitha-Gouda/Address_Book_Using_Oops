package interfaces;

import java.util.ArrayList;

import addressbook.Person;

public interface AddressBookManagerInterface {
	public void newAddressBook();
	public void openAddressBook();
	public void saveAddressBook(String Filename, ArrayList<Person> saveaddressbook);
	public void saveasAddressBook();
	public void closeAddressBook();
	public void quit();
}  
