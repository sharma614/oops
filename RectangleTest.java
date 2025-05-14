package Pulkit06417711923;

import java.util.Scanner;

class Rectangle {
    private int length, breadth;

    // Default Constructor
    public Rectangle() {
        this.length = 5;  
        this.breadth = 10; 
    }

    // Parameterized Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Copy Constructor
    public Rectangle(Rectangle r) {
        this.length = r.length;
        this.breadth = r.breadth;
    }

    // Setter methods
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Getter methods
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    // Method to calculate Area
    public int getArea() {
        return length * breadth;
    }

    // Method to calculate Perimeter
    public int getPerimeter() {
        return 2 * (length + breadth);
    }

    // Display method
    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

// The main class should be named the same as the filename
public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default Constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Constructor:");
        rect1.display();

        // Taking input for length and breadth
        System.out.print("\nEnter length and breadth: ");
        int len = sc.nextInt();
        int brd = sc.nextInt();

        // Setting values using setter methods
        rect1.setLength(len);
        rect1.setBreadth(brd);
        System.out.println("Updated Values after using Setters:");
        rect1.display();

        // Parameterized Constructor
        Rectangle rect2 = new Rectangle(len, brd);
        System.out.println("\nParameterized Constructor:");
        rect2.display();

        // Copy Constructor
        Rectangle rect3 = new Rectangle(rect2);
        System.out.println("\nCopy Constructor:");
        rect3.display();

        sc.close();
    }
}
