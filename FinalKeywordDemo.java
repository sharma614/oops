package Pulkit06417711923;

// Final class that cannot be inherited
final class FinalClassDemo {

    // Final data member (constant value)
    final int MAX_VALUE = 100;

    // Final method that cannot be overridden
    public final void showMessage() {
        System.out.println("This is a final method.");
    }

    // Method to display the final data member
    public void displayValue() {
        System.out.println("Final data member value: " + MAX_VALUE);
    }
}

// Uncommenting this class will throw a compilation error
/*
class SubClassDemo extends FinalClassDemo {
    // Error: Cannot inherit from final class 'FinalClassDemo'
}
*/

// Class to demonstrate final behavior
public class FinalKeywordDemo {
    public static void main(String[] args) {

        // Creating an object of the final class
        FinalClassDemo obj = new FinalClassDemo();

        // Accessing and displaying the value of the final data member
        obj.displayValue(); // Output: Final data member value: 100

        // Calling the final method
        obj.showMessage(); // Output: This is a final method.

        // Attempting to modify a final variable (uncomment to see error)
        /*
        obj.MAX_VALUE = 200;  // Error: cannot assign a value to final variable 'MAX_VALUE'
        */

        // Demonstrate final reference variable
        final FinalClassDemo finalObj = new FinalClassDemo();

        // Calling methods on final reference is allowed
        finalObj.displayValue();

        // Attempting to reassign a final object reference (uncomment to see error)
        /*
        finalObj = new FinalClassDemo();  // Error: cannot assign a value to final variable 'finalObj'
        */
    }
}
