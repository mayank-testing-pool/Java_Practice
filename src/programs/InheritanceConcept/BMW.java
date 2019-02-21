package src.programs.InheritanceConcept;

public class BMW extends Car {              // "Has-a" relationship


    // When a method is present in parent class and child class having same  name and parameters as well is called method overriding.
    public void start ()        // Overridden method
    {
        System.out.println( "BMW----Start" );

    }

    public void theftsafety ()
    {
        System.out.println( "BMW----Theftsafety" );

    }


}

