package src.programs.OOPConcepts;

/**
 * Created by maheshwari.mayank on 19-02-2019.
 */
public class MethodOverloading {

    public static void main (String [] args)
    {
        MethodOverloading obj = new MethodOverloading ();
        obj.sum();
        obj.sum(10);
        obj.sum(20,30);
    }

        // we can also overload main method
    public void main (int p, int q)
    {

    }
       // When method name is same but different input parameters with is same class or different data types
    public void sum ()      //0 Input parameters
    {
        System.out.println("This is sum method having 0 inputs");
    }

    public  void sum (int i)        //1 Input parameters
    {
        System.out.println("This is sum method having 1 inputs");
        System.out.println (i);
    }

    public void sum (int a, int b)      //2 Input parameters
    {
        System.out.println("This is sum method having 2 inputs");
        System.out.println (a+b);

    }
}
