package src.programs.OOPConcepts;

public class CallByValueAndCallByRef {

    int p;
    int q;
    public static void main (String [] args)
    {
        CallByValueAndCallByRef obj = new CallByValueAndCallByRef ();
        int x = 10;
        int y = 20;
        int z = obj.testSum(x,y );      //Call by value or Pass by Value
        System.out.println( z );

        obj.p = 50;
        obj.q = 60;

        System.out.println( "Value before swap" );
        System.out.println( obj.p );
        System.out.println( obj.q);

        obj.swap( obj );

        System.out.println( "Value after swap" );
        System.out.println( obj.p );
        System.out.println( obj.q);


    }

    public int testSum (int a,int b)
    {
        a = 30;
        b = 40;
        int c = a+b;
        return c;
    }

    // Call By Reference
    public void swap (CallByValueAndCallByRef t)
    {
        int temp;
        temp = t.p;     //temp = 50
        t.p = t.q;      //t.p = 60
        t.q = temp;     //t.q = 50
    }
}
