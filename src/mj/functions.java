package mj;

public class functions {
	double bal;
	functions(double bal){
		this.bal=bal;
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

System.out.println("The updated bal is "+bal);}//deposit
void balanceEnqiury() {
	
	System.out.println("Current bal is "+this.bal);
}}
