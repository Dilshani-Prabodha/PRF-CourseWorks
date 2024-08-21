import java.util.*;
class TaxCalculater{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	
	System.out.println("			 			       __  ______  ________ ________");
	System.out.println("			                              |  \\/      \\|        |        \\");
	System.out.println("			 			       \\$|  $$$$$$| $$$$$$$$\\$$$$$$$$");
	System.out.println("						      |  | $$   \\$| $$__      | $$");
	System.out.println("						      | $| $$     | $$  \\     | $$");
	System.out.println("					              | $| $$   __| $$$$$     | $$");
	System.out.println("						      | $| $$__/  | $$_____   | $$");
	System.out.println("						      | $$\\$$    $| $$     \\  | $$");
	System.out.println("			 			       \\$$ \\$$$$$$ \\$$$$$$$$   \\$$");
	
	System.out.println('\n');
	
	System.out.println("	 _______           __    __      ______              _          ______   _     _   _                  _______    ____    _____");
	System.out.println("	|__   __|   /\\     \\ \\  / /     / _____|     /\\     | |        / _____| | |   | | | |           /\\   |__   __|  / __ \\  |  __ \\");
	System.out.println("	   | |     /  \\     \\ \\/ /     | |          /  \\    | |       | |       | |   | | | |          /  \\     | |    | |  | | | |__) |");
	System.out.println("	   | |    / /\\ \\     >  <      | |         / /\\ \\   | |       | |       | |   | | | |         / /\\ \\    | |    | |  | | |  _  /");
	System.out.println("	   | |   / ____ \\   /  . \\     | |_____   / ____ \\  | |_____  | |_____  | |___| | | |_____   / ____ \\   | |    | |__| | | | \\ \\");
	System.out.println("	   |_|  /_/    \\_\\ /_/  \\_\\     \\______| /_/    \\_\\ |_______|  \\______|  \\_____/  |_______| /_/    \\_\\  |_|     \\____/  |_|  \\_\\");
	
	System.out.println('\n');
	
	System.out.println("===============================================================================================================================================");
	
	System.out.println("\n\n");
	
	System.out.println("\t[1] Withholding Tax\n");
	System.out.println("\t[2] Payable Tax\n");
	System.out.println("\t[3] Income Tax\n");
	System.out.println("\t[4] Social Security Contribution Levy (SSCL) Tax\n");
	System.out.println("\t[5] Leasing Payment\n");
	System.out.println("\t[6] Exit\n\n");
	
	System.out.print("Enter an option to continue -> ");
	int option=input.nextInt();
	System.out.println("\n\n");
	
		switch (option){
			case 1 : 
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|			WITHHOLDING TAX				    |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");
				System.out.println("\t[1] Rent Tax\n");
				System.out.println("\t[2] Bank Interest Tax\n");
				System.out.println("\t[3] Dividend Tax\n");
				System.out.println("\t[4] Exit\n\n");
				
				System.out.print("Enter an option to continue -> ");
				int option_1=input.nextInt();
				System.out.println("\n\n");
				
				switch (option_1){
					case 1 :
						PrintRentTax();
						break;
					
					case 2 :
						PrintBankInterestTax();
						break;
						
					case 3 :
						PrintDeviTax();
						break;
						
					case 4 :
						System.out.print("\t*Press 'E' to Exit from Leasing Withholding Tax : ");
						char chaa=input.next().charAt(0);
							if((chaa=='E')|(chaa=='e')){
								main(null);
							}
						break;
					}
			break;
			
			case 2 :
				PrintPayTax();
				break;
				
			case 3 :
				PrintIncomeTax();
				break;
			
			case 4 :
				PrintSSCLTax();
				break;
				
			case 5 :
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|			Leasing Payment				    |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");
				System.out.println("\t[1] Calculate Monthly Installment\n");
				System.out.println("\t[2] Search Leasing Category\n");
				System.out.println("\t[3] Find Leasing Amount\n");
				System.out.println("\t[4] Exit\n\n");
	
				System.out.print("Enter an option to continue -> ");
				int option_2=input.nextInt();
				System.out.println("\n\n");
				
					switch(option_2){
						case 1 :
							PrintMonthlyInstallment();
						break;
						
						case 2 :
							SearchLeasingCatagory();
						break;
						
						case 3 :
							FindLeasingAmount();
						break;
						
						case 4 :
						System.out.print("\t*Press 'E' to Exit from Leasing Payment catagory : ");
						char cha=input.next().charAt(0);
							if((cha=='E')|(cha=='e')){
								main(null);
							}
						break; 
					}
			case 6 :
				System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("\t\t\t#Press 'ANY KEY' to Exit");
				System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			break;
		}
	}				
				public static void PrintRentTax(){
				Scanner input = new Scanner(System.in);
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|			RENT TAX				    |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");
				
				System.out.print("Enter your rent		 : ");
				int rent=input.nextInt();
				System.out.println();
					if(rent>100000){
						double rent_tax=(rent-100000)*10/100;
						System.out.printf("You have to pay Rent Tax : %.2f",rent_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
						char ch1=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch1=='Y')|(ch1=='y')){
								PrintRentTax();
							}else{
								main(null);
							}
								
					}else if((rent<=100000)&(rent>0)){
						System.out.println("\tYou dont have to pay rent tax...");
						System.out.println("\n\n");
						System.out.print("Do you want to enter the correct value again (Y/N) : ");
						char ch1=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch1=='Y')|(ch1=='y')){
								PrintRentTax();
							}else{
								main(null);
							}
					}else{
						System.out.println("\tInvalid input...");
						System.out.println("\n\n");
						System.out.print("Do you want to enter the correct value again (Y/N) : ");
						char ch1=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch1=='Y')|(ch1=='y')){
								PrintRentTax();
							}else{
								main(null);
							}
					}				
				}
				
				
				public static void PrintBankInterestTax(){
				Scanner input = new Scanner(System.in);
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|			BANK INTEREST TAX			    |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");
				
				System.out.print("Enter your bank interest per year		    : ");
				int bank=input.nextInt();
				System.out.println();
					if(bank>0){
						double bank_tax=bank*5/100;
						System.out.printf("You have to pay Bank Interest Tax per year 	    : %.2f",bank_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
						char ch12=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch12=='Y')|(ch12=='y')){
								PrintBankInterestTax();
							}else{
								main(null);
							}
								
							}else{
						System.out.println("\tInvalid input...");
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
						char ch12=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch12=='Y')|(ch12=='y')){
								PrintBankInterestTax();
							}else{
								main(null);
							}
						}
					}
					
					
				public static void PrintDeviTax(){
				Scanner input = new Scanner(System.in);
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|			DIVIDEND TAX				    |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");
				
				System.out.print("Enter your totle devidend per year		  : ");
				int devi=input.nextInt();
				System.out.println();
					if(devi>100000){
						double devi_tax=(devi-100000)*14/100;
						System.out.printf("You have to pay Devidend Tax per year	  	  : %.2f",devi_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Devidend Tax (Y/N) : ");
						char ch13=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch13=='Y')|(ch13=='y')){
								PrintDeviTax();
							}else{
								main(null);
							}
								
					}else if((devi<=100000)&(devi>0)){
						System.out.println("\tYou dont have to pay Devident Tax...");
						System.out.println("\n\n");
						System.out.print("Do you want to enter the correct value again (Y/N) : ");
						char ch13=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch13=='Y')|(ch13=='y')){
								PrintDeviTax();
							}else{
								main(null);
							}
					}else{
						System.out.println("\tInvalid input...");
						System.out.println("\n\n");
						System.out.print("Do you want to enter the correct value again (Y/N) : ");
						char ch13=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch13=='Y')|(ch13=='y')){
								PrintDeviTax();
							}else{
								main(null);
							}
					}
				}
				
				
				public static void PrintPayTax(){
				Scanner input = new Scanner(System.in);
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|			PAYABLE TAX				    |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");
				
				System.out.print("Enter your employee payment per month		   : ");
				double pay=input.nextInt();
				System.out.println();
				double pay_tax;
					if(pay>308333){
						pay-=308333;
						pay_tax=(pay*0.36)+37500;
						System.out.printf("You have to pay Payable Tax per month 	     	   : %.2f",pay_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
						char ch2=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch2=='Y')|(ch2=='y')){
								PrintPayTax();
							}else{
								main(null);
							}
							
					}else if(pay>266667){
						pay-=266667;
						pay_tax=(pay*0.30)+25000;
						System.out.printf("You have to pay Payable Tax per month 	     	   : %.2f",pay_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
						char ch2=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch2=='Y')|(ch2=='y')){
								PrintPayTax();
							}else{
								main(null);
							}
							
					}else if(pay>225000){
						pay-=225000;
						pay_tax=(pay*0.24)+15000;
						System.out.printf("You have to pay Payable Tax per month 	     	   : %.2f",pay_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
						char ch2=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch2=='Y')|(ch2=='y')){
								PrintPayTax();
							}else{
								main(null);
							}
							
					}else if(pay>183333){
						pay-=183333;
						pay_tax=(pay*0.18)+7500;
						System.out.printf("You have to pay Payable Tax per month 	     	   : %.2f",pay_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
						char ch2=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch2=='Y')|(ch2=='y')){
								PrintPayTax();
							}else{
								main(null);
							}
							
					}else if(pay>141667){
						pay-=141667;
						pay_tax=(pay*0.12)+2500;
						System.out.printf("You have to pay Payable Tax per month 	     	   : %.2f",pay_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
						char ch2=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch2=='Y')|(ch2=='y')){
								PrintPayTax();
							}else{
								main(null);
							}
							
					}else if(pay>100000){
						pay-=100000;
						pay_tax=pay*0.06;
						System.out.printf("You have to pay Payable Tax per month 	     	   : %.2f",pay_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
						char ch2=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch2=='Y')|(ch2=='y')){
								PrintPayTax();
							}else{
								main(null);
							}
							
					}else if((pay<=100000)&(pay>0)){
						System.out.print("\tYou don't have to pay payable Tax...");
						System.out.println("\n\n");
						System.out.print("Do you want to enter the correct value again (Y/N) : ");
						char ch2=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch2=='Y')|(ch2=='y')){
								PrintPayTax();
							}else{
								main(null);
							}
					}else if(pay<0){
						System.out.println("\tInvalid input...");
						System.out.println("\n\n");
						System.out.print("Do you want to enter the correct value again (Y/N) : ");
						char ch2=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch2=='Y')|(ch2=='y')){
								PrintPayTax();
							}else{
								main(null);
							}
					}
							
				}
				
				public static void PrintIncomeTax(){
				Scanner input = new Scanner(System.in);
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|			INCOME TAX				    |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");
				
				System.out.print("Enter your total income per year	: ");
				double income=input.nextInt();
				System.out.println();
				double income_tax;
					if(income>3700000){
						income-=3700000;
						income_tax=(income*0.36)+450000;
						System.out.printf("You have to pay Income Tax per year 	: %.2f",income_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
						char ch3=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch3=='Y')|(ch3=='y')){
								PrintIncomeTax();
							}else{
								main(null);
							}
							
					}else if(income>3200000){
						income-=3200000;
						income_tax=(income*0.30)+300000;
						System.out.printf("You have to pay Income Tax per year : %.2f",income_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
						char ch3=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch3=='Y')|(ch3=='y')){
								PrintIncomeTax();
							}else{
								main(null);
							}
							
					}else if(income>2700000){
						income-=2700000;
						income_tax=(income*0.24)+180000;
						System.out.printf("You have to pay Income Tax per year : %.2f",income_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
						char ch3=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch3=='Y')|(ch3=='y')){
								PrintIncomeTax();
							}else{
								main(null);
							}
							
					}else if(income>2200000){
						income-=2200000;
						income_tax=(income*0.18)+90000;
						System.out.printf("You have to pay Income Tax per year : %.2f",income_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
						char ch3=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch3=='Y')|(ch3=='y')){
								PrintIncomeTax();
							}else{
								main(null);
							}
							
					}else if(income>1700000){
						income-=1700000;
						income_tax=(income*0.12)+30000;
						System.out.printf("You have to pay Income Tax per year : %.2f",income_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
						char ch3=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch3=='Y')|(ch3=='y')){
								PrintIncomeTax();
							}else{
								main(null);
							}
							
					}else if(income>1200000){
						income-=1200000;
						income_tax=income*0.06;
						System.out.printf("You have to pay Income Tax per year : %.2f",income_tax);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
						char ch3=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch3=='Y')|(ch3=='y')){
								PrintIncomeTax();
							}else{
								main(null);
							}
							
					}else if((income<=1200000)&(income>0)){
						System.out.print("\tYou don't have to pay Income Tax...");
						System.out.println("\n\n");
						System.out.print("Do you want to enter the correct value again (Y/N) : ");
						char ch3=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch3=='Y')|(ch3=='y')){
								PrintIncomeTax();
							}else{
								main(null);
							}
					}else if(income<0){
						System.out.println("\tInvalid input...");
						System.out.println("\n\n");
						System.out.print("Do you want to enter the correct value again (Y/N) : ");
						char ch3=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch3=='Y')|(ch3=='y')){
								PrintIncomeTax();
							}else{
								main(null);
							}
					}
							
				}
				
				public static void PrintSSCLTax(){
				Scanner input = new Scanner(System.in);
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|		SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX   	    |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");	
				System.out.print("Enter value of Good or Service  : ");
				int value=input.nextInt();
				System.out.println();
				
					if(value>0){
				double sale_tax=value*0.025;
				double vat=(sale_tax+value)*0.15;
				double sscl=sale_tax+vat;
				System.out.printf("You have to pay SSCL            : %.2f",sscl);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
						char ch4=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch4=='Y')|(ch4=='y')){
								PrintSSCLTax();
							}else{
								main(null);
							}
					}else{
						System.out.println("\tInvalid input...");
						System.out.println("\n\n");
						System.out.print("Do you want to enter the correct value again (Y/N) : ");
						char ch3=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch3=='Y')|(ch3=='y')){
								PrintSSCLTax();
							}else{
								main(null);
							}
					}
			}
			
				public static void PrintMonthlyInstallment(){
				Scanner input = new Scanner(System.in);
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|		Calculate Leasing Payment	    	            |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");	
				System.out.print("Enter lease amount         : ");
				double lease=input.nextDouble();
				System.out.println();
				System.out.print("Enter annual interest rate : ");
				double inter=input.nextDouble();
				System.out.println();
				System.out.print("Enter number of year       : ");
				int year=input.nextInt();
				System.out.println();
					if(year>5){
						System.out.println("\tInvalid number of year...Enter the correct value again...");
						System.out.println('\n');
						System.out.print("Enter number of year      : ");
						int year1=input.nextInt();
						System.out.println();
						double i=inter/12/100;
						int n=year1*12;
						double month_install=(lease*i)/(1-Math.pow(1+i,-n)); 
						System.out.printf("Your monthly installment  : %.2f",month_install);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
						char ch5=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch5=='Y')|(ch5=='y')){
								PrintMonthlyInstallment();
							}else{
								main(null);
							}
					}else{
						double i=inter/12/100;
						int n=year*12;
						double month_install=(lease*i)/(1-Math.pow(1+i,-n));
						System.out.printf("Your monthly installment  : %.2f",month_install);
						System.out.println("\n\n");
						System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
						char ch5=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch5=='Y')|(ch5=='y')){
								PrintMonthlyInstallment();
							}else{
								main(null);
							}
					}
				}
				
				public static void SearchLeasingCatagory(){
				Scanner input = new Scanner(System.in);
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|		Search Leasing Catagory	    	       		    |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");	
				System.out.print("Enter lease amount         : ");
				double lease3=input.nextDouble();
				System.out.println();
				System.out.print("Enter annual interest rate : ");
				double inster3=input.nextDouble();
				System.out.println();

						double j=inster3/12/100;
						int m=3*12;
						double month_install3=(lease3*j)/(1-Math.pow(1+j,-m));
						System.out.printf("Your monthly installment for 3 year leasing plan - %.2f\n",month_install3);
						
						int p=4*12;
						double month_install4=(lease3*j)/(1-Math.pow(1+j,-p));
						System.out.printf("Your monthly installment for 4 year leasing plan - %.2f\n",month_install4);

						int q=5*12;
						double month_install5=(lease3*j)/(1-Math.pow(1+j,-q));
						System.out.printf("Your monthly installment for 5 year leasing plan - %.2f\n",month_install5);
						
						System.out.println("\n\n");
						System.out.print("Do you want to search another Leasing Categary (Y/N) : ");
						char ch5=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch5=='Y')|(ch5=='y')){
								SearchLeasingCatagory();
							}else{
								main(null);
							}
				}
				
				public static void FindLeasingAmount(){
				Scanner input = new Scanner(System.in);
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("|			Find Leasing Amount	    	            |");
				System.out.println("+-------------------------------------------------------------------+");
				System.out.println("\n");	
				System.out.print("Enter the monthly lease payment amount you can afford : ");
				double afford_month_install=input.nextDouble();
				System.out.println();
				System.out.print("Enter number of year 				      : ");
				int yer =input.nextInt();
				System.out.println();
				System.out.print("Enter annual interest rate 			      : ");
				double intrate =input.nextDouble();
				System.out.println();
				double k=intrate/12/100;
				int r=yer*12;
				double get_lease=(afford_month_install*(1-Math.pow(1+k,-r)))/k;
				System.out.printf("You can get lease amount 			      : %.2f",get_lease);

				System.out.println("\n\n");
				System.out.print("Do you want to search another monthly instalment (Y/N) : ");
						char ch5=input.next().charAt(0);
						System.out.println("\n\n");
							if((ch5=='Y')|(ch5=='y')){
								FindLeasingAmount();
							}else{
								main(null);
							}
			}
}
