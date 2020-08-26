package interfaces;

import java.util.ArrayList;

import addressbook.Person;

public interface AddressBookInterface {
	ArrayList<Person> addPerson(String Filename);
	ArrayList<Person> editPerson(String Filename);
	ArrayList<Person> deletePerson(String Filename);
	ArrayList<Person> searchPerson(String Filename) throws Throwable;
	ArrayList<Person> sortByZip(String Filename);
	ArrayList<Person> sortByName(String Filename);
	public void display();
	
	
}
