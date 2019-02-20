package src.programs.InheritanceConcept;

public class TestCar {

    public static void main (String[] args)
    {

        // Static Polymorphism or Compile time polymorphism
        BMW b = new BMW ();
        b.start();
        b.stop();
        b.refule();
        b.theftsafety();
        b.engine();

        System.out.println( "************" );

        Car c = new Car ();
        c.start();
        c.stop();
        c.refule();

        System.out.println( "************" );

        //Top Casting
        Car c1 = new BMW();         // child class object can be referred by parent class reference variable - Dynamic Polymorphism or Runtime Polymorphism
        c1.start();
        c1.stop();
        c1.refule();

        //Down Casting

        BMW b1 = (BMW)new Car();        //Through ClassCastException

    }
}
