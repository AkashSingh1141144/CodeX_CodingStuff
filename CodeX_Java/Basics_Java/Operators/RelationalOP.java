package Basics_Java.Operators;

public class RelationalOP {
    static void main(String[] args) {
        // Relational Operators
        /*
        * 1. Relational Operators kya hote hain?
Relational operators ka use do values ko compare karne ke liye hota hai. Ye check karte hain ki ek value doosri value ke equal, greater ya smaller hai ya nahi.

Inka result hamesha boolean hota hai: true ya false.
2. Kyu use karte hain?
Maan lo ek website par user ki age check karni hai ki woh 18 saal ya usse bada hai ya nahi.

Humein do values compare karni padengi. Yahan relational operators ka use hoga.
3. Kaun-kaun se operators hain?
Operator	Meaning	Example
==	Equal to	10 == 10 → true
!=	Not equal to	10 != 5 → true
>	Greater than	10 > 5 → true
<	Less than	5 < 10 → true
>=	Greater than or equal to	10 >= 10 → true
<=	Less than or equal to	5 <= 10 → true
        * */

        int age = 20;
        System.out.println(age >= 18);
        System.out.println(age < 18);
        System.out.println(age == 20);
        System.out.println(age != 20);
    }
}
