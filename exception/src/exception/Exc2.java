package exception;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,a;
		try{   //monitor a block of code
			d=0;
			a=42/d;
			System.out.println("This willnnnot be printed");
			
		}
          catch(ArithmeticException e){
        	  // Catch divided by zero error
        	  System.out.println(" Division by zero");
          }
		System.out.println("After catch statement");
	}

}
