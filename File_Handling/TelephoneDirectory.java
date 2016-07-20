package File_Handling;
import java.io.*;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

/*
 * This program lets the user keep a persistent " phone book" that contains names and numbers.The data for the phone book is stored in 
 * a file in the user's home directory.
 * 
 * The phone book data is stored in the form of Name/Number pairs, with little error checking .
 */

public class TelephoneDirectory 
{
	//The name of the file in which records will stored 
	private static String fileName= ".phone_book";
	private static Scanner scan;
	private static Scanner in;
	
	
	public static void main(String[] args)
	{
		//Name and number of an entry in the directory
		String name, number;
		
		TreeMap<String, String> phoneBook; //Phone directory data structure
		//Enties the name/number pairs.
		
		phoneBook= new TreeMap<String,String>();
		
		//Create a dataFile variable of type File to represent the data file that is stored in the user's home directory.
		File userHomeDirectory =  new File(System.getProperty("user.home"));
		File dataFile = new File(userHomeDirectory, fileName);
		
		/*If the data file already exists, then the data in the file is read and is used to initialize the phone directory.
		 * The format of the file must be as follows: Each line of the file represents one directory entry, with the name 
		 * snd the number of that entry separated by the character '%'. I f a file exists but does not have its format,
		 * then the program terminates; This is done to avoid overwriting a file being used for another purpose
		 */
		
		if(!dataFile.exists())
		{
			System.out.println("No phone book data file found");
			System.out.println("A new one will be created");
			System.out.println("File name : "+ dataFile.getAbsolutePath());
		}
		
		else
		{
			System.out.println("\tW     W    EEEEEE    L         CCCCCC     OOOOO     MM   MM    EEEEEE");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\tW     W    E         L        C          O     O    M M M M    E     ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\tW     W    E 	     L        C          O     O    M  M  M    E     ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\tW  W  W    EEEE      L        C          O     O    M     M    EEEE  ");				
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\tW W W W    E	     L        C          O     O    M     M    E     ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\tWW   WW    EEEEEE    LLLLLL    CCCCCC     OOOOO     M     M    EEEEEE");		
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Reading phone book data...");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try
			{
				scan = new Scanner(dataFile);
				while(scan.hasNextLine())
				{
					String phoneEntry = scan.nextLine();
					int separatorPosition = phoneEntry.indexOf('%');
					
					if(separatorPosition==-1)
					{
						throw new IOException("FIle is not a file");
					}
					
					name= phoneEntry.substring(0, separatorPosition);
					number = phoneEntry.substring(separatorPosition+1);
					phoneBook.put(name, number);
				}
			}
			
			catch(IOException e)
			{
				System.out.println("Error in phone book data file.");
				System.out.println("File name : "+ dataFile.getAbsolutePath());
				System.out.println("This program cannot continue");
				
				System.exit(1);
			}
		}
		
		//Read commands from the user and carry them out, until the user the "Exit from program" command
		 
		in = new Scanner(System.in);
		
		//Have any changes have been made to the directory?
		boolean changed =false;
		 
		mainLoop: while(true)
		{
			System.out.println("\nSelect the action that you want to perform: \n");
			//delays text by 200ms
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("1. Look up phone number\n");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("2. Add or change phone number\n");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("3. Remove enty from directory\n");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("4. Show all\n");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("5.Exit\n");
			
			int command;
			
			if(in.hasNextInt())
			{
				command = in.nextInt();
				in.nextLine();
			}
			
			else
			{
				System.out.println("Invalid entry");
				in.nextLine();
				continue;
			}
			
			switch(command)
			{
			case 1 : System.out.print("enter name whose number to look up: ");
					 name = in.nextLine().trim().toLowerCase();
					 number = phoneBook.get(name);
					 
					 if(number==null)
					 {
						 System.out.println("\nSorry, no number found for" + name);
					 }
					 else
					 {
						 System.out.println("Number for " + name + "is " + number);
					 }
					 break;
					 
			case 2 : 
				 	 System.out.println("Enter a name: ");
				 	 name = in.nextLine().trim().toLowerCase();
				 	 if(name.length()==0)
				 	 {
						 System.out.println("Please enter a valid name");
					 }
				 	 else if(name.indexOf('%')>=0)
				 	 {
				 		 System.out.println("Name cannot contain the character \"%\".");
				 	 }
				 	 else
				 	 {
				 		 System.out.println("Enter a phone number: ");
				 		 number = in.nextLine().trim().toLowerCase();
				 		 if(number.length()==0)
				 		 {
				 			 System.out.println("Please enter a valid number");
				 		 }
				 		 
				 		 else
				 		 {		
				 			 phoneBook.put(name,number);
				 			 changed = true;
					 			
				 		 }	
				 	 }
				 	 
				 	 break;
			
			case 3 : System.out.print("enter name whose number to remove: ");
			 		 name = in.nextLine().trim().toLowerCase();
			 		 number = phoneBook.get(name);
			 		 if(number==null)
			 		 {
			 			 System.out.println("Sorry, there is no entry for "+ name);
			 		 }
			 		 else
			 		 {
			 			 phoneBook.remove(name);
			 			 changed = true;
			 			 
			 			// this code below is to slow down the arrival of data on screen by 300 milliseconds 
			 			try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			 			
			 			 System.out.println("\nDIRECTORY ENTRY REMOVED FOR"+ name);
			 		 }
			 		 
			 		 break;
			 
			case 4 : System.out.println("\nLIST OF ENTRIES:\n");
					 for(Map.Entry<String, String> entry : phoneBook.entrySet())
					 {
						 try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						 System.out.println("  " + entry.getKey() + ": " + entry.getValue());
					 }
					 
					 break;
					
			case 5 : System.out.println("\nExiting program");
					 break mainLoop;
					 
			default : System.out.println("\nIllegal action");
		}
	}

		
		//Before ending the program, write the current contents of the phone directory, but only if any changes have taken place
		 if(changed)
		 {
			 System.out.println("Saving phone directory changes to file "+ dataFile.getAbsolutePath() + " .....");
			 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 PrintWriter out = null;
			 try
			 {
				 out = new PrintWriter(new FileWriter(dataFile));
			 }
			 catch(IOException e)
			 {
				 System.out.println("ERROR: Can't open data file");
			 }
			 
			 for(Map.Entry<String, String> entry : phoneBook.entrySet())
			 {
				 out.println(entry.getKey()+ "%" + entry.getValue());
			 }
			 out.close();
			 
			 if(out.checkError())
			 {
				 System.out.println("ERROR: some error occured while writing file");
			 }
			 else
			 {
				 System.out.println("DONE");
			 }
		 }
	}
}


/*
 * TELEPHONE DIRECTORY IN C++
#include<fstream.h>
#include<conio.h>
#include<stdio.h>
#include<string.h>
#include<dos.h>

 * class student
 
{
private:
	 char name[20];
	 char phone_no[12];
	 char city[25];
	 float pin;
public:
	 void input()
	 {
		cout<<"enter name : ";
		gets(name);
		cout<<"enter city of residence : ";
		gets(city);
		cout<<"enter phone number : ";
		gets(phone_no);
		cout<<"enter pin number : ";
		cin>>pin;

	}
	 void display()
	 {
		cout<<"* Name : "<< name<<endl;
		cout<<"* Phone number  : "<<phone_no<<endl;
		cout<<"* City: "<<city<<endl;
		cout<<"* Pin : "<<pin<<endl;
	 }

	 char *retname()
	 {
		return name;
	 }
	 char *retphone_no()
	 {
		return phone_no;
	 }
	 char *retcity()
	 {
		return city;
	 }
	 float retpin()
	 {
		return pin;
	 }
};
void create_data();
void display_data();
void add_data();
void name_search();
void no_search();
void city_search();
void pin_search();
void delete_data();


	 void create_data()
	 {
		fstream f;
		student s;
		s.input();
		f.open("data.dat",ios::out| ios::binary);
		f.write((char*) &s,sizeof(s));
		f.close();
	 }
	 void display_data()
	 {
		fstream f;
		student s;
		f.open("data.dat",ios :: in|ios :: binary);
		while(f)
		{
		f.read((char*) &s,sizeof(s));
			if(f.eof())
		{
		break;
		}
			s.display();
		}
		f.close();
		getch();
	 }
	 void add_data()
	 {
		fstream f;
		student s;
		s.input();
		f.open("data.dat",ios::app|ios::binary);
		f.write((char*) &s,sizeof(s));
		f.close();
	 }
	 void name_search()
	 {
		char n[20];
		int j=0;
		fstream f;
		student s;
		cout<<"enter the name to be searched : ";
		gets(n);
		f.open("data.dat",ios::in|ios::binary);
		while(f)
		{
		f.read((char*)&s,sizeof(s));
			if(f.eof())
			{
				break;
			}
			if(strcmpi(s.retname(),n)==0)
			{
				s.display();
				j=1;
			}
		}
		if(j==0)
		{
			cout<<"record does not exist\n ";
			getch();
		}
		f.close();
	 }
	 void no_search()
	 {
		char a[12];
		int j=0;
		fstream f;
		student s;
		cout<<"enter the phone number to be searched : ";
		gets(a);

		f.open("data.dat ",ios::in|ios::binary);
		while(f)
		{
		f.read((char*)&s,sizeof(s));
			if(f.eof())
			{
				break;
			}
		   if(strcmpi(a,s.retphone_no())==0)
			{
				s.display();
				j=1;
			}

		}
		if(j==0)
		{
			cout<<"record does not exist\n ";
			getch();
		}
		f.close();
	 }
	 void city_search()
	 {
		char a[25];
		int j=0;
		fstream f;
		student s;
		cout<<"Enter the name of city to be searched :";
		gets(a);
		f.open("data.dat",ios:: in| ios:: binary);
		while(f)
		{

			f.read((char*)&s, sizeof(s));
			if(f.eof())
			{
				break;
			}
			if(strcmpi(a,s.retcity())==0)
			{
				s.display();
				j=1;
			}
		}
		f.close();

		if(j==0)
		{
			cout<<"Sorry,record does not exist\n";
			getch();
		}
	 }
	 void pin_search()
	 {
		int j=0;
		float a;
		student s;
		fstream f;
		cout<<"enter pin to be searched : ";
		cin>>a;
		f.open("data.dat",ios::in|ios::binary);

			while(f)
			{
				f.read((char*)&s,sizeof(s));
				if(f.eof())
				{
					break;
				}
				if(a==s.retpin())
				{
					j=1;
					s.display();
				}
			}
		f.close();
		if(j==0)
		{
			cout<<"sorry record does not exist ";
			cout<<endl;
			getch();
		}
	 }

	 void delete_record()
	 {
		char a[30];
		int l=0;
		fstream f;
		fstream j;
		student s;
		cout<<"enter name of the record to be deleted : ";
		gets(a);
		f.open("data.dat",ios::in| ios::binary);
		j.open("temp.dat",ios::out| ios::binary);
		while(f)
		{
		     f.read((char*)&s,sizeof(s));
		     if(f.eof())
		     {
			break;
		     }
		     if(strcmpi(a,s.retname())!=0)
		     {
			   j.write((char*)&s,sizeof(s));
		     }
		     else
		     {
			   l++;
		     }
		}
		if(l==0)
		{
			cout<<"sorry, record does not exist "<<endl;
		}
		else
		{
			cout<<"number of records deleted is "<<l<<endl;
		}
		j.close();
		f.close();
		remove("data.dat");

		rename("temp.dat","data.dat");


	 }




void main()
{
clrscr();
fstream f;
student s;
int y;
int x;


cout<<"\n\n\n";
for(x=1;x<=78;x++)
{
      delay(20);
      cout<<"*";

}

   delay(100);	cout<<"*                                                                              *"<<endl;
   delay(100);	cout<<"*                                                                            *"<<endl;
   delay(100);	cout<<"*                   							     *"<<endl;
   delay(100);	cout<<"*							                     *"<<endl;
   delay(100);	cout<<"*                                                                            *"<<endl;
   delay(100);	cout<<"*            W      W  EEEEE   L       CCCC   OOO    MM    MM   EEEEE        *"<<endl;
   delay(100);	cout<<"*            W      W  E       L      C      O   O   M M  M M   E            *"<<endl;
   delay(100);	cout<<"*            W  WW  W  EEE     L      C      O   O   M  MM  M   EEE          *"<<endl;
   delay(100);	cout<<"*            W W  W W  E       L      C      O   O   M      M   E            *"<<endl;
   delay(100);	cout<<"*            WW    WW  EEEEE   LLLLL   CCCC   OOO    M      M   EEEEE        *"<<endl;
   delay(100);	cout<<"*                                                                            *"<<endl;
   delay(100);	cout<<"*                                                                            *"<<endl;
   delay(100);	cout<<"*                                                                            *"<<endl;
   delay(100);	cout<<"*                                                                            *"<<endl;
   delay(100);	cout<<"*                                                                            *"<<endl;
   delay(100);	cout<<"*                                                                            *"<<endl;

   for(x=1;x<=78;x++)
   {
       delay(20);
	cout<<"*";
   }
   cout<<"\n\npress enter to go to main menu : ";
getch();
clrscr();
   delay(80);	cout<<"\t ***********************************************************"<<endl;
   delay(80);	cout<<"\t*\t                                            \t  *"<<endl;
   delay(80);	cout<<"\t*\t      *"<<endl;
   delay(80);	cout<<"\t*\t                                          \t*"<<endl;
   delay(80);	cout<<"\t*\t  1. feed in data                         \t*"<<endl;
   delay(80);	cout<<"\t*\t------------------------------------------\t*"<<endl;
   delay(80);	cout<<"\t*\t  2. view data                            \t*"<<endl;
   delay(80);	cout<<"\t*\t------------------------------------------\t*"<<endl;
   delay(80);	cout<<"\t*\t  3. update data                          \t*"<<endl;
   delay(80);	cout<<"\t*\t------------------------------------------\t*"<<endl;
   delay(80);	cout<<"\t*\t  4. search data by name                  \t*"<<endl;
   delay(80);	cout<<"\t*\t------------------------------------------\t*"<<endl;
   delay(80);	cout<<"\t*\t  5. search data by city of residence     \t*"<<endl;
   delay(80);	cout<<"\t*\t------------------------------------------\t*"<<endl;
   delay(80);	cout<<"\t*\t  6. search data by phone number          \t*"<<endl;
   delay(80);	cout<<"\t*\t------------------------------------------\t*"<<endl;
   delay(80);	cout<<"\t*\t  7. search data by pin number            \t*"<<endl;
   delay(80);	cout<<"\t*\t------------------------------------------\t*"<<endl;
   delay(80);	cout<<"\t*\t  8. delete data                          \t*"<<endl;
   delay(80);	cout<<"\t*\t------------------------------------------\t*"<<endl;
   delay(80);	cout<<"\t*\t  9. exit                                 \t*"<<endl;
   delay(80);	cout<<"\t*\t                                          \t*"<<endl;
   delay(80);	cout<<"\t*\t      *"<<endl;
   delay(80);	cout<<"\t***********************************************************"<<endl;
int c;
do
{
cout<<"enter choice : ";
cin>>c;
switch(c)
{
	case 1:
		create_data();
		break;
	case 2:
		display_data();
		break;
	case 3:
		add_data();
		break;
	case 4: name_search();
		break;
	case 5: city_search();
		break;
	case 6 : no_search();
		 break;
	case 7 : pin_search();
		break;
	case 8 : delete_record();
		 break;
	default: cout<<"The program will now quit ";

	 break;

}
}
while(c<=8);
getch();
}
*/ 