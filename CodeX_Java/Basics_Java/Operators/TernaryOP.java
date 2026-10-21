package Basics_Java.Operators;

public class TernaryOP {
    static void main(String[] args) {
        // Ternary Operator

        /*1. Ternary Operator kya hota hai?
Ternary Operator ek conditional operator hai jo condition ke basis par do expressions mein se ek ka result choose karta hai.

Iska basic syntax hai:
condition ? valueIfTrue : valueIfFalse;


Ismein 3 parts hote hain, isliye ise ternary operator kehte hain.
- condition — jis condition ko check karna hai.
- ? — agar condition true ho.
- : — agar condition false ho.*/


        int marks = 76;

        String result = marks >= 33 ? "pass"  : "fail";

        System.out.println(result );
    }
}
