package interfaces;

import java.util.ArrayList;

import addressbook.Person;

public interface AddressBookInterface {
	ArrayList<Person> addPerson(String Filename);
	ArrayList<Person> editPerson(String Filename);
	ArrayList<Person> deletePerson(String Filename);
	public void searchPerson();
	public void sortByZip();
	public void sortByName();
	public void display();
}
