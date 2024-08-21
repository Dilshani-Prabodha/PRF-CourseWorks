import java.util.*;
import java.time.LocalDate;
class iFriendContactOrganizer{
//--------------CREATE GLOBAL ARRAYS-----------------------------------------
	public static int counter = 1;
	public static String[] IDArray = new String[0];
	public static String[] nameArray = new String[0];
	public static String[] phone_numberArray = new String[0];
	public static String[] company_nameArray = new String[0];
	public static double[] salaryArray = new double[0];
	public static String[] B_dayArray = new String[0];
	
	
//---------------MAIN METHOD--------------------------------------------------
	public static void main(String args[]){
		HomePage();
	}
	
//--------------HOME PAGE METHOD--------------------------------------------------------------------------------------
	public static void HomePage(){
	Scanner input = new Scanner(System.in); 
		System.out.println("		/$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$");
		System.out.println("		|__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
		System.out.println("		 /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
		System.out.println("		| $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
		System.out.println("		| $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
		System.out.println("		| $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
		System.out.println("		| $$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
		System.out.println("		|__/|__/      |__/  |__/ |_____/|________/|__/  \\__/|_______/");

		System.out.println('\n');

		System.out.println("  _____             _             _          ____                        _              ");
		System.out.println(" / ____|           | |           | |        / __ \\                      (_)             ");
		System.out.println("| |      ___  _ __ | |_ __ _  ___| |_ ___  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __ ");
		System.out.println("| |     / _ \\| '_ \\| __/ _` |/ __| __/ __| | |  | | '__/ _` |/ _` | '_ \\| |_  / _ \\ '__|");
		System.out.println("| |____| (_) | | | | || |_| | |__| |_\\__ \\ | |__| | | | |_| | |_| | | | | |/ /  __/ |   ");
		System.out.println(" \\______\\___/|_| |_|\\__\\__,_|\\___|\\__|___/  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|   ");
		System.out.println("                                                        __/ |                           ");
		System.out.println("                                                       |___/                            ");
		
		System.out.println();
		
		System.out.println("==========================================================================================");

		System.out.println('\n');
		
		System.out.println("\t[01] ADD Contacts");
		System.out.println();
		System.out.println("\t[02] UPDATE Contacts");
		System.out.println();
		System.out.println("\t[03] DELETE Contacts");
		System.out.println();
		System.out.println("\t[04] SEARCH Contacts");
		System.out.println();
		System.out.println("\t[05] LIST Contacts");
		System.out.println();
		System.out.println("\t[06] Exit\n\n");
		
		System.out.print("Enter an option to continue -> ");
		int option = input.nextInt();
		
		switch (option){
			case 1 : 
			clearConsole();
			AddContacts();
			break;
			
			case 2 :
			clearConsole();
			UpdateContacts();
			break;
			
			case 3 :
			clearConsole();
			DeleteContacts();
			break;
			
			case 4 :
			clearConsole();
				System.out.println("+------------------------------------------------------+");
				System.out.println("|\t\t SEARCH Contact 		       |");
				System.out.println("+------------------------------------------------------+\n"); 
				
				SearchContacts();
			
				System.out.print("Do you want to search another contact (Y/N): ");
				char ch = input.next().charAt(0);
					if(ch=='Y' || ch=='y'){
						System.out.print("\033[10A");
						System.out.print("\033[0J");
						SearchContacts();
				
			}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
			}				
			break;
			
			case 5 :
			clearConsole();
			ListContact();
			break;
			
			case 6 : System.exit(0);
			break;
			default : System.out.print("\tInvalid Input....Please Try again....");
			break;
		} 
	}
	
//====================CLEAR CONSOL METHOD=============================================================
	
	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
				e.printStackTrace();
		}
	}
	
	
//-------------------Extend Arrays METHOD------------------------------------------------------------------
	public static void ExtendArrays(){
		String[] tempIDArray = new String[IDArray.length+1];
		String[] tempnameArray = new String[nameArray.length+1];
		String[] tempphone_numberArray = new String[phone_numberArray.length+1];
		String[] tempcompany_nameArray = new String[company_nameArray.length+1];
		double[] tempsalaryArray = new double[salaryArray.length+1];
		String[] tempB_dayArray = new String[B_dayArray.length+1];
		
		for(int i=0; i<nameArray.length; i++){
			tempIDArray[i] = IDArray[i];
			tempnameArray[i] = nameArray[i];
			tempphone_numberArray[i] = phone_numberArray[i];
			tempcompany_nameArray[i] = company_nameArray[i];
			tempsalaryArray[i] = salaryArray[i];
			tempB_dayArray[i] = B_dayArray[i];
		}
		
		IDArray = tempIDArray;
		nameArray = tempnameArray;
		phone_numberArray = tempphone_numberArray;
		company_nameArray = tempcompany_nameArray;
		salaryArray = tempsalaryArray;
		B_dayArray = tempB_dayArray; 
	}
			
//---------------------ADD CONTACT METHOD------------------------------------------------------------------------------------
	public static void AddContacts(){
	Scanner input = new Scanner(System.in);
		
		System.out.println("+------------------------------------------------------+");
		System.out.println("|\t\tADD Contact to the list		       |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("\n");
		
		
		String ContactID = GenerateID();
		System.out.println(ContactID);
		System.out.print("========\n");
		System.out.println();
		
		System.out.print("Name             :");
		String name = input.nextLine();
		
		String phone_number;
		
	do{
		System.out.print("Phone Number     :");
		phone_number = input.nextLine();
		CheckPhoneNumber(phone_number);
		
	}while(phone_number.length()!=10 || phone_number.charAt(0)!='0');
		
		
		System.out.print("Company Name     :");
		String company_name = input.nextLine();
		
		double salary;
	do{
		System.out.print("Salary           :");
		salary = input.nextDouble();
		CheckSalary(salary);
		
	}while(salary<=0);
		
		
		LocalDate currentDate = LocalDate.now();
		
		int currentYear = currentDate.getYear();
		int currentMonthValue = currentDate.getMonthValue();
		int currentMonthDate = currentDate.getDayOfMonth();
		
		System.out.print("B'day(YYYY-MM-DD):");
		String B_day = input.next();
		CheckB_day(B_day);
		
	
		ExtendArrays();
		
		IDArray[IDArray.length-1] = ContactID;
		nameArray[nameArray.length-1] = name;
		phone_numberArray[phone_numberArray.length-1] = phone_number;
		company_nameArray[company_nameArray.length-1] = company_name;
		salaryArray[salaryArray.length-1] = salary;
		B_dayArray[B_dayArray.length-1] = B_day;
		
		System.out.println();
		System.out.println("\tcontact has been added successfully...");
		
		System.out.println('\n');
		System.out.print("Do you want to add another contact(Y/N): ");
		char ch = input.next().charAt(0);
		
			if(ch=='Y' || ch=='y'){
				clearConsole();
				AddContacts();
			
			}else if(ch=='N' || ch=='n'){
				clearConsole();
				HomePage();
			}
	}
	
//---------------GenarateContactID METHOD--------------------------------------------------------
	public static String GenerateID(){
		String contactId = String.format("C%04d", counter);
		counter++;
		return contactId;
	}
		
	
//----------------CheckPhoneNumber Method------------------------------------------------------------
	public static void CheckPhoneNumber(String phone_number){
	Scanner input = new Scanner(System.in);
		if(phone_number.length()!=10 || phone_number.charAt(0)!='0'){
				System.out.println();
				System.out.print("\tInvalid phone number...");
				System.out.println();
				System.out.print("Do you want to add phone number again (Y/N): ");
				char ch = input.next().charAt(0);
				if(ch=='Y' || ch=='y'){
					System.out.print("\033[4A");
					System.out.print("\033[0J");
					
				}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
				}
		}
	}
	
//----------------Check Salary Method----------------------------------------------------------------------------
	public static void CheckSalary(double salary){
	Scanner input = new Scanner(System.in);	
		if(salary<=0){
			System.out.println();
			System.out.print("\tInvalid salary...");
			System.out.println();
			System.out.print("Do you want to input salary again (Y/N): ");
			char ch = input.next().charAt(0);
				if(ch=='Y' || ch=='y'){
					System.out.print("\033[4A");
					System.out.print("\033[0J");
					
				}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
				}
			}
		}
		
//--------------------Check Birth day Method-------------------------------------------------
	
	public static void CheckB_day(String B_day){
	Scanner input = new Scanner (System.in);
	LocalDate currentDate = LocalDate.now();
	
		int currentYear = currentDate.getYear();
		int currentMonthValue = currentDate.getMonthValue();
		int currentMonthDate = currentDate.getDayOfMonth();
		
		while(true){
			String year = B_day.substring(0,4);
			String month = B_day.substring(5,7);
			String day = B_day.substring(8,10);
		
			int y =Integer.parseInt(year);
			int m =Integer.parseInt(month);
			int d =Integer.parseInt(day);
	
		if(currentYear<y || (m>12) || ((m==1|m==3|m==5|m==7|m==9)&(d>31))|| ((m==4|m==6|m==8|m==11)&(d>30))||((y%4==0) & (m==2) & d>29)||((y%4!=0) & m==2 & d>28)){
			System.out.println();
			System.out.print("\tInvalid Birthday...");
			System.out.println('\n');
			System.out.print("Do you want to input birthday again (Y/N): ");
			char ch = input.next().charAt(0);
				if(ch=='Y' || ch=='y'){
					System.out.print("\033[5A");
					System.out.print("\033[0J");
					System.out.print("B'day(YYYY-MM-DD):");
					B_day = input.next();
					
			
				}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
				}
		}else{
				break;
		}
		}
	}
	
//-----------------------------UPDATE CONTACT METHOD---------------------------------------------------------------------------
	
	public static void UpdateContacts(){
	Scanner input = new Scanner(System.in); 
		
		System.out.println("+------------------------------------------------------+");
		System.out.println("|\t\tUPDATE Contact 		       	       |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("\n");
		int index = SearchContacts();
		System.out.println('\n');
		System.out.print("What do you want to update...");
		System.out.println();
		System.out.println("\t[01] Name");
		System.out.println("\t[02] Phone Number");
		System.out.println("\t[03] Company Name");
		System.out.println("\t[04] Salary");
		System.out.println("\n");
		System.out.print("Enter an option to contnue -> ");
		int option2 = input.nextInt();
		
		System.out.print("\033[9A");
		System.out.print("\033[0J");
		System.out.println();
		
			switch(option2){
				case 1 :
					UpdateName(index);
					break;
					
				case 2 :
					UpdatePhoneNumber(index);
					break;
					
				case 3 :
					UpdateCompanyName(index);
					break;
					
				case 4 :
					UpdateSalary(index);
					break;
					
			}
		}
			
			
//--------------------Update Name METHOD----------------------------------------------------------------------

	public static void UpdateName(int index){
	Scanner input = new Scanner(System.in); 
		System.out.println(" Update Name");
		System.out.println("=============");
		System.out.println();
		
		
		System.out.print("Input new name - ");
		String newName = input.next();
		nameArray[index] = newName;
		System.out.println();
		System.out.println("\tContact has been update succesfully...");
		System.out.print('\n');
		System.out.print("Do you want to update another contact (Y/N): ");
		char ch = input.next().charAt(0);
			if(ch=='Y' || ch=='y'){
					clearConsole();
					UpdateContacts();
			}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
			}
		
		
	}
	
	
//--------------------Update PhoneNum METHOD-------------------------------------------------------------------------
	public static void UpdatePhoneNumber(int index){
	Scanner input = new Scanner(System.in); 
		System.out.println(" Update Phone Number");		
		System.out.println("=====================");
		System.out.println();
		
		
		System.out.print("Input new phone number - ");
		String newPhoneNum = input.next();
		while(true){
			if(newPhoneNum.length()!=10 || newPhoneNum.charAt(0)!='0'){
				System.out.println();
				System.out.print("\tInvalid phone number...");
				System.out.println();
				System.out.print("Do you want to add phone number again (Y/N): ");
				char ch = input.next().charAt(0);
				if(ch=='Y' || ch=='y'){
					System.out.print("\033[4A");
					System.out.print("\033[0J");
					System.out.print("Input new phone number - ");
					newPhoneNum = input.next();
					
				}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
				}
				
			}else{
				phone_numberArray[index] = newPhoneNum;
				System.out.println();
		
				System.out.println("\tContact has been update succesfully...");
				System.out.print('\n');
				System.out.print("Do you want to update another contact (Y/N): ");
				char ch = input.next().charAt(0);
					if(ch=='Y' || ch=='y'){
						clearConsole();
						UpdateContacts();
					}else if(ch=='N' || ch=='n'){
						clearConsole();
						HomePage();
					}
			}
		}
	}
	
//--------------------Update CompanyName METHOD--------------------------------------------------------

	public static void UpdateCompanyName(int index){
	Scanner input = new Scanner(System.in); 
		System.out.println(" Update Company Name");
		System.out.println("=====================");
		System.out.println();
		
		
		System.out.print("Input new company name - ");
		String newCompanyName = input.next();
		company_nameArray[index] = newCompanyName;
		System.out.println();
		System.out.println("\tContact has been update succesfully...");
		System.out.print('\n');
		System.out.print("Do you want to update another contact (Y/N): ");
		char ch = input.next().charAt(0);
			if(ch=='Y' || ch=='y'){
					clearConsole();
					UpdateContacts();
			}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
			}
	}
		
//---------------------Update Salary METHOD-----------------------------------------------------------------

	public static void UpdateSalary(int index){
	Scanner input = new Scanner(System.in); 
		System.out.println(" Update Salary");
		System.out.println("==============");
		System.out.println();
		
		System.out.print("Input new salary - ");
		double newSalary = input.nextDouble();
		
		while(true){
		if(newSalary<=0){
			System.out.println();
			System.out.print("\tInvalid salary...");
			System.out.println();
			System.out.print("Do you want to input salary again (Y/N): ");
			char ch = input.next().charAt(0);
				if(ch=='Y' || ch=='y'){
					System.out.print("\033[4A");
					System.out.print("\033[0J");
					System.out.print("Input new salary - ");
					newSalary = input.nextDouble();
		
				}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
				}
		}else{
		
		salaryArray[index] = newSalary;
		System.out.println();
		System.out.println("\tContact has been update succesfully...");
		System.out.print('\n');
		System.out.print("Do you want to update another contact (Y/N): ");
		char ch = input.next().charAt(0);
			if(ch=='Y' || ch=='y'){
					UpdateContacts();
			}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
			}
		}
	}
	}
	
//------------------------------------SEARTCH CONTACT METHOD--------------------------------------------------------------------------
	
	public static int SearchContacts(){
	Scanner input = new Scanner(System.in);
			
		String nameORphone;
		while(true){
		System.out.print("Search contact by name or phone number - ");
		nameORphone = input.next();
		
		int index = Search(nameORphone);
		if(index==-1){
			System.out.println();
			System.out.println("\tNo contact found for "+nameORphone+"...");
			System.out.print('\n');
			System.out.print("Do you want to try a new search (Y/N): ");
			char ch = input.next().charAt(0);
			if(ch=='Y' || ch=='y'){
					System.out.print("\033[6A");
					System.out.print("\033[0J");
		
			}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
			}
		
		}else{
			System.out.print('\n');
			System.out.println("\tContact ID       : "+IDArray[index]);
			System.out.println("\tName             : "+nameArray[index]);
			System.out.println("\tPhone Number     : "+phone_numberArray[index]);
			System.out.println("\tCompany Name     : "+company_nameArray[index]);
			System.out.println("\tSalary           : "+salaryArray[index]);
			System.out.println("\tB'Day(YYYY-MM-DD : "+B_dayArray[index]);
			System.out.println();
			
			return index;				
			}
		}
	}
			
//--------------------------------search METHOD--------------------------------------------------------------------------------------
	
		public static int Search(String nameORphone){
			for(int i=0; i<nameArray.length; i++){
				if(nameArray[i].equals(nameORphone)||phone_numberArray[i].equals(nameORphone)){
					return i;
				}
			}
			return -1;
		}
		
//----------------------------------Delete Method--------------------------------------------------------------------
		
	public static void DeleteContacts(){
	Scanner input = new Scanner(System.in); 
		
		System.out.println("+------------------------------------------------------+");
		System.out.println("|\t\tDELETE Contact 		       	       |");
		System.out.println("+------------------------------------------------------+");
		
		int index = SearchContacts();
		System.out.println('\n');
		System.out.print("Do you want to delete this contact (Y/N) : ");
		char ch = input.next().charAt(0);
		System.out.println();
			if(ch=='Y' || ch=='y'){
				for(int i=index; i<nameArray.length-1; i++){
					nameArray[i] = nameArray[i+1];
				
				}
			System.out.println("Contact bas been deleted successfully...");
			System.out.println('\n');
			System.out.print("Do you want to delete another contact (Y/N) : ");
				char ch2 = input.next().charAt(0);
					if(ch2=='Y' || ch2=='y'){
						clearConsole();
						DeleteContacts();
					}else{
						clearConsole();
						HomePage();
					}
			}else if(ch=='N' || ch=='n'){
					clearConsole();
					HomePage();
			}
			
		}
		

//----------------------------------LIST METHOD-----------------------------------------------------------
	
	public static void ListContact(){
	Scanner input = new Scanner(System.in); 
		
		System.out.println("+------------------------------------------------------+");
		System.out.println("|\t\t    SORT Contact 		       |");
		System.out.println("+------------------------------------------------------+\n");
		
		System.out.println("\t[01] Sorting by Name\n");
		System.out.println("\t[02] Sorting by Salary\n");
		System.out.println("\t[03] Sorting by Birthday");
		System.out.println('\n');
		System.out.print("Enter an option to continue -> ");
		int option3 = input.nextInt();
		
			switch(option3){
				
				case 1 :
					clearConsole();
					SortingName();
				break;
				
				case 2 :
					clearConsole();
					SortingSalary();
				break;
				
				case 3 :
					clearConsole();
					SortingBirthday();
				break;
				
			}
	}
	
//-------------------------Sorting Name Method------------------------------------
	public static void SortingName(){
	Scanner input = new Scanner(System.in);
	    System.out.println("\t+------------------------------------------------------+");
        System.out.println("\t|\t         List Contact by Name 	               |");
        System.out.println("\t+------------------------------------------------------+\n");
	
		System.out.println("+--------------------------------------------------------------------------------------------+");
		System.out.printf("|Contact ID   |\t   Name     |   Phone Number |\tCompany      |\tSalary       |\tBirthday     |\n");
		System.out.println("+--------------------------------------------------------------------------------------------+");

		String[] tempSortNameArray = Arrays.copyOf(nameArray, nameArray.length);

		for(int i = 0; i < tempSortNameArray.length - 1; i++){
			for(int j = 0; j < tempSortNameArray.length - i - 1; j++){
				int k = 0;
				while(k < Math.min(tempSortNameArray[j].length(), tempSortNameArray[j+1].length())){
					if(tempSortNameArray[j].charAt(k) > tempSortNameArray[j+1].charAt(k)){
						String tempName = tempSortNameArray[j];
						tempSortNameArray[j] = tempSortNameArray[j+1];
						tempSortNameArray[j+1] = tempName;
                    break;
                    
                } else if(tempSortNameArray[j].charAt(k) == tempSortNameArray[j+1].charAt(k)){
                    k++;
                    
                } else {
                    break;
                    
                }
            }
        }
    }

		for (int a = 0; a < tempSortNameArray.length; a++) {
			int index = 0;
			for (int b = 0; b < nameArray.length; b++) {
				if (nameArray[b].equals(tempSortNameArray[a])) {
					index = b;
                break;
				}
			}

        System.out.printf("|%-12S |%-12S |\t%-12S |\t%-12S |\t%-12.2f |\t%-12S |\n",IDArray[index], nameArray[index], phone_numberArray[index], company_nameArray[index], salaryArray[index], B_dayArray[index]);
    }

		System.out.println("+--------------------------------------------------------------------------------------------+");
    
		System.out.print("Do you want to go home page (Y/N): ");
			char ch3 = input.next().charAt(0);
			if(ch3=='Y' || ch3=='y'){
				clearConsole();
				HomePage();
			}else if(ch3=='N' || ch3=='n'){
				System.exit(0);
			}		
	}
		
//----------------------Sorting Salary Method-----------------------------------------------------------------------------------
		
	public static void SortingSalary() {
	Scanner input = new Scanner (System.in);
        System.out.println("\t+------------------------------------------------------+");
        System.out.println("\t|\t         List Contact by Salary 	       |");
        System.out.println("\t+------------------------------------------------------+\n");

		System.out.println("+--------------------------------------------------------------------------------------------+");
		System.out.printf("|Contact ID   |\t   Name     |   Phone Number |\tCompany      |\tSalary       |\tBirthday     |\n");
		System.out.println("+--------------------------------------------------------------------------------------------+");
    
		double[] tempSortSalaryArray = new double[nameArray.length];
		for (int i = 0; i < nameArray.length; i++) {
				tempSortSalaryArray[i] = salaryArray[i];
		}

		for(int i=0; i<nameArray.length; i++){
				for(int j=0; j<nameArray.length-1; j++){
					if(tempSortSalaryArray[j]>tempSortSalaryArray[j+1]){
							double tempSalary = tempSortSalaryArray[j];
							tempSortSalaryArray[j] = tempSortSalaryArray[j+1];
							tempSortSalaryArray[j+1] = tempSalary;
					}
				}
			}

		for (int i = 0; i < nameArray.length; i++) {
        int index = 0;
        for (int j = 0; j < salaryArray.length; j++) {
            if (salaryArray[j] == tempSortSalaryArray[i]) {
                index = j;
                break;
            }
        }

			System.out.printf("|%-12S |%-12S |\t%-12S |\t%-12S |\t%-12.2f |\t%-12S |\n",IDArray[index], nameArray[index], phone_numberArray[index], company_nameArray[index], salaryArray[index], B_dayArray[index]);
		}

			System.out.println("+--------------------------------------------------------------------------------------------+");
			
			System.out.print("Do you want to go home page (Y/N): ");
			char ch3 = input.next().charAt(0);
			if(ch3=='Y' || ch3=='y'){
				clearConsole();
				HomePage();
			}else if(ch3=='N' || ch3=='n'){
				System.exit(0);
			}		
		}	
		
//-----------------------------------------Sort Birth Day Method------------------------------------------------------------------
    public static void SortingBirthday() {
    Scanner input = new Scanner(System.in);

        System.out.println("\t+------------------------------------------------------+");
        System.out.println("\t|\t         List Contact by Birthday 	       |");
        System.out.println("\t+------------------------------------------------------+\n");

		System.out.println("+--------------------------------------------------------------------------------------------+");
		System.out.printf("|Contact ID   |\t   Name     |   Phone Number |\tCompany      |\tSalary       |\tBirthday     |\n");
		System.out.println("+--------------------------------------------------------------------------------------------+");

        LocalDate[] tempSortB_dayArray = new LocalDate[B_dayArray.length];
			for (int i = 0; i < B_dayArray.length; i++) {
				tempSortB_dayArray[i] = LocalDate.parse(B_dayArray[i]);
			}
        
			for (int i = 0; i < tempSortB_dayArray.length - 1; i++) {
			for (int j = i + 1; j < tempSortB_dayArray.length; j++) {
				LocalDate date1 = tempSortB_dayArray[i];
				LocalDate date2 = tempSortB_dayArray[j];

					if (date1.getYear() > date2.getYear()) {
						LocalDate temp = tempSortB_dayArray[i];
						tempSortB_dayArray[i] = tempSortB_dayArray[j];
						tempSortB_dayArray[j] = temp;
					} else if (date1.getYear() == date2.getYear()) {
            
					if (date1.getMonthValue() > date2.getMonthValue()) {
						LocalDate temp = tempSortB_dayArray[i];
						tempSortB_dayArray[i] = tempSortB_dayArray[j];
						tempSortB_dayArray[j] = temp;
					} else if (date1.getMonthValue() == date2.getMonthValue()) {
                
					if (date1.getDayOfMonth() > date2.getDayOfMonth()) {
						LocalDate temp = tempSortB_dayArray[i];
						tempSortB_dayArray[i] = tempSortB_dayArray[j];
						tempSortB_dayArray[j] = temp;
					}
				}
			}
		}
	}

			for (LocalDate sortedDate : tempSortB_dayArray) {
				int index = findIndexByBirthday(sortedDate);
				System.out.printf("|%-12s |%-12s |\t%-12s |\t%-12s |\t%-12.2f |\t%-12s |\n", IDArray[index], nameArray[index], phone_numberArray[index], company_nameArray[index], salaryArray[index], B_dayArray[index]);
			}

				System.out.println("+--------------------------------------------------------------------------------------------+");
				
				System.out.print("Do you want to go home page (Y/N): ");
				char ch3 = input.next().charAt(0);
				if(ch3=='Y' || ch3=='y'){
					clearConsole();
					HomePage();
				}else if(ch3=='N' || ch3=='n'){
					System.exit(0);
				}		
			}
			
//------------------------find Index by B_day METHOD------------------------------------------------------------
    public static int findIndexByBirthday(LocalDate birthday) {
        for (int i = 0; i < B_dayArray.length; i++) {
            if (LocalDate.parse(B_dayArray[i]).equals(birthday)) {
                return i;
            }
        }
        return -1;
    }
}



