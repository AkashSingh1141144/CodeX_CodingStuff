package Basics_Java.Operators;

public class LogicalOP {
    static void main(String[] args) {
        // Logical operators

        /* 1. Logical Operators kya hote hain?
Logical Operators ka use do ya do se zyada conditions ko combine karne ya kisi condition ka result reverse karne ke liye hota hai.

Java mein 3 basic Logical Operators hain:

| Operator | Name | Meaning |
|---|---|---|
| && | Logical AND | Dono conditions true honi chahiye |
| || | Logical OR | Kam se kam ek condition true honi chahiye |
| ! | Logical NOT | Result ko reverse karta hai |
2. Inki zarurat kyu padti hai?
Maan lo ek website par user ko login karne ke liye username aur password dono sahi enter karne hain.

Sirf username sahi hona enough nahi hai. Password bhi sahi hona chahiye.

Aise cases mein Logical Operators ka use hota hai.
3. AND Operator (&&)
Rule: Dono conditions true hongi, tabhi final result true hoga.
Condition 1	Condition 2	Result
true	true	true
true	false	false
false	true	false
false	false	false */

        // AND operator (&&)
        int age = 22;
        boolean hasLicence = true;

        System.out.println(age >= 18 && hasLicence);





        /* OR Operator (||)
Rule: Kam se kam ek condition true honi chahiye.
Condition 1	Condition 2	Result
true	true	true
true	false	true
false	true	true
false	false	false */


        boolean isAdmin = false;
        boolean isManager = true;

        System.out.println(isAdmin || isManager);




/* NOT Operator (!)
Rule: Boolean result ko ulta kar deta hai.
Condition	Result after !
true	false
false	true */

        boolean isLoggedIn = false;
        System.out.println(!isLoggedIn); // true

    }
}
