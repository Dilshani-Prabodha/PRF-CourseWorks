import java.util.*;
class ImartBillPrint{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	
	System.out.println('\n');
	System.out.println("===================================================================================");
	System.out.println("__	    __  _                             _           _ __  __            _");
	System.out.println("\\ \\        / / | |			     | |         (_)  \\/  |          | |");
	System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___   | |_ ___     _| \\  / | __ _ _ __| |_");
	System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\  | __/ _ \\   | | |\\/| |/ _` | '__| __|");
	System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/  | || (_) |  | | |  | | (_| | |  | |_");
	System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|   \\__\\___/   |_|_|  |_|\\__,_|_|   \\__|");
	System.out.println("===================================================================================");
	System.out.println('\n');

	System.out.print("Enter Customer Phone Number - ");
	String phoneNumber = input.nextLine();

	System.out.println('\n');
	
	System.out.print("Enter Customer Name         - ");
	String name = input.nextLine();

	System.out.println('\n');

	System.out.println("===================================================================================");
	System.out.println('\n');
	
	int basmathi,dhal,sugar,highland,yoghurt,flour,soap;

		System.out.print("Basmathi Qty(Kg) - ");
		basmathi = input.nextInt();
		System.out.println('\n');

		System.out.print("Dhal Qty(Kg)     - ");
		dhal = input.nextInt();
		System.out.println('\n');

		System.out.print("Sugar Qty(Kg)    - ");
		sugar = input.nextInt();
		System.out.println('\n');

		System.out.print("Highland Qty     - ");
		highland = input.nextInt();
		System.out.println('\n');

		System.out.print("Yoghurt Qty      - ");
		yoghurt = input.nextInt();
		System.out.println('\n');

		System.out.print("Flour Qty(Kg)    - ");
		flour = input.nextInt();
		System.out.println('\n');

		System.out.print("Soap Qty         - ");
		soap = input.nextInt();
		System.out.println('\n');
		System.out.println('\n');

	System.out.println("+---------------------------------------------------------------+");
	System.out.println("|								|");
	System.out.println("|		 _   __  __          _____ _______		|");
	System.out.println("| 		(_) |  \\/  |   /\\   |  __ \\__   __|		|");
	System.out.println("|		 _  | \\	 / |  /  \\  | |__) | | |		|");
	System.out.println("|		| | | |\\/| | / /\\ \\ |  _  /  | |		|");
	System.out.println("|		| | | |	 | |/ ____ \\| |	\\ \\  | |		|");
	System.out.println("|		|_| |_|	 |_/_/	  \\_\\_|	 \\_\\ |_|		|");
	System.out.println("|		     225,Galle Road,Panadura.			|");
	System.out.println("|								|");
	
	System.out.println("+---------------------------------------------------------------+");
	System.out.println("|    			 # Tel  : "+phoneNumber+"		        |");
	System.out.println("|    			 # Name : "+name+"	        	        |");
	System.out.println("+-----------------+-------------+---------------+---------------+");
	System.out.println("|		  |	Qty	|   unit price	|     price	|");
	System.out.println("+-----------------+-------------+---------------+---------------+");

                String good1 = " # Basmathi";
		int qty1 = basmathi;
		double uPrice1 = 250.00;
		double price1 = basmathi*uPrice1;

		String good2 = " # Dhal";
		int qty2 = dhal;
		double uPrice2 = 180.00;
		double price2 = dhal*uPrice2;

		String good3 = " # Suger";
		int qty3 = sugar;
		double uPrice3 = 150.00;
		double price3 = sugar*uPrice3;

		String good4 = " # Highland";
		int qty4 = highland;
		double uPrice4 = 120.00;
		double price4 = highland*uPrice4;

		String good5 = " # Yoghurt";
		int qty5 = yoghurt;
		double uPrice5 = 50.00;
		double price5 = yoghurt*uPrice5;

		String good6 = " # Flour";
		int qty6 = flour;
		double uPrice6 = 120.00;
		double price6 = flour*uPrice6;

		String good7 = " # Soap";
		int qty7 = soap;
		double uPrice7 = 160.00;
		double price7 = soap*uPrice7;

		String tot = " Total";
		double vtot = (basmathi*uPrice1)+(dhal*uPrice2)+(sugar*uPrice3)+(highland*uPrice4)+(yoghurt*uPrice5)+(flour*uPrice6)+(soap*uPrice7);

		String dis = " discount(10%)";
		double vdis = 10/100;
		double fvdis = vtot*10/100;

		String pri = " Price";
		double fpri = vtot-fvdis;

	System.out.println("|		  |		|		|		|");

	System.out.printf("|%-15s  |  %5d      |   %10.1f  |   %10.1f  |\n",good1,qty1,uPrice1,price1);
	System.out.println("|		  |		|		|		|");

	System.out.printf("|%-15s  |  %5d      |   %10.1f  |   %10.1f  |\n",good2,qty2,uPrice2,price2);
	System.out.println("|		  |		|		|		|");

	System.out.printf("|%-15s  |  %5d      |   %10.1f  |   %10.1f  |\n",good3,qty3,uPrice3,price3);
	System.out.println("|		  |		|		|		|");

	System.out.printf("|%-15s  |  %5d      |   %10.1f  |   %10.1f  |\n",good4,qty4,uPrice4,price4);
	System.out.println("|		  |		|		|		|");

	System.out.printf("|%-15s  |  %5d      |   %10.1f  |   %10.1f  |\n",good5,qty5,uPrice5,price5);
	System.out.println("|		  |		|		|		|");

	System.out.printf("|%-15s  |  %5d      |   %10.1f  |   %10.1f  |\n",good6,qty6,uPrice6,price6);
	System.out.println("|		  |		|		|		|");

	System.out.printf("|%-15s  |  %5d      |   %10.1f  |   %10.1f  |\n",good7,qty7,uPrice7,price7);
	System.out.println("|		  |		|		|		|");
	System.out.println("+-----------------+-------------+---------------+---------------+");

	

	System.out.printf("|		       		|%-10s  	|   %10.1f  |\n",tot,vtot);
	System.out.println("|				+---------------+---------------+");

	System.out.printf("|		       		|%-10s |   %10.1f  |\n",dis,fvdis);
	System.out.println("|				+---------------+---------------+");

	System.out.printf("|		       		|%-10s     |   %10.1f  |\n",pri,fpri);
	System.out.println("+-------------------------------+---------------+---------------+");
	}
}
