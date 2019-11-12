package mj;
import java.util.Scanner;

public class savingsaccount{
	String name;
	 double minbal=1000;
	int age;
	double bal=0;
	Scanner s=new Scanner(System.in);
	void gets(String name,int age){
		this.name=name;
		this.age=age;}
	
		int check(){
			if(age<18 && age>0)
			{
				System.out.println("You are not eligible for savings account.Please Apply for Joint account ");
return 0;}		
			else if(age>=18 && age<=90)
			{System.out.println("Welcome,      "+name);
			return 1;}
		else if(age>90) {System.out.println("Your end days are here.Please go and enjoy your little rest life");
			return 0;}
		else {System.out.println("Invalid age");
		return 0;}
			}
	
	
	void amount(double bal){
		this.bal =bal+this.bal;
		}
void withdrawl(double x) throws myexception {
		
		this.bal=this.bal-x;
	
		if(x>0){
			
				if(bal<1000) {
			
				this.bal=this.bal+x;
				
				throw new myexception("Insufficient bal");
				
			}
				else System.out.println("After withdrawl  bal is "+this.bal);
			
		}
		else 
			{System.out.println("Invalid Entry");}
		}//withdrawl

void deposit(double x) {
	this.bal=this.bal+x;

System.out.println("The updated bal is "+bal+"\n");}//deposit
void balanceEnqiury() {
	
	System.out.println("Current bal is "+this.bal);
}//withdrawl
	

	

}
class myexception extends Exception{
	
	myexception(String str){
		
		super(str);
	}
}

