package src.programs.JavaBasics;

public class ThrowsKeyword {

    public static void main (String [] args) //throws ArithmeticException
    {
        ThrowsKeyword obj = new ThrowsKeyword();
        obj.sum();
        System.out.println( "This is Throws Keyword" );
    }

    public void sum() //throws ArithmeticException
    {
       try {
           div ();
       }
       //catch (ArithmeticException e)
       //catch (Exception e)
       //catch (Error e)
       //catch (Throwable e)
           catch (Throwable e)
        {

        }

    }

    public  void div () //throws ArithmeticException
    {
        int i = 9/0;        //Through Exception
    }
}
