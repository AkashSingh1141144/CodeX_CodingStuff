package Basics_Java.Operators;

public class AssignmentOP {
    static void main(String[] args) {
        //(+=, -=, *=, /=, %=)

        int num = 20;

        //add 5 -> num = num + 5;
        num += 5;
        System.out.println(num);

        // multiply by 2 -> num = num * 2;
        num *= 2;
        System.out.println(num);

        // subtract 5 -> num = num - 5;
        num -= 5;
        System.out.println(num);

        // divide by 2 -> num = num / 2
        num /= 2;
        System.out.println(num);

        // reminder after dividing by 3 -> num = num % 3;
        num %= 3;
        System.out.println(num);
    }
}
