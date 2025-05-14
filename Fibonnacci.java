package Pulkit06417711923;
import java.util.Scanner;

public class Fibonnacci {

    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
         
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                
                printFibonacci(n);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }
}
