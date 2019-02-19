package src.programs.JavaBasics;

/**
 * Created by maheshwari.mayank on 17-02-2019.
 */
public class IncrementOrDecrementOperator {

    public static void main (String[]args)
    {
        int i=1;
        int j = i++;        //Post increment - first give the value of i to j then increment i by 1

        System.out.println("value of i in post increment "+i);
        System.out.println("value of j in post increment "+j);

        int a = 1;
        int b = ++a;        // Pre increment - first increment the value of a by 1 then give value of a to b

        System.out.println("value of a in pre increment " +a);
        System.out.println("value of b in pre increment "+b);

        int m = 2;
        int n = m--;        //Post Decrement

        System.out.println("value of m in post decrement "+m);
        System.out.println("value of n in post decrement "+n);

        int p = 2;
        int q = --p;        // pre decrement

        System.out.println("value of p in pre decrement "+p);
        System.out.println("value of q in pre decrement "+q);
    }
}
