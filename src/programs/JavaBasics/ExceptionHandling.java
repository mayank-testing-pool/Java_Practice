package src.programs.JavaBasics;

public class ExceptionHandling {
    int a = 10;
    static ExceptionHandling obj;
    public  static void main (String [] args) {
        // Uncaught exception
        //int i = 9/0;
        //System.out.println( i );

        // Caught exception
        //Thread.sleep( 2000 );


        //ExceptionHandling obj = new ExceptionHandling();
        //obj = null;
        //System.out.println( obj.a );
        //System.out.println( obj );



        //Exception Handling
        //1 - Try Catch block
        try
        {
            int i = 9 / 0;      //This code will through exeption
        }
        catch (ArithmeticException e)
        {
           // e.printStackTrace();
            System.out.println( "This is catch block" );
            System.out.println( e.getMessage() );
        }



    }
}
