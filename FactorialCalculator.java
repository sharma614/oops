package Pulkit06417711923;
import java.util.Scanner;

public class FactorialCalculator {
	
	    public static int fact(int num) {
	        if (num == 0 || num == 1) {   // Base condition
	            return 1;
	        }
	        return num * fact(num - 1); // Function calling itself
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
        int result = fact(number);
        System.out.println("Factorial of " + number + " is: " + result);
        scanner.close();
	    	
	    	//int number = 5; // Fixed input
	        //int result = fact(number);
	        //System.out.println("Factorial of " + number + " is: " + result);
	    	
	    }
	


}
