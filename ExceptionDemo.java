package Pulkit06417711923;
import java.util.Scanner;
public class ExceptionDemo {
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be 18 or older.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            int result = 100 / num; 
            System.out.println("Result: " + result);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed, whether an exception occurs or not.");
            scanner.close();
        }
    }
}
