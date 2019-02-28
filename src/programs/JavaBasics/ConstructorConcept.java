package src.programs.JavaBasics;

public class ConstructorConcept {

    // name should be as class name
    // will not return anything
    // Can be overload the constructor - Yes we can overload the constructor
    // Constructor will be called immediately after creation a object of class

    public static void main (String [] args)
    {
        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 = new ConstructorConcept(10);
        ConstructorConcept obj2 = new ConstructorConcept(20,30);
    }

    public ConstructorConcept()         //Default Constructor as it is having zero parameter
    {
        System.out.println( "Default constructor" );
    }

    public ConstructorConcept(int i)
    {
        System.out.println( "single parameter constructor" );
        System.out.println( "Value of i = " +i);
    }

    public ConstructorConcept(int i,int j)
    {
        System.out.println( "two parameter constructor" );
        System.out.println( "Value of i = " +i);
        System.out.println( "Value of j = " +j);
    }


}
