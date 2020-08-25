package addressbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.opencsv.CSVWriter;

public class ReadWrite {
	public void Writecsv(String Filename,ArrayList<Person> addressbook) throws Throwable {
		String path="E:\\Newfolder\\AddressBook\\src"+Filename;
		CSVWriter writer=new CSVWriter(new FileWriter(path));
		String line1[]= {"FirstName","LastName","City","State","ZipCode","PhoneNumber"};
		writer.writeNext(line1);
			for(int i=0;i<addressbook.size();i++) {
				Person index=addressbook.get(i);
		String line2[]= {index.getFirstName(),index.getLastName(),index.getCity(),
		index.getState(),Integer.toString(index.getZipcode()),String.valueOf(index.getPhoneNumber())};
		writer.writeNext(line2);
			}
		writer.flush();
	}
  
	public ArrayList<Person> Readcsv(String Filename) throws Throwable {
	   String path="E:\\Newfolder\\AddressBook\\src"+Filename;
	   BufferedReader BR=new BufferedReader(new FileReader(path));
	   ArrayList<Person> person=new ArrayList<Person>();
	   String line=null;
	   int i=0;
	   	while ((line=BR.readLine())!=null) {
	   	i=i+1;
	   	if (i!=1) {
	   		String[] value=line.split(",");
	   		person.add(new Person(value[0].substring(1,value[0].length()-1),value[1].substring(1,value[1].length()-1),
	   				value[2].substring(1,value[2].length()-1),value[3].substring(1,value[3].length()-1),Integer.parseInt(value[4].substring(1, value[4].length()-1)),(value[5].substring(1, value[5].length()-1))));
	   	}
  }
  BR.close();
  return person;
  }
}