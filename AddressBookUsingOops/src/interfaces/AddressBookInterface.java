package interfaces;

import java.util.ArrayList;

import addressbook.Person;

public interface AddressBookInterface {
	ArrayList<Person> addPerson(String Filename);
	public void editPerson();
	public void deletePerson();
	public void searchPerson();
	public void sortByZip();
	public void sortByName();
	public void display();
	
}
