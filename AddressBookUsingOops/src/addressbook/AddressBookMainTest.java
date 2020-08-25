package addressbook;

import java.util.Scanner;

public class AddressBookMainTest {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
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
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
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
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
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
				case 7:
					System.out.println("Seven");
					break;
				}
				break;
			case 3:
				System.out.println("Three");
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
