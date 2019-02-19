package src.programs.OOPConcepts;

/**
 * Created by maheshwari.mayank on 19-02-2019.
 */
public class LocalVsGlobalVariables {

    //Global Variables / Class Variable
    String name = "Tom";
    int age = 20;

    public static void main (String [] args)
    {
        int i = 10;     // Local Variables for main method
        //System.out.println(i);
        //System.out.println(age);  // Through Error as age is global variable. To aacess global variable we need to
        // create object of class
        LocalVsGlobalVariables obj = new LocalVsGlobalVariables ();
        System.out.println(obj.name);
        System.out.println(obj.age);


    }

    public void sum ()
    {
        int i = 10;     // Local variable for Sim method
        int j = 10;
        int age = 25;
    }
}
