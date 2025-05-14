package Pulkit06417711923;
import java.util.Scanner;
class StringOPs {
    private String str1;
    private String str2;
    public StringOPs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        setStr1(sc.nextLine());
        System.out.print("Enter second string: ");
        setStr2(sc.nextLine());
        System.out.println("Object created using Default Constructor.\n");
    }
    public StringOPs(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        System.out.println("Object created using Parameterized Constructor.\n");
    }
    public StringOPs(StringOPs obj) {
        this.str1 = obj.str1;
        this.str2 = obj.str2;
        System.out.println("Object created using Copy Constructor.\n");
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
    public void setStr2(String str2) {
        this.str2 = str2;
    }
    public String getStr1() {
        return str1;
    }
    public String getStr2() {
        return str2;
    }
    public void toUpperCase() {
        System.out.println("String 1 in Upper Case: " + str1.toUpperCase());
        System.out.println("String 2 in Upper Case: " + str2.toUpperCase());
    }
    public void toLowerCase() {
        System.out.println("String 1 in Lower Case: " + str1.toLowerCase());
        System.out.println("String 2 in Lower Case: " + str2.toLowerCase());
    }
    public void concatenate() {
        System.out.println("Concatenated String: " + str1.concat(str2));
    }

    public void reverse() {
        System.out.println("Reversed String 1: " + new StringBuilder(str1).reverse().toString());
        System.out.println("Reversed String 2: " + new StringBuilder(str2).reverse().toString());
    }
    public void performOperations() {
        toLowerCase();
        toUpperCase();
        concatenate();
        reverse();
        System.out.println("====================================\n");
    }
}
public class StringOperations {
    public static void main(String[] args) {
        StringOPs obj1 = new StringOPs();
        obj1.performOperations();

        StringOPs obj2 = new StringOPs("Hello", "World");
        obj2.performOperations();

        StringOPs obj3 = new StringOPs(obj2);
        obj3.performOperations();
    }
}
