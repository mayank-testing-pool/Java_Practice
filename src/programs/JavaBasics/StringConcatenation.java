package src.programs.JavaBasics;

import java.util.Stack;

/**
 * Created by maheshwari.mayank on 16-02-2019.
 */
public class StringConcatenation {

    public static void main (String[]args)
    {
        int a = 100;
        int b = 200;
        String s = "hello";
        String t = "world";
        double c = 12.45;
        double d = 12.33;

        System.out.println(a+b);    //Output will be 300
        System.out.println(s+t);    //Output will be helloworld
        System.out.println(a+b+s+t);    //Output will be 300helloworld
        System.out.println(s+t+a+b);    //Output will be helloworld100200
        System.out.println(s+t+(a+b));  //Output will be helloworld300
        System.out.println(a+b+s+t+s+a+t+b);    // Output will be 300helloworldhello100world200
        System.out.println(c+d);                // Output will be 24.78
        System.out.println(s+t+c+d);            // Output will be helloworld12.4512.33
        System.out.println(c+d+s+t);            // Output will be 24.78helloworld
        System.out.println("Value of a is "+a);
        System.out.println("Value of a is "+s);
        System.out.println("Value of a is "+c);
        System.out.println("Addition of a and c is "+(a+c));
        System.out.println("Concatenation of all variables are "+a+b+s+t+c+d);

    }
}
