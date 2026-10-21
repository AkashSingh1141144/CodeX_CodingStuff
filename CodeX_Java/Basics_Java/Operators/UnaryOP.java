package Basics_Java.Operators;

public class UnaryOP {
    static void main(String[] args) {
        // Unary Operators need only one operand. They are used to increment, decrement, or negate a value.


        // Integer declared
        int a = 20;
        int b = 30;

        // Using unary operator
        System.out.println("postIncrement " + (a++));
        System.out.println("postDecrement " + (b--));

        System.out.println("preIncrement " + (++a));
        System.out.println("preDecrement " + (--b));
    }
}
