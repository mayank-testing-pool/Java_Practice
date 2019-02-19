package src.programs.JavaBasics;

/**
 * Created by maheshwari.mayank on 16-02-2019.
 */
public class IfElseConcepts {

    public static void main (String[]args)
    {
        int a = 10;
        int b = 20;

        if (b>a)
        {
            System.out.println ("b is greater then a");
        }
        else
        {
            System.out.println ("a is greater then b");
        }

        // Comparision Operators
        // < > <= >= == !=
        int c = 40;
        int d = 40;
        if (c==d)
        {
            System.out.println ("c and d are equals");

        }
        else{
            System.out.println ("c and d are not equals");
        }
        // Write a logic to find a highest number
        int e = 100;
        int f = 200;
        int g = 300;

        e =400;
        f = 500;

        // nested if-else

        if (e>f & e>g)
        {
            System.out.println ("e is greatest number");
        }
        else if (f>g)
        {
            System.out.println ("f is greatest number");
        }
        else
        {
            System.out.print("g is greatest number");
        }

    }



}
