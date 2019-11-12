
package mj;
import java.util.Scanner;
public class mj {
	
	
 public static void main(String[] args) {
	 boolean flag =true;
	 String name="Mudit";
	 
	 int age;
	 savingsaccount f=new savingsaccount();
	 salarisedaccount g=new salarisedaccount();
	 jointaccount h=new jointaccount();
		Scanner sc=new Scanner (System.in);
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter your name");
	 name=s.nextLine();
	 
	System.out.println("1.Open an account\n"
			+ "2.Exit");
	int ch1=s.nextInt();
	
	switch(ch1){
	
	case 1:{
		System.out.println("1.Savings Acoount\n"
				+ "2.Salarised Account\n"
				+ "3.Joint Account\n"
				+ "4.Exit"
				);
		int ch2=s.nextInt();
		
		switch(ch2)
		{
		case 1:{
			
			System.out.println("You have to maintain minimum 1000Rs in your account");
			
			System.out.println("Enter your age");
			age=s.nextInt();
			
			f.gets( name, age);
			int check=f.check();
			if(check==1){
				System.out.println("Enter the amount to be deposited");
				double dbal=s.nextDouble();
				f.deposit(dbal);
				f.balanceEnqiury();
				while(flag){
					System.out.println("Enter your choice\n"+"1.WITHDRAWL\n"
							+ "2.DEPOSIT\n"
							+ "3.BALANCEENQUIRY\n"
							+ "4.EXIT");
					int ch=s.nextInt();
					
					switch(ch) {
					case 1:{
						System.out.println("Enter the amount");
						double x=s.nextDouble();
						try{f.withdrawl(x);}
						catch(myexception e){
							System.out.println(e);}}
						case 2:{
							System.out.println("Enter the amount");
							double x=s.nextDouble();
							f.deposit(x);
							break;}
							case 3:{
								f.balanceEnqiury();
								break;
							}
							case 4:{
								System.out.println("Thank You to choosing our Services");
							System.exit(0);
							}
							default:{
								System.out.println("Invalid entry");
								System.exit(0);}
								
								
							
						}
					
					
				}
				
				
				}
			else {System.out.println("Visit Again");
			System.exit(0);}
			}//case 1 of type of account
		case 2: {
			System.out.println("Your monthly income should be atleast 5000Rs");
			
			g.gets(name);
			while(flag){
				
					System.out.println("Enter your choice\n"+"1.WITHDRAWL\n"
							+ "2.DEPOSIT\n"
							+ "3.BALANCE ENQUIRY\n"
							+ "4.EXIT");
					int ch=s.nextInt();
					
					switch(ch) {
					case 1:{
						System.out.println("Enter the amount");
						double x=s.nextDouble();
						try{f.withdrawl(x);}
						catch(myexception e){
							System.out.println(e);}}
						case 2:{
							System.out.println("Enter the amount");
							 double x=s.nextDouble();
							f.deposit(x);
							break;}
							case 3:{
								f.balanceEnqiury();
								break;
							}
							case 4:{
								System.out.println("Thank You to choosing our Services");
							System.exit(0);
							}
							default:{
								System.out.println("Invalid entry");
								System.exit(0);}
								
								
							
						}
					
				
				
				
			}
		
			
			
			
			
		}
		
		case 3:{
			h.gets(name);
			
			while(flag){
				
				System.out.println("Enter your choice\n"+"1.WITHDRAWL\n"
						+ "2.DEPOSIT\n"
						+ "3.BALANCE ENQUIRY\n"
						+ "4.EXIT");
				int ch=s.nextInt();
				
				switch(ch) {
				case 1:{
					System.out.println("Enter the amount");
					double x=s.nextDouble();
					try{f.withdrawl(x);}
					catch(myexception e){
						System.out.println(e);}}
					case 2:{
						System.out.println("Enter the amount");
						 double x=s.nextDouble();
						f.deposit(x);
						break;}
						case 3:{
							f.balanceEnqiury();
							break;
						}
						case 4:{
							System.out.println("Thank You for choosing our Services");
						System.exit(0);
						}
						default:{
							System.out.println("Invalid entry");
							System.exit(0);}
							
							
						
					}
			}
			
			
			
		}
		
			
		
		case 4:
			{
				System.out.println("Thank You for choosing our Services ");
				System.exit(0);
			}
			default:{
				
		System.out.println("Invalid Entry");
		System.exit(0);}
		
		}
	//choose type of account
	
		
		break;}//case 1 of open account
	
	case 2:{
		System.out.println("Thank you for using our Services\n"
				+ "See you Again");
		System.exit(0);}
	
	}//open n account
	
		
	
		
		
		}} 

	


		
	
	
	
	
	
	

