package Pulkit06417711923;
import java.util.Scanner;
public class SumAverageCalculator {
	  public static int computeSum(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum;
	    }
public static double computeAverage(int[] arr) {
    int sum = computeSum(arr);
    return (double) sum / arr.length;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " numbers:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int sum = computeSum(arr);
    double avg = computeAverage(arr);
    System.out.println("Sum of elements: " + sum);
    System.out.println("Average of elements: " + avg);
    sc.close();
}
}
