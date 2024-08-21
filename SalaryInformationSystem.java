import java.util.*;
class SalaryInformationSystem{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("////////////////////////////////////////////////////////////////////////");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("|		    SALARY INFORMATION SYSTEM			       |");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("////////////////////////////////////////////////////////////////////////");
		System.out.println("------------------------------------------------------------------------");
		System.out.println('\n');
		System.out.println("\t[1]Calculate Income Tax");
		System.out.println("\t[2]Calculate Annual Bonus");
		System.out.println("\t[3]Calculate Loan Amount");
		System.out.println('\n');
		
		int option;
		System.out.print("Enter an option to continue > ");
		option=input.nextInt();
		input.nextLine();
		
		if(option==1){
			System.out.println("------------------------------------------------------------------------");
			System.out.println("|		    Calculate Income Tax			       |");
			System.out.println("------------------------------------------------------------------------");
			System.out.println('\n');
			
			System.out.print("Input Employee Name    - ");
			String name1 = input.nextLine();
			
			
			System.out.print("Input Employee Salary  - ");
			double sal = input.nextDouble();
			
			System.out.print('\n');
			
			double tax1=0,tax2=0,tax3=0,tax4=0,tax5=0,ttax=0;
		
				if(sal<=100000){
					System.out.println("No paying tax");
				}else if(sal>308333){
					sal=sal-308333;
					tax1=sal*0.36;
					ttax=87500+tax1;
					System.out.println("You have to pay Income Tax per month: "+ttax);
				}else if(sal>266667){
					sal=sal-266667;
					tax2=sal*0.24;
					ttax=50000+tax2;
					System.out.println("You have to pay Income Tax per month: "+ttax);
				}else if(sal>225000){
					sal=sal-225000;
					tax3=sal*0.18;
					ttax=25000+tax3;
					System.out.println("You have to pay Income Tax per month: "+ttax);			
				}else if(sal>183333){
					sal=sal-183333;
					tax4=sal*0.12;
					ttax=10000+tax4;
					System.out.println("You have to pay Income Tax per month: "+ttax);
				}else{
					sal=sal-100000;
					tax5=sal*0.06;
					System.out.println("You have to pay Income Tax per month: "+ttax);
				}
		}else if(option==2){
			System.out.println("------------------------------------------------------------------------");
			System.out.println("|		    Calculate Annual Bonus			       |");
			System.out.println("------------------------------------------------------------------------");
			System.out.println('\n');
			
			System.out.print("Input Employee Name - ");
			String nam2=input.nextLine();
			
			System.out.print("Input Employee Salary  - ");
			double sal2 = input.nextDouble();
			
			System.out.print('\n');
			
			double bon;
				if(sal2<100000){
					System.out.println("Annual bonus	- 5000");
				}else if(sal2>=400000){
					bon=sal2*0.35;
					System.out.println("Annual bonus	- "+bon);
				}else if(sal2>=300000){
					bon=sal2*0.20;
					System.out.println("Annual bonus	- "+bon);
				}else if(sal2>=200000){
					bon=sal2*0.15;
					System.out.println("Annual bonus	- "+bon);
				}else{
					bon=sal2*0.1;
					System.out.println("Annual bonus	- "+bon);
				}
		}else{
			System.out.println("------------------------------------------------------------------------");
			System.out.println("|		    Calculate Loan Amount			       |");
			System.out.println("------------------------------------------------------------------------");
			System.out.println('\n');
			
			System.out.print("Input Employee Name - ");
			String nam3=input.nextLine();
						
			System.out.print('\n');
			
			System.out.print("Input Employee Salary  - ");
			double sal3 = input.nextDouble();
			
			System.out.print('\n');
			
			System.out.print("Enter number of year   - ");
			int yer = input.nextInt();
			int n;
			double rate,month_inst,x,a,b,c,d,lon,loan;
			
			rate=0.15;
			n=yer*12;
			month_inst=sal3*0.6;
			
			x=rate/12;
			a=1+x;
			b=1/a;
			c=Math.pow(b,n);
			d=1-c;
			
				if((sal3>=50000)&(yer<=5)){
					lon=(month_inst*d)/x;
					loan=(int) (lon/1000)*1000;
					System.out.print('\n');
					System.out.println("You can get Loan Amount : "+loan);
				}else{
					System.out.print("\tYou can not get a loan because your salary lessthan Rs.50,000");
				}	
					
		}
	}
}




