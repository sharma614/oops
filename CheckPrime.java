package Pulkit06417711923;
import java.util.Random;

public class CheckPrime {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1; 
        System.out.println("Random Number: " + number);
        
        if (isPrime(number) == 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    static int isPrime(int num) {
        if (num <= 1) {
            return 0; 
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
