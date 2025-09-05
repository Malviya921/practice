package InterviewQ.ScannerClass;

import java.util.Scanner;

public class stdin_stdout { // system.in and system.out
    public static void main() {
        // SCANNER CLASS

        // using the SCANNER CLASS  for input and using the print method for output.
        // The most common way to read input in Java is by using the Scanner class.
        // It reads data from System.in (standard input stream).

        // For String, you have next() and nextLine().
        // For Primitives, you have nextInt(), nextDouble(), etc. (one method per type).

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number here");

        int in1 = sc.nextInt();
        int in2 = sc.nextInt(); // the more we create the more no. of input we need to input
        int in3 = sc.nextInt();
        String in4 = sc.next();

        System.out.println(in1);
        System.out.println(in2);
        System.out.println(in3);
        System.out.println(in4);
        sc.close();

        System.out.println("\n----------------------------\n");

        // we can give the other input to the scanner
        // InputStream: This is the most general type, and the one used for keyboard input via System.in.
        //
        //File: You can pass a file object to a Scanner to read its contents.
        //
        //String: You can use a Scanner to parse and read tokens directly from a string.
// NOTE  The default delimiter for a Scanner object is whitespace. This includes spaces, tabs, newlines, and carriage returns.


    }
}
