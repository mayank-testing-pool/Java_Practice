package src.programs.JavaBasics;

public class SuperKeywordConstructorB extends SuperKeywordConstructorA {

    public SuperKeywordConstructorB()
    {
        //Always use to call parent class constructor
        //Super keyword is the first statement
        super ();
        //super(10);
        //super(20,30);
        System.out.println( "Child Class Constructor" );
    }

    public SuperKeywordConstructorB(int i)
    {
        super(i);
        //super(20,30);
        System.out.println( "Child Class Constructor having one parameter" );
    }

    public SuperKeywordConstructorB(int i, int j)
    {
        //super(i);
        super(i,j);
        System.out.println( "Child Class Constructor having two parameter" );
    }

    public static void main (String [] args)
    {
        SuperKeywordConstructorB obj = new SuperKeywordConstructorB();
        SuperKeywordConstructorB obj1 = new SuperKeywordConstructorB(10);
        SuperKeywordConstructorB obj2 = new SuperKeywordConstructorB(20,30);
    }

}
