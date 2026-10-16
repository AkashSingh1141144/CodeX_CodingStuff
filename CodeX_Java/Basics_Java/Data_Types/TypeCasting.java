package Basics_Java.Data_Types;

public class TypeCasting {
    static void main(String[] args) {
        // DataType implicit or explicit conversion;

        // Implicit conversion me chote data typs ko Big data type me convert krte hai
        short num1 = 234;
        int num2 = num1;

        System.out.println("num1 = " + num1);


        // Explicit conversion
        long num3 = 123242342;
//        int num4 = num3;
        int num4 = (int) num3;
        System.out.println("num3 = " + num3);
    }
}
