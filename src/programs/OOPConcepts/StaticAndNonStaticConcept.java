package src.programs.OOPConcepts;

/**
 * Created by maheshwari.mayank on 19-02-2019.
 */
public class StaticAndNonStaticConcept {

    String name = "Tom";    //Non Static method
    static int age = 25;    // Static global variable and will be available across all the functions with same conditions

    public static void main (String [] args)
    {
        //How to call static methods and variables
        //1. direct call
        sum ();
        //2. Calling by class name
        StaticAndNonStaticConcept.sum();

        System.out.println(age);
        System.out.println(StaticAndNonStaticConcept.age);

        // How to call non static methods and variables by creating objects

        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        System.out.println(obj.name);
        obj.sendmail();

        //Can i access static method by using object refrence? Yes
        obj.sum();

    }

    public void sendmail ()              // Non static method
    {
        System.out.println ("This is non static sendmail method");
    }

    public static void sum ()
    {
        System.out.println(" Static Sum method");
    }
}
