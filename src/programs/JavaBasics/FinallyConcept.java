package src.programs.JavaBasics;

public class FinallyConcept {
    //Finally is a block and use with try catch
    //finally is a block and will executed always


    public static void main  (String [] str)
    {
        //test1();
        //test2();
        division();
        division2();
    }

    public static void test1 ()
    {
        try
        {
            System.out.println( "Inside test1 method");
            throw new RuntimeException( "test" );
        }
        catch (Exception e)
        {
            System.out.println( "Inside catch block" );

        }
        finally {
            System.out.println( "inside finally block" );
        }
    }

    public static void test2()
    {
        try{
            System.out.println( "Inside test2" );
        }
        finally {
            System.out.println( "Finally code in test2 method" );

        }
    }

    public static void division()
    {
        int i = 10;
        try {
            System.out.println( "inside try block" );
            int k = i/0;                //cant divide any value by 0
        }
        catch (ArithmeticException e)
        {
            System.out.println( "Inside catch block" );
            System.out.println( "Devide by zero error" );
        }

        finally
        {
            System.out.println( "Execute this code even after any exception" );
        }
    }

    public static void division2()
    {
        int i = 10;
        try {
            System.out.println( "inside try block" );
            int k = i/2;                //cant devide any value by 0
        }
        catch (NullPointerException e)
        {
            System.out.println( "Inside catch block" );
            System.out.println( "Divide by zero error" );
        }

        finally
        {
            System.out.println( "Execute this code even after any exception" );
        }
    }

}
