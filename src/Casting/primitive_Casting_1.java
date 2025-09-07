package Casting;

public class primitive_Casting_1 {
    static void main() {
// we will talk about the CASTING -> narrowing and widening.
        // The order from smallest to largest is: byte -> short -> char -> int -> long -> float -> double.
        // widening is done automatically by Java compiler.
        // Narrowing has to be done explicitly using the (targetType) syntax.
        // [potential risk of data loss or loss of precision.]

        // 1. widening
        // 2. narrowing
        // done among the PRIMITIVE data type
        int n = 435;
        double d = 2433.963;
        char c = 'A';
        long l = 900056543l;
        float f =3.14f;

        // widening auto done by JAVA Compiler
        double lng0 = n;
        double lng1 = c;
        double lng2 = l;
        double lng3 = f;
        System.out.println(lng0+"\n"+lng1+"\n"+lng2+"\n"+lng3);
//-----------------------------------------------------------------
        // int to char (narrowing) --> so we need to specify (targetType) OR data type
        int code = 66;
        char letter = (char) code; // 'B'
        System.out.println(letter);
//-----------------------------------------------------------------


    }
}
