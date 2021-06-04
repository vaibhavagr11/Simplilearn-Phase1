package June4;


import java.util.Scanner;

class SalaryException extends Exception{
	 SalaryException(String s){
		super(s);
	}
}

public class CustomException {
	
	static void validate(int sal) throws SalaryException{
		if(sal<0) {
			throw new SalaryException("Invalid salary");
		}
	    else if(sal<2000) {
			throw new SalaryException("you need to work hard");
		}
		else if(sal>2100 && sal<5000) {
			throw new SalaryException("you salary is somehow good");
		}
		else if (sal>5100 && sal<9000) {
			throw new SalaryException("you salary is very good");
		}
		else {
			throw new SalaryException("Invalid Salary");
		}
		
	}

	public static void main(String[] args) {
		try {
			System.out.println("Enter your salary : ");
			Scanner sc=new Scanner(System.in);
			int sa= sc.nextInt();
			
			
			validate(sa);
		}
		catch(Exception m) {
			System.out.println("Exception occurred: "+ m);
			
		}
		
	}

}



